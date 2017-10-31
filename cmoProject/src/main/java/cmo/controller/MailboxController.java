package cmo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cmo.frontend.dao.ApprovalReportFEDAO;
import cmo.frontend.dao.FeedbackReportFEDAO;
import cmo.frontend.dao.OrderFEDAO;
import cmo.frontend.dao.ReportFEDAO;

@RestController
public class MailboxController {

	@Autowired
	private ReportFEDAO reportDAO;
	@Autowired
	private ApprovalReportFEDAO approvalDAO;
	@Autowired private FeedbackReportFEDAO feedbackDAO;

	@GetMapping("/ajax/analyst/{reportId}")
	public ResponseEntity<?> analyst(@PathVariable("reportId") long reportId, ModelMap model) {
		return new ResponseEntity<Object>(reportDAO.getByReportId(reportId), HttpStatus.OK);
	}

	@GetMapping("/ajax/ef/from/{feedbackReportId}")
	public ResponseEntity<?> ef(@PathVariable("feedbackReportId") long feedbackReportId, ModelMap model) {
		return new ResponseEntity<Object>(feedbackDAO.getByFeedbackReportId(feedbackReportId), HttpStatus.OK);
	}

	public void messageList(Model model, String page) {
		if (page.equals("analyst"))
			analystList(model);
		else if (page.equals("ef")) {
			efListFeedback(model);
		}
	}

	private void analystList(Model model) {
		model.addAttribute("messageList", reportDAO.getAll());
	}
	
	private void efListFeedback(Model model) {
		model.addAttribute("messageList", feedbackDAO.getAll());
	}

	private void generalList(Model model) {
		model.addAttribute("messageList", approvalDAO.getAllReports());
	}
}

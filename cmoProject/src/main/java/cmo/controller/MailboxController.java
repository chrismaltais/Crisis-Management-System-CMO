package cmo.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cmo.entities.ApprovalReport;
import cmo.frontend.dao.ApprovalReportFEDAO;
import cmo.frontend.dao.CallReportFEDAO;
import cmo.frontend.dao.FeedbackReportFEDAO;
import cmo.frontend.dao.ReportFEDAO;
import cmo.pdf.PDFConverter;

@RestController
public class MailboxController {

	@Autowired
	private ReportFEDAO reportDAO;
	@Autowired
	private ApprovalReportFEDAO approvalDAO;
	@Autowired
	private FeedbackReportFEDAO feedbackDAO;
	@Autowired
	private CallReportFEDAO callreportDAO;
	@Resource(name="approvalPDF")
	PDFConverter pdfConverter;

	@GetMapping("/ajax/analyst/{reportId}")
	public ResponseEntity<?> analyst(@PathVariable("reportId") long reportId, ModelMap model) {
		return new ResponseEntity<Object>(reportDAO.getByReportId(reportId), HttpStatus.OK);
	}

	@GetMapping("/ajax/ef/from/{feedbackReportId}")
	public ResponseEntity<?> ef(@PathVariable("feedbackReportId") long feedbackReportId, ModelMap model) {
		return new ResponseEntity<Object>(feedbackDAO.getByFeedbackReportId(feedbackReportId), HttpStatus.OK);
	}

	@GetMapping("/ajax/911/{callReportId}")
	public ResponseEntity<?> nineoneone(@PathVariable("callReportId") long callReportId, ModelMap model) {
		return new ResponseEntity<Object>(callreportDAO.getReport(callReportId), HttpStatus.OK);
	}

	@GetMapping("/ajax/general/{crisisId}")
	public ResponseEntity<?> approvalReport(@PathVariable("crisisId") long crisisId, ModelMap model){
		ApprovalReport report = approvalDAO.getReportByCrisisId(crisisId);
		String reportURI = pdfConverter.convertToPdf(report);
		
		System.out.println("reportURI: " + reportURI);
		
		class ApprovalReportDTO{
			private long crisisID;
			private String reportURI;
			public long getCrisisID() {
				return crisisID;
			}
			public String getReportURI() {
				return reportURI;
			}
			public void setCrisisID(long crisisID) {
				this.crisisID = crisisID;
			}
			public void setReportURI(String reportURI) {
				this.reportURI = reportURI;
			}
			
		}
		
		ApprovalReportDTO dto = new ApprovalReportDTO();
		dto.setCrisisID(report.getCrisisID());
		dto.setReportURI(reportURI);
		
		return new ResponseEntity<ApprovalReportDTO>(dto,HttpStatus.OK);
		
	}

	public void messageList(Model model, String page) {
		if (page.equals("analyst"))
			analystList(model);
		else if (page.equals("911"))
			nineoneoneList(model);
		else if (page.equals("ef"))
			efListFeedback(model);
		else if (page.equals("general"))
			generalList(model);
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

	private void nineoneoneList(Model model) {
		model.addAttribute("messageList", callreportDAO.getAll());
	}
}

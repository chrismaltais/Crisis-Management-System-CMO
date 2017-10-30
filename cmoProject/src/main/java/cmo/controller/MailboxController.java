package cmo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import cmo.entities.Report;
import cmo.frontend.dao.ReportFEDAO;

@RestController
public class MailboxController {

	@Autowired
	ReportFEDAO dao;

	@GetMapping("/ajax/analyst/{reportId}")
	public ResponseEntity<?> analyst(@PathVariable("reportId") long reportId, ModelMap model) {
		return new ResponseEntity<Report>(dao.getByReportId(reportId), HttpStatus.OK);
	}
	
	public void messageList(Model model, String page) {
		if (page.equals("analyst"))
			analystList(model);
	}
	
	private void analystList(Model model) {
		model.addAttribute("messageList", dao.getAll());
	}
}

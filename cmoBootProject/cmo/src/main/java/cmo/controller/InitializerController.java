package cmo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import cmo.repository.OrderRepository;
import cmo.repository.ProposalRepository;
import cmo.tony.ApprovalReportRepository;
import cmo.tony.CallReportRepository;
import cmo.tony.FeedbackReportRepository;
import cmo.tony.ReportRepository;

@Controller
public class InitializerController {
	
	// All repositories
	@Autowired ApprovalReportRepository approval;
	@Autowired CallReportRepository call;
	@Autowired FeedbackReportRepository feedback;
	@Autowired OrderRepository order;
	@Autowired ProposalRepository proposal;
	@Autowired ReportRepository report;	

	@GetMapping("/initialize")
	public String initialize() {
		// Initializes and populates database
		// Hard-coded
		
		
		
		return "redirect:/";
	}
}

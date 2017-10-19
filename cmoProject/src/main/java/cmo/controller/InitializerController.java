package cmo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cmo.entities.ApprovalReport;
import cmo.entities.CallReport;
import cmo.entities.FeedbackReport;
import cmo.repository.ApprovalReportRepository;
import cmo.repository.CallReportRepository;
import cmo.repository.FeedbackReportRepository;
import cmo.repository.OrderRepository;
import cmo.repository.ProposalRepository;
import cmo.repository.ReportRepository;

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
		
		// ApprovalReportRepository
		ApprovalReport approvalEntity = new ApprovalReport();
		approvalEntity.setCrisisID(1);
		approvalEntity.setPdfBase64("Sample PDF".getBytes());
		approval.save(approvalEntity);
		
		// CallReportRepository
		CallReport callEntity = new CallReport();
		callEntity.setCrisisID(2);
		callEntity.setName("Alpha");
		callEntity.setPositionIn911("caller");
		callEntity.setCrisisType("android attack");
		callEntity.setAffectedArea("Orchard");
		callEntity.setCrisisDate("1/5/2016");
		callEntity.setEstimatedStartTime("5.21pm");
		callEntity.setCrisisDetails("There's a lot of android swarming.");
		call.save(callEntity);
		
		// FeedbackReportRepository
		FeedbackReport feedbackEntity = new FeedbackReport();
		feedbackEntity.setCrisisID(3);
		feedbackEntity.setName("Bravo");
		feedbackEntity.setPositionInEF("Soldier");
		feedbackEntity.setThreatLevel(3);
		feedbackEntity.setCasualtiesRescued(56);
		feedbackEntity.setDeploymentStatus("ongoing");
		feedbackEntity.setSituationStatus("High alert");
		feedback.save(feedbackEntity);
		
		return "redirect:/";
	}
	
	@ResponseBody
	@GetMapping("/getReportHL")
	public String gettingReport() {
		ApprovalReport reportEntity;
		try{
			reportEntity = approval.findByCrisisID(1);
			String msg = reportEntity.getCrisisID() + " : ";
			msg += new String(reportEntity.getPdfBase64());
			return msg;
		} catch (Exception e) {
			return "Report not retrieved.";
		}
	}
}

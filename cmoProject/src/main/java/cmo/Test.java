package cmo;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cmo.entities.ApprovalReport;
import cmo.entities.CallReport;
import cmo.entities.FeedbackReport;
import cmo.entities.GeneralOrder;
import cmo.entities.Proposal;
import cmo.entities.Report;
import cmo.repository.ApprovalReportRepository;
import cmo.repository.CallReportRepository;
import cmo.repository.FeedbackReportRepository;
import cmo.repository.OrderRepository;
import cmo.repository.ProposalRepository;
import cmo.repository.ReportRepository;

@RestController
public class Test implements CommandLineRunner {

	@GetMapping("/testGet")
	public Object returningStuff(){
		CallReport newReport = new CallReport();
		newReport.setCrisisID(1);
		newReport.setName("Another");
		callRepo.save(newReport);
		
		return callRepo.findByCrisisID(1);
	}
	
	@GetMapping("/testGet/all")
	public List<?> returningStuff2(){
		return callRepo.findByCrisisIDOrderByCallReportIDDesc(1);
	}
	
	//////////////////////////////////////////////////
	@Autowired ApprovalReportRepository approvalRepo;
	@Autowired CallReportRepository callRepo;
	@Autowired FeedbackReportRepository feedbackRepo;
	@Autowired OrderRepository orderRepo;
	@Autowired ProposalRepository proposalRepo;
	@Autowired ReportRepository reportRepo;
	
	@Override
	public void run(String... args) throws Exception {
		// Populate ApprovalReport
		
		ApprovalReport approvalReport = new ApprovalReport();
		approvalReport.setCrisisID(1);
		approvalReport.setPdfBase64(Base64.getEncoder().encode("Hello World PDF".getBytes()));
		
		approvalRepo.save(approvalReport);
		
		// Populate CallReport
		
		CallReport callReport = new CallReport();
		callReport.setCrisisID(1);
		callReport.setName("caller 1");
		callReport.setPositionIn911("caller");
		callReport.setCrisisType("Android Invasion");
		callReport.setAffectedArea("Orchard Road");
		callReport.setCrisisDate("15/5/2017");
		callReport.setEstimatedStartTime("2.25 PM");
		callReport.setCrisisDetails("Mass Panic");
		
		callRepo.save(callReport);
		
		// Populate FeedbackReport
		
		FeedbackReport feedbackReport = new FeedbackReport();
		feedbackReport.setCrisisID(1);
		feedbackReport.setName("Hawks");
		feedbackReport.setPositionInEF("Operator");
		feedbackReport.setThreatLevel(4);
		feedbackReport.setCasualtiesRescued(123);
		feedbackReport.setDeploymentStatus("ongoing");
		feedbackReport.setSituationStatus("Multiple Casualties");
		
		feedbackRepo.save(feedbackReport);
		
		// Populate Order
		
		GeneralOrder order = new GeneralOrder();
		order.setCrisisID(1);
		order.setName("General");
		order.setPositionInCMO("General");
		order.setThreatLevel(4);
		order.setCrisisType("Android Invasion");
		order.setAffectedArea("Orchard Road");
		order.setCrisisDetails("Mass Panic");
		order.setCouseofAction("Sending troops");
		
		orderRepo.save(order);
		
		// Populate Proposal
		
		Proposal proposal = new Proposal();
		proposal.setCrisisID(1);
		proposal.setName("Septua");
		proposal.setPositionInCMO("Operator");
		proposal.setThreatLevel(4);
		proposal.setAffectedArea("Orchard Road");
		proposal.setEstimatedCasualties(1542);
		proposal.setCrisisDetails("Mass Panic");
		proposal.setCourseOfAction("Sending troops");
		proposal.setConsequencesOfAction("TBC");
		proposal.setCleanUpAction("TBC");
		
		proposalRepo.save(proposal);
		
		// Populate Report
		
		Report report = new Report();
		report.setCrisisID(1);
		report.setPositionInCMO("General");
		report.setThreatLevel(4);
		report.setAffectedAreas("Orchard Road");
		report.setEstimatedCasualties(1236);
		report.setCourseOfActions("Sending troops");
		report.setConsequencesOfAction("TBC");
		
		reportRepo.save(report);
		
		System.err.println("DB populated.");
	}

}

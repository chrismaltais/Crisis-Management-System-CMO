package cmo;

import java.net.URI;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cmo.entities.ApprovalReport;
import cmo.entities.CallReport;
import cmo.entities.EFOrder;
import cmo.entities.FeedbackReport;
import cmo.entities.Proposal;
import cmo.entities.Report;
import cmo.frontend.dao.ProposalFEDAO;
import cmo.pdf.PDFConverter;
import cmo.pdf.PDFConverterApprovalReport;
import cmo.repository.ApprovalReportRepository;
import cmo.repository.CallReportRepository;
import cmo.repository.FeedbackReportRepository;
import cmo.repository.OrderRepository;
import cmo.repository.ProposalRepository;
import cmo.repository.ReportRepository;

@RestController
public class Test implements CommandLineRunner {

	@GetMapping("/testGet")
	public List<?> returningStuff(){
		return callRepo.findAll();
	}
	@Autowired ProposalFEDAO proposalDAO;
	
	@GetMapping("/testPMO")
	public String sendToPMO() {
		String URI = "http://10.27.199.49:8080/CMOtoPMO/proposal/";
		RestTemplate rest = new RestTemplate();
		Proposal proposal = proposalDAO.getByProposalId(1);
//		Proposal o = new Proposal();
//		o.setCrisisID(342);
//		o.setName("Hawks");
		rest.postForEntity(URI, proposal, String.class);
		return "done";
	}


	public static void main(String[] args) {
		String medium;
		PDFConverter converter = new PDFConverterApprovalReport();
		
		ApprovalReport report = new ApprovalReport();
		report.setCrisisID(1);
		converter.convertToByteArray(report, "sampleFile.pdf");
		
		String location;
		location = converter.convertToPdf(report);
		
		System.out.println(location);
	}
	
	//////////////////////////////////////////////////
	@Autowired ApprovalReportRepository approvalRepo;
	@Autowired CallReportRepository callRepo;
	@Autowired FeedbackReportRepository feedbackRepo;
	@Autowired OrderRepository orderRepo;
	@Autowired ProposalRepository proposalRepo;
	@Autowired ReportRepository reportRepo;
	@Resource(name="approvalPDF") PDFConverter<ApprovalReport> pdfConverter;
	
	@Override
	public void run(String... args) throws Exception {
		// Populate ApprovalReport
		
		ApprovalReport approvalReport = new ApprovalReport();
		approvalReport.setCrisisID(1);
		pdfConverter.convertToByteArray(approvalReport, "sampleFile.pdf");
		
		approvalRepo.save(approvalReport);
		
		// Populate CallReport
		
		CallReport callReport = new CallReport();
		callReport.setCrisisID(1);
		callReport.setName("caller 1");
		callReport.setPositionIn911("caller");
		callReport.setCrisisType("Android Invasion");
		callReport.setAffectedArea("Boat Quay/1.2859963/103.85016080000003");
		callReport.setCrisisDate("15/5/2017");
		callReport.setEstimatedStartTime("2.25 PM");
		callReport.setCrisisDetails("Mass Panic");
		callRepo.save(callReport);
		
		CallReport call2 = new CallReport();
		call2.setCrisisID(1);
		call2.setAffectedArea("Orchard Road/1.3017996/103.83779709999999");
		callRepo.save(call2);
		
		CallReport call3 = new CallReport();
		call3.setCrisisID(2);
		call3.setAffectedArea("Sentosa Siloso Beach/1.2545582/103.81477870000003");
		callRepo.save(call3);
		
		CallReport callReport4 = new CallReport();
		callReport.setCrisisID(1);
		callReport.setName("Jason Redric");
		callReport.setPositionIn911("911 LO");
		callReport.setCrisisType("Stabbing");
		callReport.setAffectedArea("NTU/1.3483/103.6831");
		callReport.setCrisisDate("04/11/2017");
		callReport.setEstimatedStartTime("11:00 PM");
		callReport.setCrisisDetails("Lockdown School");
		callRepo.save(callReport4);
		
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
		
		FeedbackReport feedbackReport2 = new FeedbackReport();
		feedbackReport.setCrisisID(1);
		feedbackReport.setName("Leena Jones");
		feedbackReport.setPositionInEF("Operator");
		feedbackReport.setThreatLevel(4);
		feedbackReport.setCasualtiesRescued(15);
		feedbackReport.setDeploymentStatus("Closed");
		feedbackReport.setSituationStatus("Crisis Cleaned Up");
		feedbackRepo.save(feedbackReport2);
		
		FeedbackReport feedbackReport3 = new FeedbackReport();
		feedbackReport.setCrisisID(1);
		feedbackReport.setName("Justin Xing");
		feedbackReport.setPositionInEF("Operator");
		feedbackReport.setThreatLevel(2);
		feedbackReport.setCasualtiesRescued(2);
		feedbackReport.setDeploymentStatus("Closed");
		feedbackReport.setSituationStatus("Bomb squad neutralized suitcase");
		feedbackRepo.save(feedbackReport3);
		
		FeedbackReport feedbackReport4 = new FeedbackReport();
		feedbackReport.setCrisisID(1);
		feedbackReport.setName("Ashley Doe");
		feedbackReport.setPositionInEF("Operator");
		feedbackReport.setThreatLevel(3);
		feedbackReport.setCasualtiesRescued(10);
		feedbackReport.setDeploymentStatus("Closed");
		feedbackReport.setSituationStatus("Armed robber seized");
		feedbackRepo.save(feedbackReport4);
		
		// Populate Order
		
		EFOrder order = new EFOrder();
		order.setCrisisID(1);
		order.setName("General");
		order.setPositionInCMO("General");
		order.setThreatLevel(4);
		order.setCrisisType("Android Invasion");
		order.setAffectedArea("Orchard Road");
		order.setCrisisDetails("Mass Panic");
		order.setCourseofAction("Sending troops");
		orderRepo.save(order);
		
		EFOrder order2 = new EFOrder();
		order.setCrisisID(1);
		order.setName("Gab Wong");
		order.setPositionInCMO("General");
		order.setThreatLevel(3);
		order.setCrisisType("Multiple Stabbings");
		order.setAffectedArea("NTU");
		order.setCrisisDetails("Lockdown School");
		order.setCourseofAction("Sending troops, secure area");
		orderRepo.save(order2);
		
		EFOrder order3 = new EFOrder();
		order.setCrisisID(1);
		order.setName("Tristan Smith");
		order.setPositionInCMO("Analyst");
		order.setThreatLevel(2);
		order.setCrisisType("Armed Robbery");
		order.setAffectedArea("Jurong West");
		order.setCrisisDetails("Surround Mall");
		order.setCourseofAction("Ensure nobody leaves suspiciously");
		orderRepo.save(order3);
		
		EFOrder order4 = new EFOrder();
		order.setCrisisID(1);
		order.setName("Tony Strawy");
		order.setPositionInCMO("Analyst");
		order.setThreatLevel(4);
		order.setCrisisType("Terrorist Threat");
		order.setAffectedArea("Changi Airport");
		order.setCrisisDetails("Suspiscious Luggage at Terminal 1");
		order.setCourseofAction("Send in bob squad, secure the luggage");
		orderRepo.save(order4);
		
		// Populate Proposal
		
		Proposal proposal = new Proposal();
		proposal.setCrisisID(154);
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
		
		Proposal proposal2 = new Proposal();
		proposal.setCrisisID(154);
		proposal.setName("Septua");
		proposal.setPositionInCMO("Operator");
		proposal.setThreatLevel(4);
		proposal.setAffectedArea("Orchard Road");
		proposal.setEstimatedCasualties(1542);
		proposal.setCrisisDetails("Mass Panic");
		proposal.setCourseOfAction("Sending troops");
		proposal.setConsequencesOfAction("TBC");
		proposal.setCleanUpAction("TBC");
		proposalRepo.save(proposal2);
		
		Proposal proposal3 = new Proposal();
		proposal.setCrisisID(154);
		proposal.setName("Septua");
		proposal.setPositionInCMO("Operator");
		proposal.setThreatLevel(4);
		proposal.setAffectedArea("Orchard Road");
		proposal.setEstimatedCasualties(1542);
		proposal.setCrisisDetails("Mass Panic");
		proposal.setCourseOfAction("Sending troops");
		proposal.setConsequencesOfAction("TBC");
		proposal.setCleanUpAction("TBC");
		proposalRepo.save(proposal3);
		
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
		
		Report report2 = new Report();
		report2.setCrisisID(2);
		report2.setPositionInCMO("General");
		report2.setThreatLevel(3);
		report2.setAffectedAreas("NTU");
		report2.setEstimatedCasualties(42);
		report2.setCourseOfActions("Recovery Effort");
		report2.setConsequencesOfAction("TBC");
		
		reportRepo.save(report2);
		
		System.err.println("DB populated.");
	}

}

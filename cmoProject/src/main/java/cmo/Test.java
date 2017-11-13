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
		call2.setCrisisID(2);
		call2.setAffectedArea("Orchard Road/1.3017996/103.83779709999999");
		callRepo.save(call2);
		
		CallReport call3 = new CallReport();
		call3.setCrisisID(3);
		call3.setAffectedArea("Sentosa Siloso Beach/1.2545582/103.81477870000003");
		callRepo.save(call3);
		
		CallReport callReport4 = new CallReport();
		callReport4.setCrisisID(4);
		callReport4.setName("Jason Redric");
		callReport4.setPositionIn911("911 LO");
		callReport4.setCrisisType("Stabbing");
		callReport4.setAffectedArea("NTU/1.3483/103.6831");
		callReport4.setCrisisDate("04/11/2017");
		callReport4.setEstimatedStartTime("11:00 PM");
		callReport4.setCrisisDetails("Lockdown School");
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
		feedbackReport2.setCrisisID(2);
		feedbackReport2.setName("Leena Jones");
		feedbackReport2.setPositionInEF("Operator");
		feedbackReport2.setThreatLevel(4);
		feedbackReport2.setCasualtiesRescued(15);
		feedbackReport2.setDeploymentStatus("Closed");
		feedbackReport2.setSituationStatus("Crisis Cleaned Up");
		feedbackRepo.save(feedbackReport2);
		
		FeedbackReport feedbackReport3 = new FeedbackReport();
		feedbackReport3.setCrisisID(3);
		feedbackReport3.setName("Justin Xing");
		feedbackReport3.setPositionInEF("Operator");
		feedbackReport3.setThreatLevel(2);
		feedbackReport3.setCasualtiesRescued(2);
		feedbackReport3.setDeploymentStatus("Closed");
		feedbackReport3.setSituationStatus("Bomb squad neutralized suitcase");
		feedbackRepo.save(feedbackReport3);
		
		FeedbackReport feedbackReport4 = new FeedbackReport();
		feedbackReport4.setCrisisID(4);
		feedbackReport4.setName("Ashley Doe");
		feedbackReport4.setPositionInEF("Operator");
		feedbackReport4.setThreatLevel(3);
		feedbackReport4.setCasualtiesRescued(10);
		feedbackReport4.setDeploymentStatus("Closed");
		feedbackReport4.setSituationStatus("Armed robber seized");
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
		order2.setCrisisID(2);
		order2.setName("Gab Wong");
		order2.setPositionInCMO("General");
		order2.setThreatLevel(3);
		order2.setCrisisType("Multiple Stabbings");
		order2.setAffectedArea("NTU");
		order2.setCrisisDetails("Lockdown School");
		order2.setCourseofAction("Sending troops, secure area");
		orderRepo.save(order2);
		
		EFOrder order3 = new EFOrder();
		order3.setCrisisID(3);
		order3.setName("Tristan Smith");
		order3.setPositionInCMO("Analyst");
		order3.setThreatLevel(2);
		order3.setCrisisType("Armed Robbery");
		order3.setAffectedArea("Jurong West");
		order3.setCrisisDetails("Surround Mall");
		order3.setCourseofAction("Ensure nobody leaves suspiciously");
		orderRepo.save(order3);
		
		EFOrder order4 = new EFOrder();
		order4.setCrisisID(4);
		order4.setName("Tony Strawy");
		order4.setPositionInCMO("Analyst");
		order4.setThreatLevel(4);
		order4.setCrisisType("Terrorist Threat");
		order4.setAffectedArea("Changi Airport");
		order4.setCrisisDetails("Suspiscious Luggage at Terminal 1");
		order4.setCourseofAction("Send in bob squad, secure the luggage");
		orderRepo.save(order4);
		
		// Populate Proposal
		
		Proposal proposal = new Proposal();
		proposal.setCrisisID(154);
		proposal.setName("Hock Leng");
		proposal.setPositionInCMO("Analyst");
		proposal.setThreatLevel(3);
		proposal.setAffectedArea("Haji Lane");
		proposal.setEstimatedCasualties(13);
		proposal.setCrisisDetails("Terrorist Attack");
		proposal.setCourseOfAction("Sending troops");
		proposal.setConsequencesOfAction("TBC");
		proposal.setCleanUpAction("TBC");
		proposalRepo.save(proposal);
		
		Proposal proposal2 = new Proposal();
		proposal2.setCrisisID(156);
		proposal2.setName("Chris Maltais");
		proposal2.setPositionInCMO("Environmental Analyst");
		proposal2.setThreatLevel(4);
		proposal2.setAffectedArea("Orchard Road");
		proposal2.setEstimatedCasualties(1542);
		proposal2.setCrisisDetails("Earthquake");
		proposal2.setCourseOfAction("Sending firfighters/ambulances");
		proposal2.setConsequencesOfAction("TBC");
		proposal2.setCleanUpAction("Redirect traffic to safer area");
		proposalRepo.save(proposal2);
		
		Proposal proposal3 = new Proposal();
		proposal3.setCrisisID(157);
		proposal3.setName("Mairead Matthews");
		proposal3.setPositionInCMO("Analyst");
		proposal3.setThreatLevel(4);
		proposal3.setAffectedArea("NTU");
		proposal3.setEstimatedCasualties(1542);
		proposal3.setCrisisDetails("Cannibalism at North Spine");
		proposal3.setCourseOfAction("Military being dispatched");
		proposal3.setConsequencesOfAction("Many students eaten if not aided");
		proposal3.setCleanUpAction("Ambulances to surround aread");
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

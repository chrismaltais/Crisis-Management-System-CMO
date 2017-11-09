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
		
		EFOrder order = new EFOrder();
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

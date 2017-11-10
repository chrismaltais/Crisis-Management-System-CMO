package cmo.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cmo.entities.ApprovalReport;
import cmo.frontend.dao.ApprovalReportFEDAO;
import cmo.frontend.dao.CallReportFEDAO;
import cmo.frontend.dao.FeedbackReportFEDAO;
import cmo.frontend.dao.ProposalFEDAO;
import cmo.pdf.PDFConverter;
import cmo.tony.CMOPMOClient;

@RestController
public class MailboxController {

	@Autowired
	private ProposalFEDAO proposalDAO;
	@Autowired
	private ApprovalReportFEDAO approvalDAO;
	@Autowired
	private FeedbackReportFEDAO feedbackDAO;
	@Autowired
	private CallReportFEDAO callreportDAO;

	@Resource(name = "approvalPDF")
	private PDFConverter<ApprovalReport> pdfConverter;
	
	@GetMapping("/sendProposal/{proposalId}") @ResponseBody
	private ResponseEntity<?> sendProposal(@PathVariable("proposalId") long proposalId){
		boolean success = CMOPMOClient.createProposal(proposalDAO.getByProposalId(proposalId));
		return new ResponseEntity<String>((success ? "Proposal sent" : "Fail to send"), HttpStatus.OK);
	}

	@GetMapping("/ajax/proposalFromAnalyst/{proposalId}")
	public ResponseEntity<?> analyst(@PathVariable("proposalId") long proposalId, ModelMap model) {
		return new ResponseEntity<Object>(proposalDAO.getByProposalId(proposalId), HttpStatus.OK);
	}

	@GetMapping("/ajax/ef/from/{feedbackReportId}")
	public ResponseEntity<?> ef(@PathVariable("feedbackReportId") long feedbackReportId, ModelMap model) {
		return new ResponseEntity<Object>(feedbackDAO.getByFeedbackReportId(feedbackReportId), HttpStatus.OK);
	}

	@GetMapping("/ajax/911/{callReportId}")
	public ResponseEntity<?> nineoneone(@PathVariable("callReportId") long callReportId, ModelMap model) {
		return new ResponseEntity<Object>(callreportDAO.getReport(callReportId), HttpStatus.OK);
	}

	@GetMapping({"/ajax/general/{crisisId}", "/ajax/fromPMO/{crisisId}"})
	public ResponseEntity<?> approvalReport(@PathVariable("crisisId") long crisisId, ModelMap model) {
		ApprovalReport report = approvalDAO.getReportByCrisisId(crisisId);
		String reportURI = pdfConverter.convertToPdf(report);

		class ApprovalReportDTO {
			private long crisisID;
			private String reportURI;

			public long getCrisisID() {
				return crisisID;
			}

			public void setCrisisID(long crisisID) {
				this.crisisID = crisisID;
			}

			public String getReportURI() {
				return reportURI;
			}

			public void setReportURI(String reportURI) {
				this.reportURI = reportURI;
			}

		}

		ApprovalReportDTO dto = new ApprovalReportDTO();
		dto.setCrisisID(report.getCrisisID());
		dto.setReportURI(reportURI);

		return new ResponseEntity<ApprovalReportDTO>(dto, HttpStatus.OK);

	}

	public void messageList(Model model, String page) {
		if (page.equals("analyst"))
			analystList(model);
		else if (page.equals("911"))
			nineoneoneList(model);
		else if (page.equals("ef"))
			efListFeedback(model);
		else if (page.equals("general"))
			generalListForAnalyst(model);
		else if (page.equals("pmo"))
			pmoListForGeneral(model);
	}

	private void analystList(Model model) {
		model.addAttribute("messageList", proposalDAO.getAll());
	}

	private void efListFeedback(Model model) {
		model.addAttribute("messageList", feedbackDAO.getAll());
	}

	private void generalListForAnalyst(Model model) {
		model.addAttribute("messageList", approvalDAO.getAllAnalysisReadableReports());
	}

	private void nineoneoneList(Model model) {
		model.addAttribute("messageList", callreportDAO.getAll());
	}
	
	private void pmoListForGeneral(Model model) {
		model.addAttribute("messageList", approvalDAO.getAllReports());
	}
	
}

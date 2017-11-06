package cmo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cmo.entities.EFOrder;
import cmo.entities.Proposal;
import cmo.frontend.dao.OrderFEDAO;
import cmo.frontend.dao.ProposalFEDAO;

@Controller
@RequestMapping("/formSubmission")
public class FormController {

	@Autowired
	private OrderFEDAO orderDAO;
	
	@PostMapping("/efOrders")
	public String createEFOrder(@ModelAttribute EFOrder order, RedirectAttributes redirect) {
		order = orderDAO.saveNewOrder(order);
		
		// Send to EF function MISSING
		
		// Please add function above
		boolean success = true;
		
		String message = "<script>alert('";
		message += success ? "EF Order " + order.getEfOrderID() + " sent successfully." : "Error sending.";
		message += "');</script>";
		redirect.addFlashAttribute("messageContent", message);
		return "redirect:/pages/create_order";
	}
	
	@Autowired
	private ProposalFEDAO proposalDAO;
	
	@PostMapping("/proposal")
	public String createProposal(@ModelAttribute Proposal proposal, RedirectAttributes redirect) {
		proposal = proposalDAO.saveNewProposal(proposal);
		
		// Send to PMO function MISSING
		
		// Please add function above
		boolean success = true;
		
		String message = "<script>alert('";
		message += success ? "Proposal " + proposal.getProposalID() + " sent successfully." : "Error sending.";
		message += "');</script>";
		redirect.addFlashAttribute("messageContent", message);
		return "redirect:/pages/create_proposal";
	}
}

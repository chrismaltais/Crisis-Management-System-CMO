package cmo.frontend.dao.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cmo.entities.Proposal;
import cmo.frontend.dao.ProposalFEDAO;
import cmo.repository.ProposalRepository;

@Service
public class PFEDAO implements ProposalFEDAO {
	
	@Autowired
	private ProposalRepository repo;

	@Override
	public Proposal getByProposalId(long proposalId) {
		Proposal proposal = repo.findByProposalID(proposalId);
		proposal.setRead(true);
		repo.save(proposal);
		return repo.findByProposalID(proposalId);
	}

	@Override
	public List<Proposal> getAll() {
		return repo.findAll();
	}

	@Override
	public List<Proposal> getAllByCrisisId(long crisisId) {
		return repo.findByCrisisIDOrderByCrisisIDDesc(crisisId);
	}

}

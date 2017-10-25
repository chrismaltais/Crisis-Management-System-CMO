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
	public Proposal getByCrisisId(long crisisId) {
		return repo.findByCrisisID(crisisId);
	}

	@Override
	public List<Proposal> getAll() {
		return repo.findAll();
	}

}

package cmo.frontend.dao;

import java.util.List;

import cmo.entities.Proposal;

public interface ProposalFEDAO {

	public Proposal getByProposalId(long proposalId);
	
	public List<Proposal> getAll();
	
	public List<Proposal> getAllByCrisisId(long crisisId);
}

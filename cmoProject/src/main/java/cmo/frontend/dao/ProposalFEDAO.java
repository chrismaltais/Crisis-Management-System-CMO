package cmo.frontend.dao;

import java.util.List;

import cmo.entities.Proposal;

public interface ProposalFEDAO {

	public Proposal getByCrisisId(long crisisId);
	
	public List<Proposal> getAll();
}

package cmo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cmo.entities.Proposal;

/**
 * Repository for Proposal entity
 *
 */
public interface ProposalRepository extends CrudRepository<Proposal, Long> {

	public Proposal findByProposalID(long proposalId);

	public List<Proposal> findAll();

	public List<Proposal> findByCrisisIDOrderByCrisisIDDesc(long crisisId);

	public Proposal findTop1ByOrderByProposalIDDesc();

	public List<Proposal> findAllByOrderByCrisisIDDesc();
}

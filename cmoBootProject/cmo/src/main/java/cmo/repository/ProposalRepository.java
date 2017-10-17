package cmo.repository;

import org.springframework.data.repository.CrudRepository;

import cmo.entities.Proposal;

/**
 * Repository for Proposal entity
 * 
 * @author Ong Hock Leng
 *
 */
public interface ProposalRepository extends CrudRepository<Proposal, Long> {

	public Proposal findByCrisisID(int id);
}

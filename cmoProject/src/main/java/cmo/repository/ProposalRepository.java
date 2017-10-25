package cmo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cmo.entities.Proposal;

/**
 * Repository for Proposal entity
 * 
 * @author Ong Hock Leng
 *
 */
public interface ProposalRepository extends CrudRepository<Proposal, Long> {

	public Proposal findByCrisisID(long id);
	
	public List<Proposal> findAll();
}

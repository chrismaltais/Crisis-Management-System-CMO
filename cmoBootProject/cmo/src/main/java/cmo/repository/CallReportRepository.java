package cmo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cmo.entities.CallReport;

/**
 * Repository for CallReport entity
 * 
 * @author Ong Hock Leng
 *
 */
public interface CallReportRepository extends CrudRepository<CallReport, Long> {

	public CallReport findByCrisisID(long id);
	
	public List<CallReport> findAll();
	
}

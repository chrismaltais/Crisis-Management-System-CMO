package cmo.repository;

import org.springframework.data.repository.CrudRepository;

import cmo.entities.CallReport;

/**
 * Repository for CallReport entity
 * 
 * @author Ong Hock Leng
 *
 */
public interface CallReportRepository extends CrudRepository<CallReport, Long> {

	public CallReport findByCrisisID(int id);
}

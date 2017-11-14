package cmo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cmo.entities.CallReport;

/**
 * Repository for CallReport entity
 *
 */
public interface CallReportRepository extends CrudRepository<CallReport, Long> {

	public CallReport findByCrisisID(long id);

	public CallReport findByCallReportID(long id);

	public List<CallReport> findAll();

	public List<CallReport> findAllByOrderByCallReportIDDesc();

	public List<CallReport> findByCrisisIDOrderByCallReportIDDesc(long id);
}

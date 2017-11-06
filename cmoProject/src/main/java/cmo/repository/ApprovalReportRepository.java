package cmo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cmo.entities.ApprovalReport;

/**
 * Repository for ApprovalReport entity
 * 
 * @author Ong Hock Leng
 *
 */
public interface ApprovalReportRepository extends CrudRepository<ApprovalReport, Long> {

	public ApprovalReport findByCrisisID(long id);
	
	public List<ApprovalReport> findAll();
	
	public List<ApprovalReport> findAllByOrderByCrisisIDDesc();
	
	public List<ApprovalReport> findByAnalysisReadableOrderByCrisisIDDesc(boolean analysisReadable);

}

package cmo.repository;

import org.springframework.data.repository.CrudRepository;

import cmo.entities.ApprovalReport;

/**
 * Repository for ApprovalReport entity
 * 
 * @author Ong Hock Leng
 *
 */
public interface ApprovalReportRepository extends CrudRepository<ApprovalReport, Long> {

	public ApprovalReport findByCrisisID(int id);

}

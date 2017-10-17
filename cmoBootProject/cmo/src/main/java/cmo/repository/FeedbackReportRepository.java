package cmo.repository;

import org.springframework.data.repository.CrudRepository;

import cmo.entities.FeedbackReport;

/**
 * Repository for FeedbackReport entity
 * 
 * @author Ong Hock Leng
 *
 */
public interface FeedbackReportRepository extends CrudRepository<FeedbackReport, Long> {

	public FeedbackReport findByCrisisID(int id);
}

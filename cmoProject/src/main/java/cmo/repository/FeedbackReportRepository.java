package cmo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import cmo.entities.FeedbackReport;

/**
 * Repository for FeedbackReport entity
 *
 */
public interface FeedbackReportRepository extends CrudRepository<FeedbackReport, Long> {

	public FeedbackReport findByFeedbackReportID(long feedbackReportId);

	public FeedbackReport findByCrisisID(long crisisId);

	public List<FeedbackReport> findAll();

	public List<FeedbackReport> findByCrisisIDOrderByCrisisIDDesc(long crisisId);
}

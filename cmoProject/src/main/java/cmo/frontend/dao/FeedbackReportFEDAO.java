package cmo.frontend.dao;

import java.util.List;

import cmo.entities.FeedbackReport;

public interface FeedbackReportFEDAO {

	public FeedbackReport getByFeedbackReportId(long feedbackReportId);
	
	public List<FeedbackReport> getAll();
	
	public List<FeedbackReport> getAllByCrisisId(long crisisId);

}

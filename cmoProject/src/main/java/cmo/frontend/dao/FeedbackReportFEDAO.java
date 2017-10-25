package cmo.frontend.dao;

import java.util.List;

import cmo.entities.FeedbackReport;

public interface FeedbackReportFEDAO {
	
	public FeedbackReport getReportByCrisisId(long crisisID);
	
	public List<FeedbackReport> getAll();

}

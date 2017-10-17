package cmo.tony;

import java.util.List;

import cmo.entities.FeedbackReport;
 
public interface FeedbackReportRepository {
     
	FeedbackReport findById(long id);
    
    void saveFeedbackReport(FeedbackReport feedbackReport);
 
    List<FeedbackReport> findAllFeedbackReports();
     
    boolean isFeedbackReportExist(FeedbackReport feedbackReport);
     
}
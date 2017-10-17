package cmoProject.controllers;

import java.util.List;

import cmoProject.entities.FeedbackReport;
 
public interface FeedbackReportRepository {
     
	FeedbackReport findById(long id);
    
    void saveFeedbackReport(FeedbackReport feedbackReport);
 
    List<FeedbackReport> findAllFeedbackReports();
     
    boolean isFeedbackReportExist(FeedbackReport feedbackReport);
     
}
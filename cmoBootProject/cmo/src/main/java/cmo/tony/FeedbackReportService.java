package cmo.tony;
 
import java.util.List;
import org.springframework.stereotype.Service;

import cmo.entities.FeedbackReport;

@Service("FeedbackReportService")
public class FeedbackReportService implements FeedbackReportRepository{
     
    private static List<FeedbackReport> feedbackReports;
 
    public List<FeedbackReport> findAllFeedbackReports() {
        return feedbackReports;
    }
     
    public FeedbackReport findById(long id) {
        for(FeedbackReport feedbackReport : feedbackReports){
            if(feedbackReport.getCrisisID() == id){
                return feedbackReport;
            }
        }
        return null;
    }
 
    public void saveFeedbackReport(FeedbackReport feedbackReport) {
        feedbackReports.add(feedbackReport);
    }
    
    public boolean isFeedbackReportExist(FeedbackReport feedbackReport) {
        return findById(feedbackReport.getCrisisID())!=null;
    }
}
package cmo.tony;
 
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
 
import org.springframework.stereotype.Service;

import cmo.entities.FeedbackReport;

@Service("FeedbackReportService")
public class FeedbackReportService implements FeedbackReportRepository{
     
    private static final AtomicLong counter = new AtomicLong();
     
    private static List<FeedbackReport> feedbackReports;
     
    static{
        feedbackReports= populateDummyReports();
    }
 
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
 
    private static List<FeedbackReport> populateDummyReports(){
        List<FeedbackReport> feedbackReports = new ArrayList<FeedbackReport>();
        feedbackReports.add(new FeedbackReport(counter.incrementAndGet(), "Test1", "EF Liaison Officer" , 4, 10000, "Deployment1", "Situation1"));
        feedbackReports.add(new FeedbackReport(counter.incrementAndGet(), "Test2", "EF Liaison Officer" , 5, 10000, "Deployment2", "Situation2"));
        feedbackReports.add(new FeedbackReport(counter.incrementAndGet(), "Test3", "EF Liaison Officer" , 4, 10000, "Deployment3", "Situation3"));
        feedbackReports.add(new FeedbackReport(counter.incrementAndGet(), "Test4", "EF Liaison Officer" , 5, 10000, "Deployment4", "Situation4"));
        return feedbackReports;
    }

}
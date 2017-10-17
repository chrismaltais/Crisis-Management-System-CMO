package cmo.tony;
 
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
 
import org.springframework.stereotype.Service;

import cmo.entities.ApprovalReport;

@Service("ApprovalReportService")
public class ApprovalReportService implements ApprovalReportRepository{
     
    private static final AtomicLong counter = new AtomicLong();
     
    private static List<ApprovalReport> approvalReports;
     
    static{
        approvalReports= populateDummyReports();
    }
 
    public List<ApprovalReport> findAllApprovalReports() {
        return approvalReports;
    }
     
    public ApprovalReport findById(long id) {
        for(ApprovalReport approvalReport : approvalReports){
            if(approvalReport.getCrisisID() == id){
                return approvalReport;
            }
        }
        return null;
    }
 
    public void saveApprovalReport(ApprovalReport approvalReport) {
        approvalReports.add(approvalReport);
    }
    
    public boolean isApprovalReportExist(ApprovalReport approvalReport) {
        return findById(approvalReport.getCrisisID())!=null;
    }
 
    private static List<ApprovalReport> populateDummyReports(){
        List<ApprovalReport> approvalReports = new ArrayList<ApprovalReport>();
        approvalReports.add(new ApprovalReport(counter.incrementAndGet(), "Test1"));
        approvalReports.add(new ApprovalReport(counter.incrementAndGet(), "Test2"));
        approvalReports.add(new ApprovalReport(counter.incrementAndGet(), "Test3"));
        approvalReports.add(new ApprovalReport(counter.incrementAndGet(), "Test4"));
        return approvalReports;
    }

	
    

 
}
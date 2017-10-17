package cmo.tony;
 
import java.util.List;
import org.springframework.stereotype.Service;

import cmo.entities.ApprovalReport;

@Service("ApprovalReportService")
public class ApprovalReportService implements ApprovalReportRepository{
     
    private static List<ApprovalReport> approvalReports;
 
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
}
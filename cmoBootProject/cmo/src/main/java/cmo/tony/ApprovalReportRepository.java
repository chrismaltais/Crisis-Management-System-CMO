package cmo.tony;

import java.util.List;

import cmo.entities.ApprovalReport;
 
public interface ApprovalReportRepository {
     
	ApprovalReport findById(long id);
    
    void saveApprovalReport(ApprovalReport approvalReport);
 
    List<ApprovalReport> findAllApprovalReports();
     
    boolean isApprovalReportExist(ApprovalReport approvalReport);
     
}
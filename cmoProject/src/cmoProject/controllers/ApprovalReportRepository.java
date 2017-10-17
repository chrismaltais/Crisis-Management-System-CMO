package cmoProject.controllers;

import java.util.List;

import cmoProject.entities.ApprovalReport;
 
public interface ApprovalReportRepository {
     
	ApprovalReport findById(long id);
    
    void saveApprovalReport(ApprovalReport approvalReport);
 
    List<ApprovalReport> findAllApprovalReports();
     
    boolean isApprovalReportExist(ApprovalReport approvalReport);
     
}
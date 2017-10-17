package cmoProject.controllers;

import java.util.List;

import cmoProject.entities.CallReport;
 
public interface CallReportRepository {
     
    CallReport findById(long id);
    
    void saveCallReport(CallReport callReport);
 
    List<CallReport> findAllCallReports();
     
    boolean isCallReportExist(CallReport callReport);
     
}
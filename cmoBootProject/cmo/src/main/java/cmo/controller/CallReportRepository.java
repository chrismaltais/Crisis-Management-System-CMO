package cmo.controller;

import java.util.List;

import cmo.entities.CallReport;
 
public interface CallReportRepository {
     
    CallReport findById(long id);
    
    void saveCallReport(CallReport callReport);
 
    List<CallReport> findAllCallReports();
     
    boolean isCallReportExist(CallReport callReport);
     
}
package cmo.tony;

import java.util.List;

import cmo.entities.Report;
 
public interface ReportRepository {
     
    Report findById(long id);
     
    Report findByName(String name);
     
    void saveReport(Report report);
     
    void updateReport(Report report);
     
    void deleteReportById(long id);
 
    List<Report> findAllReports();
     
    void deleteAllReports();
     
    boolean isReportExist(Report report);
     
}
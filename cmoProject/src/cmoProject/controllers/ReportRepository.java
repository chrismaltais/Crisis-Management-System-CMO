package nesims.main.service;

import java.util.List;

import nesims.main.model.Report;
 
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
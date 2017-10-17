package cmoProject.controllers;
 
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
 
import org.springframework.stereotype.Service;

import cmoProject.entities.CallReport;

@Service("CallReportService")
public class CallReportService implements CallReportRepository{
     
    private static final AtomicLong counter = new AtomicLong();
     
    private static List<CallReport> callReports;
     
    static{
        callReports= populateDummyReports();
    }
 
    public List<CallReport> findAllCallReports() {
        return callReports;
    }
     
    public CallReport findById(long id) {
        for(CallReport callReport : callReports){
            if(callReport.getCrisisID() == id){
                return callReport;
            }
        }
        return null;
    }
 
    public void saveCallReport(CallReport callReport) {
        callReports.add(callReport);
    }
    
    public boolean isCallReportExist(CallReport callReport) {
        return findById(callReport.getCrisisID())!=null;
    }
 
    private static List<CallReport> populateDummyReports(){
        List<CallReport> callReports = new ArrayList<CallReport>();
        callReports.add(new CallReport(counter.incrementAndGet(), "Test1", "911 Liaison Officer" , "Type1", "Area1", "Date1", "Time1", "Detail1"));
        callReports.add(new CallReport(counter.incrementAndGet(), "Test2", "911 Liaison Officer" , "Type2", "Area2", "Date2", "Time2", "Detail2"));
        callReports.add(new CallReport(counter.incrementAndGet(), "Test3", "911 Liaison Officer" , "Type3", "Area3", "Date3", "Time3", "Detail3"));
        callReports.add(new CallReport(counter.incrementAndGet(), "Test4", "911 Liaison Officer" , "Type4", "Area4", "Date4", "Time4", "Detail4"));
        return callReports;
    }

	
    

 
}
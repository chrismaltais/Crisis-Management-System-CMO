package cmo.tony;
 
import java.util.List;
import org.springframework.stereotype.Service;

import cmo.entities.CallReport;

@Service("CallReportService")
public class CallReportService implements CallReportRepository{
     
    private static List<CallReport> callReports;
 
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
}
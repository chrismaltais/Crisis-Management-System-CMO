//Server side
package cmo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import cmo.entities.CallReport;
import cmo.controller.CallReportRepository;
import cmo.controller.CustomErrorType;
 
@RestController
@RequestMapping("/911toCMO")
public class CMO911ApiController {
 
    public static final Logger logger = LoggerFactory.getLogger(CMO911ApiController.class);
 
    @Autowired
    CallReportRepository callReportRepository; //Service which will do all data retrieval/manipulation work
 
    // -------------------Retrieve All Reports---------------------------------------------
 
    @SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/callReport/", method = RequestMethod.GET)
    public ResponseEntity<List<CallReport>> listAllReports() {
        List<CallReport> callReports = callReportRepository.findAllCallReports();
        if (callReports.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<CallReport>>(callReports, HttpStatus.OK);
    }
 
    // -------------------Retrieve Single Report------------------------------------------
 
    @SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/callReport/{crisisID}", method = RequestMethod.GET)
    public ResponseEntity<?> getCallReport(@PathVariable("crisisID") long crisisID) {
        logger.info("Fetching Call Report with crisisID {}", crisisID);
        CallReport callReport = callReportRepository.findById(crisisID);
        if (callReport == null) {
            logger.error("Call Report with crisisID {} not found.", crisisID);
            return new ResponseEntity(new CustomErrorType("Call Report with crisisID " + crisisID 
                    + " not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<CallReport>(callReport, HttpStatus.OK);
    }
 
    // -------------------Create a Report-------------------------------------------
 
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @RequestMapping(value = "/callReport/", method = RequestMethod.POST)
    public ResponseEntity<?> createCallReport(@RequestBody CallReport callReport, UriComponentsBuilder ucBuilder) {
        logger.info("Creating Call Report : {}", callReport);
 
        if (callReportRepository.isCallReportExist(callReport)) {
            logger.error("Unable to create. A call report with name {} already exist", callReport.getCrisisID());
            return new ResponseEntity(new CustomErrorType("Unable to create. A Call Report with crisisID " + 
            callReport.getCrisisID() + " already exist."),HttpStatus.CONFLICT);
        }
        callReportRepository.saveCallReport(callReport);
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/911toCMO/callReport/{crisisID}").buildAndExpand(callReport.getCrisisID()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }
 
}
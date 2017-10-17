//Server side
package cmo.tony;

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

import cmo.entities.ApprovalReport;
import cmo.entities.CustomErrorType;
import cmo.tony.ApprovalReportRepository;
 
@RestController
@RequestMapping("/PMOtoCMO")
public class CMOPMOApiController {
 
    public static final Logger logger = LoggerFactory.getLogger(CMOPMOApiController.class);
 
    @Autowired
    ApprovalReportRepository approvalReportRepository; //Service which will do all data retrieval/manipulation work
 
    // -------------------Retrieve All Reports---------------------------------------------
 
    @SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/approvalReport/", method = RequestMethod.GET)
    public ResponseEntity<List<ApprovalReport>> listAllApprovalReports() {
        List<ApprovalReport> approvalReports = approvalReportRepository.findAllApprovalReports();
        if (approvalReports.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<ApprovalReport>>(approvalReports, HttpStatus.OK);
    }
 
    // -------------------Retrieve Single Report------------------------------------------
 
    @SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/approvalReport/{crisisID}", method = RequestMethod.GET)
    public ResponseEntity<?> getApprovalReport(@PathVariable("crisisID") long crisisID) {
        logger.info("Fetching Approval Report with crisisID {}", crisisID);
        ApprovalReport approvalReport = approvalReportRepository.findById(crisisID);
        if (approvalReport == null) {
            logger.error("Approval Report with crisisID {} not found.", crisisID);
            return new ResponseEntity(new CustomErrorType("Approval Report with crisisID " + crisisID 
                    + " not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<ApprovalReport>(approvalReport, HttpStatus.OK);
    }
 
    // -------------------Create a Report-------------------------------------------
 
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @RequestMapping(value = "/approvalReport/", method = RequestMethod.POST)
    public ResponseEntity<?> createApprovalReport(@RequestBody ApprovalReport approvalReport, UriComponentsBuilder ucBuilder) {
        logger.info("Creating Approval Report : {}", approvalReport);
 
        if (approvalReportRepository.isApprovalReportExist(approvalReport)) {
            logger.error("Unable to create. An Approval Report with name {} already exist", approvalReport.getCrisisID());
            return new ResponseEntity(new CustomErrorType("Unable to create. An Approval Report with crisisID " + 
            approvalReport.getCrisisID() + " already exist."),HttpStatus.CONFLICT);
        }
        approvalReportRepository.saveApprovalReport(approvalReport);
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/PMOtoCMO/approvalReport/{crisisID}").buildAndExpand(approvalReport.getCrisisID()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }
 
}
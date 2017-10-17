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

import cmo.entities.FeedbackReport;
import cmo.controller.FeedbackReportRepository;
import cmo.controller.CustomErrorType;
 
@RestController
@RequestMapping("/EFtoCMO")
public class CMOEFApiController {
 
    public static final Logger logger = LoggerFactory.getLogger(CMOEFApiController.class);
 
    @Autowired
    FeedbackReportRepository feedbackReportRepository; //Service which will do all data retrieval/manipulation work
 
    // -------------------Retrieve All Reports---------------------------------------------
 
    @SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/feedbackReport/", method = RequestMethod.GET)
    public ResponseEntity<List<FeedbackReport>> listAllFeedbackReports() {
        List<FeedbackReport> feedbackReports = feedbackReportRepository.findAllFeedbackReports();
        if (feedbackReports.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<FeedbackReport>>(feedbackReports, HttpStatus.OK);
    }
 
    // -------------------Retrieve Single Report------------------------------------------
 
    @SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/feedbackReport/{crisisID}", method = RequestMethod.GET)
    public ResponseEntity<?> getFeedbackReport(@PathVariable("crisisID") long crisisID) {
        logger.info("Fetching Feedback Report with crisisID {}", crisisID);
        FeedbackReport feedbackReport = feedbackReportRepository.findById(crisisID);
        if (feedbackReport == null) {
            logger.error("Feedback Report with crisisID {} not found.", crisisID);
            return new ResponseEntity(new CustomErrorType("Feedback Report with crisisID " + crisisID 
                    + " not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<FeedbackReport>(feedbackReport, HttpStatus.OK);
    }
 
    // -------------------Create a Report-------------------------------------------
 
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @RequestMapping(value = "/feedbackReport/", method = RequestMethod.POST)
    public ResponseEntity<?> createFeedbackReport(@RequestBody FeedbackReport feedbackReport, UriComponentsBuilder ucBuilder) {
        logger.info("Creating Feedback Report : {}", feedbackReport);
 
        if (feedbackReportRepository.isFeedbackReportExist(feedbackReport)) {
            logger.error("Unable to create. An Feedback Report with name {} already exist", feedbackReport.getCrisisID());
            return new ResponseEntity(new CustomErrorType("Unable to create. An Feedback Report with crisisID " + 
            feedbackReport.getCrisisID() + " already exist."),HttpStatus.CONFLICT);
        }
        feedbackReportRepository.saveFeedbackReport(feedbackReport);
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/EFtoCMO/feedbackReport/{crisisID}").buildAndExpand(feedbackReport.getCrisisID()).toUri());
        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
    }
 
}
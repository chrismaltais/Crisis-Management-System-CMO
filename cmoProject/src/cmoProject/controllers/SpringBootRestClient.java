//This is for PMO to call CMO's API
//Specify their URI
//Create a method like createReport() to POST to their service
package cmoProject.controllers;

import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import cmoProject.entities.Report;

public class SpringBootRestClient {

	public static final String REST_SERVICE_URI = "http://localhost:8080/api";

	// GET
	@SuppressWarnings("unchecked")
	private static void listLatestReport() {
		int i = 1;
		System.out.println("Testing receiving Action Report API-----------");

		RestTemplate restTemplate = new RestTemplate();
		List<LinkedHashMap<String, Object>> reportsMap = restTemplate.getForObject(REST_SERVICE_URI + "/report/",
				List.class);

		if (reportsMap != null) {
			for (LinkedHashMap<String, Object> map : reportsMap) {
				if (i++ == reportsMap.size()) {
					// end
					
					System.out.println("crisisID=" + map.get("crisisID") + "," + " positionInCMO="
							+ map.get("positionInCMO") + "," + " threatLevel=" + map.get("threatLevel") + ","
							+ " crisisType=" + map.get("crisisType") + "," + " affectedAreas="
							+ map.get("affectedAreas") + "," + " estimatedCasualties=" + map.get("estimatedCasualties")
							+ "," + " crisisDuration=" + map.get("crisisDuration") + "," + " crisisDetails="
							+ map.get("crisisDetails") + "," + " courseOfActions=" + map.get("courseOfActions") + ","
							+ " consequencesOfAction=" + map.get("consequencesOfAction"));
				}
			}
		} else {
			System.out.println("No report exist----------");
		}
	}

	// Examples
	private static void listAllReports() {
		System.out.println("Testing receiving Action Report API-----------");

		RestTemplate restTemplate = new RestTemplate();
		List<LinkedHashMap<String, Object>> reportsMap = restTemplate.getForObject(REST_SERVICE_URI + "/report/",
				List.class);

		if (reportsMap != null) {
			for (LinkedHashMap<String, Object> map : reportsMap) {

				System.out.println("crisisID=" + map.get("crisisID") + "," + " nameOfSender=" + map.get("nameOfSender")
						+ "," + " positionInPMO=" + map.get("positionInPMO") + "," + " proposalFeedback="
						+ map.get("proposalFeedback") + "," + " proposalApproval=" + map.get("proposalApproval"));
			}
		} else {
			System.out.println("No report exist----------");
		}
	}

	// GET
	private static void getReport() {
		System.out.println("Testing getReport API----------");

		RestTemplate restTemplate = new RestTemplate();
		Report report = restTemplate.getForObject(REST_SERVICE_URI + "/report/1", Report.class);
		System.out.println(report);
	}

	// POST 
	private static void createReport() {
	System.out.println("Testing create Report API----------");

	RestTemplate restTemplate = new RestTemplate();
	Report report = new Report(20, "General", 4, "AA1",10000, "1 hour", "COA1", "COA1");
	URI uri = restTemplate.postForLocation(REST_SERVICE_URI + "/report/", report,
			Report.class);System.out.println("Location : "+uri.toASCIIString());
	}

	// PUT
	private static void updateReport() {
		System.out.println("Testing update Report API----------");
		RestTemplate restTemplate = new RestTemplate();
		Report report = new Report(1, "General", 4, "AA1",10000, "1 hour", "COA1", "COA1");
		restTemplate.put(REST_SERVICE_URI + "/report/1", report);
		System.out.println(report);
	}

	// DELETE
	private static void deleteReport() {
		System.out.println("Testing delete Report API----------");

		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete(REST_SERVICE_URI + "/report/3");
	}

	// DELETE
	private static void deleteAllReports() {
		System.out.println("Testing all delete Reports API----------");
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete(REST_SERVICE_URI + "/report/");
	}

	public static void main(String args[]) {
		createReport();
	}
}
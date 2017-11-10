//Client side
//Specify their URI
//Create a method like createReport() to POST to their service
package cmo.tony;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import cmo.entities.Proposal;

public class CMOPMOClient {

	 public static final String REST_SERVICE_URI = "http://10.27.199.49:8080/CMOtoPMO";

	// GET
	@SuppressWarnings({ "unchecked" })
	private static void listLatestProposal() {
		int i = 1;
		System.out.println("Testing receiving Proposal API-----------");

		RestTemplate restTemplate = new RestTemplate();
		List<LinkedHashMap<String, Object>> proposalsMap = restTemplate.getForObject(REST_SERVICE_URI + "/proposal/",
				List.class);

		if (proposalsMap != null) {
			for (LinkedHashMap<String, Object> map : proposalsMap) {
				if (i++ == proposalsMap.size()) {
					// end

					System.out.println("crisisID=" + map.get("crisisID") + "," + " name=" + map.get("name") + ","
							+ " positionInCMO=" + map.get("positionInCMO") + "," + " threatLevel="
							+ map.get("threatLevel") + "," + " crisisType=" + map.get("crisisType") + ","
							+ " affectedArea=" + map.get("affectedArea") + "," + " estimatedCasualties="
							+ map.get("estimatedCasualties") + "," + " crisisDuration=" + map.get("crisisDuration")
							+ "," + " crisisDetails=" + map.get("crisisDetails") + "," + " courseOfAction="
							+ map.get("courseOfAction") + "," + " consequencesOfAction="
							+ map.get("consequencesOfAction") + "," + " cleanUpAction=" + map.get("cleanUpAction"));
				}
			}
		} else {
			System.out.println("No report exist----------");
		}
	}

	// GET
	@SuppressWarnings({ "unchecked" })
	private static void listAllProposals() {
		System.out.println("Testing receiving Proposal API-----------");

		RestTemplate restTemplate = new RestTemplate();
		List<LinkedHashMap<String, Object>> proposalsMap = restTemplate.getForObject(REST_SERVICE_URI + "/proposal/",
				List.class);

		if (proposalsMap != null) {
			for (LinkedHashMap<String, Object> map : proposalsMap) {

				System.out.println("crisisID=" + map.get("crisisID") + "," + " name=" + map.get("name") + ","
						+ " positionInCMO=" + map.get("positionInCMO") + "," + " threatLevel=" + map.get("threatLevel")
						+ "," + " crisisType=" + map.get("crisisType") + "," + " affectedArea="
						+ map.get("affectedArea") + "," + " estimatedCasualties=" + map.get("estimatedCasualties") + ","
						+ " crisisDuration=" + map.get("crisisDuration") + "," + " crisisDetails="
						+ map.get("crisisDetails") + "," + " courseOfAction=" + map.get("courseOfAction") + ","
						+ " consequencesOfAction=" + map.get("consequencesOfAction") + "," + " cleanUpAction="
						+ map.get("cleanUpAction"));
			}
		} else {
			System.out.println("No report exist----------");
		}
	}

	// GET
	private static void getProposal() {
		System.out.println("Testing get Proposal API----------");

		RestTemplate restTemplate = new RestTemplate();
		Proposal proposal = restTemplate.getForObject(REST_SERVICE_URI + "/proposal/1", Proposal.class);
		System.out.println(proposal);
	}

	// POST
	public static boolean createProposal(Proposal proposal) {
		System.out.println("Testing create Proposal API----------");

		RestTemplate restTemplate = new RestTemplate();
		// Proposal proposal = new Proposal(10, "Test10", "General", 4, "Type10",
		// "Area10", 10000, "Duration10",
		// "Detail10", "Action10", "Consequence10", "CleanUp10");
		boolean success;
		try {
			success = restTemplate.postForEntity(REST_SERVICE_URI + "/proposal/", proposal, Proposal.class)
					.getStatusCode().is2xxSuccessful();
		} catch (Exception e) {
			success = false;
		}
		// System.out.println("Location : " + uri.toASCIIString());
		
		System.out.println("Sending to " + REST_SERVICE_URI);

		return success;
	}

	public static void main(String args[]) {
		// createProposal();
		getProposal();
		listAllProposals();
		listLatestProposal();
	}
}
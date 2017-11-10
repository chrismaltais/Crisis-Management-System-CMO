//Client side
//Specify their URI
//Create a method like createReport() to POST to their service
package cmo.tony;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import cmo.entities.EFOrder;

public class CMOEFClient {

	public static final String REST_SERVICE_URI = "http://10.27.226.216:8080/CMOtoEF";

	// GET
	@SuppressWarnings({ "unchecked" })
	private static void listLatestOrder() {
		int i = 1;
		System.out.println("Testing receiving Order API-----------");

		RestTemplate restTemplate = new RestTemplate();
		List<LinkedHashMap<String, Object>> ordersMap = restTemplate.getForObject(REST_SERVICE_URI + "/order/",
				List.class);

		if (ordersMap != null) {
			for (LinkedHashMap<String, Object> map : ordersMap) {
				if (i++ == ordersMap.size()) {
					// end

					System.out.println("crisisID=" + map.get("crisisID") + "," + " name=" + map.get("name") + ","
							+ " positionInCMO=" + map.get("positionInCMO") + "," + " threatLevel="
							+ map.get("threatLevel") + "," + " crisisType=" + map.get("crisisType") + ","
							+ " affectedArea=" + map.get("affectedArea") + "," + " crisisDetails="
							+ map.get("crisisDetails") + "," + " courseOfAction=" + map.get("courseOfAction"));
				}
			}
		} else {
			System.out.println("No report exist----------");
		}
	}

	// GET
	@SuppressWarnings({ "unchecked" })
	private static void listAllOrders() {
		System.out.println("Testing receiving Order API-----------");

		RestTemplate restTemplate = new RestTemplate();
		List<LinkedHashMap<String, Object>> ordersMap = restTemplate.getForObject(REST_SERVICE_URI + "/order/",
				List.class);

		if (ordersMap != null) {
			for (LinkedHashMap<String, Object> map : ordersMap) {

				System.out.println("crisisID=" + map.get("crisisID") + "," + " name=" + map.get("name") + ","
						+ " positionInCMO=" + map.get("positionInCMO") + "," + " threatLevel=" + map.get("threatLevel")
						+ "," + " crisisType=" + map.get("crisisType") + "," + " affectedArea="
						+ map.get("affectedArea") + "," + " crisisDetails=" + map.get("crisisDetails") + ","
						+ " courseOfAction=" + map.get("courseOfAction"));
			}
		} else {
			System.out.println("No report exist----------");
		}
	}

	// GET
	private static void getOrder() {
		System.out.println("Testing get Order API----------");

		RestTemplate restTemplate = new RestTemplate();
		EFOrder order = restTemplate.getForObject(REST_SERVICE_URI + "/order/1", EFOrder.class);
		System.out.println(order);
	}

	// POST
	public static boolean createOrder(EFOrder order) {
		System.out.println("Testing create Order API----------");

		RestTemplate restTemplate = new RestTemplate();
		// EFOrder order = new EFOrder(10, "Test10", "Analyst" , 4, "Type10", "Area10",
		// "Detail10", "Action10");
		boolean success;
		try {
			success = restTemplate.postForEntity(REST_SERVICE_URI + "/order/", order, EFOrder.class).getStatusCode().is2xxSuccessful();
		} catch (Exception e) {
			success = false;
		}
//		System.out.println("Location : " + uri.toASCIIString());
		
		return success;
	}

	public static void main(String args[]) {
		// createOrder();
		getOrder();
		listAllOrders();
		listLatestOrder();
	}
}
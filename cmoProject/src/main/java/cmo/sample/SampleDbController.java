package cmo.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**Sample controller for pseudo DB access
 * 
 * @author Ong Hock Leng
 *
 */
@Controller
public class SampleDbController {
	// Autowiring of DAO
	@Autowired
	private SampleEntityRepository sampleEntityRepo;
	
	// Adds an entry into database with every http get request
	// Serve sample.jsp
	@RequestMapping("/dbSample")
	public String getDbAccess(ModelMap model) {

		if (sampleEntityRepo.count() < 2) {
			SampleEntity newEntity = new SampleEntity();
			newEntity.setName("John");
			newEntity.setAge(14);
			sampleEntityRepo.save(newEntity);
		}
		
		// Instantiate string variable for later assignment
		String message2 = "";
		
		// Build string variable
		for (SampleEntity e : sampleEntityRepo.findAll()) {
			message2 += "name : " + e.getName() + "<br>";
			message2 += "age  : " + e.getAge() + "<br><br>";
		}
		
		// Assigns to jsp mapping
		model.addAttribute("message", "MySQL demo");
		model.addAttribute("message2", message2);
		
		return "sample";
	}
	
	// @ResponseBody is used to serve plain text (String) or json (Object)
	@ResponseBody
	@RequestMapping("dbSample/rest")
	public SampleEntity getEntity() {
		// findById() method is declared in SampleEntityRepository interface
		return sampleEntityRepo.findById(1);
	}
	
	@ResponseBody
	@RequestMapping("dbSample/nodata")
	public SampleEntity getNoEntity() {
		// serves empty string as no entry is found
		return sampleEntityRepo.findById(5);
	}
}

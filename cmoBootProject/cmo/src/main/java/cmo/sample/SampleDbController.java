package cmo.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**Sample controller for pseudo DB access
 * 
 * @author HawksSeptua
 *
 */
@Controller
public class SampleDbController {
	@Autowired
	private SampleEntityRepository sampleEntityRepo;
	
	@RequestMapping("/dbSample")
	public String getDbAccess(ModelMap model) {

		if (sampleEntityRepo.count() < 2) {
			SampleEntity newEntity = new SampleEntity();
			newEntity.setName("John");
			newEntity.setAge(14);
			sampleEntityRepo.save(newEntity);
		}
		
		String message2 = "";
		
		for (SampleEntity e : sampleEntityRepo.findAll()) {
			message2 += "name : " + e.getName() + "<br>";
			message2 += "age  : " + e.getAge() + "<br><br>";
		}
		
		model.addAttribute("message", "MySQL demo");
		model.addAttribute("message2", message2);
		
		return "sample";
	}
}

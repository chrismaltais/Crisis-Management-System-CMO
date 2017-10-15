package cmoProject.sample;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**Sample controller for pseudo DB access
 * 
 * @author HawksSeptua
 *
 */
@Controller
public class SampleDbController {
	@RequestMapping("/dbSample")
	public String getDbAccess(ModelMap model) {
		// getting bean mapping from Beans.xml
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		// getting SampleEntityDAO
		SampleEntityDAO entityDAO = (SampleEntityDAO) context.getBean("sampleEntityDAO");
		
		// replace the code below with your own
		// using sample.jsp as template
		
		model.addAttribute("message", "Sample DB example (non-Hibernate)");

		// initialize table for demo
		entityDAO.addEntity("Alpha", 5);
		entityDAO.addEntity("Bravo", 10);
		entityDAO.addEntity("Charlie", 15);
		
		// initialize string
		String message2 = "";
		
		// get 2nd entity in table
		SampleEntity entity = entityDAO.getEntity(2);
		message2 += "Getting 2nd entity<br><br>";
		message2 += entity.getId() + " : " + entity.getName() + " : " + entity.getAge() + "<br><br>";
		
		// delete 2nd entity in table
		entityDAO.deleteEntity(2);
		message2 += "2nd entity is deleted<br><br>";
		
		// get all entities
		List<SampleEntity> entities = entityDAO.getEntities();
		message2 += "All entities in table<br><br>";
		for (SampleEntity e : entities) {
			message2 += e.getId() + " : " + e.getName() + " : " + e.getAge() + "<br>";
		}
		
		// adding message2 to model
		model.addAttribute("message2", message2);
		
		return "sample";
	}
}

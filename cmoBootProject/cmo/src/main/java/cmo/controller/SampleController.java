package cmo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {
    
    @RequestMapping(value = "/sample", method = RequestMethod.GET)
    public String printHello(ModelMap model){
    	
    	System.out.println("Hawks");
        
        // Add content to replace ${message} with "Hello from the other side"
        model.addAttribute("message", "Hello from the other side");
        //model.addAttribute("message2", "<br><br>This is another message for you.<br><br><h3>ALOHA!!!</h3>");
        model.addAttribute("message2", "<br><a href=\"maps\">Click here for maps</a>");
        
        // Call web content "sample"
        // According to servlet, it is calling '/WEB-INF/view/sample.jsp'
        return "sample";
    }
    
    @RequestMapping(value = "/maps", method = RequestMethod.GET)
    public String printMap(ModelMap model){
        return "maps";
    }
}

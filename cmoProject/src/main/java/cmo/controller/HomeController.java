package cmo.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "redirect:/login";
	}

	@RequestMapping(value = "/pages/{type}/{page}", method = RequestMethod.GET)
	public String pagesOfTypes(Locale locale, Model model, @PathVariable(value = "type") String type,
			@PathVariable(value = "page") String page) {
		logger.info("Welcome page! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "pages/" + type + "/" + page;
	}

	@Autowired
	MailboxController mail;

	@RequestMapping(value = "/pages/{page}", method = RequestMethod.GET)
	public String pages(Locale locale, Model model, @PathVariable(value = "page") String page) {
		logger.info("Welcome page! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		mail.messageList(model, page);

		return "pages/" + page;
	}

	@RequestMapping(value = "/general/{page}", method = RequestMethod.GET)
	public String general(Locale locale, Model model, @PathVariable(value = "page") String generalPage) {
		logger.info("Welcome page! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		mail.messageList(model, generalPage);

		return "general/" + generalPage;
	}
}

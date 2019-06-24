package za.ac.wits.aps.mvc.controller;

import javax.mail.AuthenticationFailedException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import za.ac.wits.aps.dto.viewbean.Login;
import za.ac.wits.aps.service.CustomerServiceImp;
import za.ac.wits.aps.service.ICustomerService;

@Controller
public class LoginController {
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("login", new Login());
		return mav;
	}

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("login") Login login) throws AuthenticationFailedException {
		ModelAndView mav = null;
		ICustomerService onlineUser = new CustomerServiceImp ();

		boolean isSuccessful = onlineUser.logApsUser(login);
		mav = new ModelAndView("redirect:/dashboard");

		return mav;
	}
}
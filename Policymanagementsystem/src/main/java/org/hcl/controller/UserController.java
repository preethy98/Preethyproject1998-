package org.hcl.controller;

import javax.validation.Valid;

import org.hcl.entities.User;
import org.hcl.service.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	private ServiceUser serviceuser;
	private ServiceUser serviceuserlogin;

	@Autowired
	public UserController(ServiceUser serviceuser, ServiceUser serviceuserlogin) {
		super();
		this.serviceuser = serviceuser;
		this.serviceuserlogin = serviceuserlogin;
	}

	@GetMapping("/userreg")
	public String showuserhome(Model model) {
		User u = new User();
		model.addAttribute(u);
		return "userregister";
	}

	@PostMapping("/usersignup")
	public String userRegister(@Valid @ModelAttribute("user") User u, BindingResult result, Model model) {
		String url = null;
		if (result.hasErrors()) {
			return "userregister";
		}
		Integer j = serviceuser.insertUserdetails(u);
		if (j > 0) {
			url = "userregisteredpage";
		} else {
			model.addAttribute("msg", "Not Inserted Succesfully Please try again later");
			url = "userregister";
		}
		return url;
	}

	@GetMapping("/userlog")
	public String showuserhome() {
		return "userloginpage";

	}

	@PostMapping("/userlogin")
	public String showuserlogin(@RequestParam("usersid") Integer user_id, @RequestParam("passwords") String user_pw,
			Model model) {
		String url = null;
		Integer b = serviceuserlogin.validateUser(user_id, user_pw);
		if (b > 0) {
			url = "user";
			model.addAttribute("userid", user_id);
		} else {
			url = "invalidpage";

		}
		return url;

	}

}

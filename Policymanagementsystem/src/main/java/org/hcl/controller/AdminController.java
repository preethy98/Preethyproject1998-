package org.hcl.controller;

import javax.validation.Valid;

import org.hcl.entities.Admin;
import org.hcl.service.ServiceAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class AdminController{
	private ServiceAdmin serviceadmin;
	private ServiceAdmin serviceadminlogin;
	@Autowired
	public AdminController(ServiceAdmin serviceadmin, ServiceAdmin serviceadminlogin) {
		super();
		this.serviceadmin = serviceadmin;
		this.serviceadminlogin = serviceadminlogin;
	}
	@GetMapping("/adminreg")
	public String showhome(Model model) {
		Admin a=new Admin();
		model.addAttribute(a);
		return "adminregister";
	}

	@PostMapping("/adminsignup")
	public String register(@Valid @ModelAttribute("admin") Admin a,BindingResult result,Model model) {
		String url=null;
		if (result.hasErrors())
		{
			return "adminregister";
		}
		else {
		Integer i=serviceadmin.insertAdmindetails(a);
		if(i>0)
		{
			url="registeredpage";
		}
		else
		{
			model.addAttribute("msg", "Not Inserted Succesfully Please try again later");
			url="adminregister";
		}
		
		return url;
		}
	}
	@GetMapping("/adminlog")
	public String showadminhome() {
		return "adminloginpage";
		
	}
	@PostMapping("/adminlogin")
	public String showadminlogin( @RequestParam("adminsid") Integer ad_id,@RequestParam("passwords") String ad_pw) {
		String url=null;
		Integer b=serviceadminlogin.validateadmin(ad_id,ad_pw);
		if(b>0)
		{
			url="admin";
		}
		else
		{
			url="invalidpage";
		
		}
		return url;

		}	

}

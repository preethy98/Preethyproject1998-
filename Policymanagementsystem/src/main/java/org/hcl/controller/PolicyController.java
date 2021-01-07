package org.hcl.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.hcl.entities.Admin;
import org.hcl.entities.Payment;
import org.hcl.entities.Policy;
import org.hcl.entities.User;
import org.hcl.service.ServicePolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PolicyController {
	private ServicePolicy servicepolicy;
	private ServicePolicy servicepolicyview;
	private ServicePolicy serviceedit;
	private ServicePolicy servicedet;
	private ServicePolicy servicedelete;
	private ServicePolicy servicesearchbyname;
	private ServicePolicy servicesearchbytype;
	private ServicePolicy servicesearchbytime;
	private ServicePolicy servicesearchbycname;
	private ServicePolicy servicesearchbyamount;
	private ServicePolicy servicesearchpolicy;
	private ServicePolicy servicesearchbyid;

	public PolicyController() {
		// TODO Auto-generated constructor stub
	}

	public ServicePolicy getServicepolicy() {
		return servicepolicy;
	}

	@Autowired
	public void setServicepolicy(ServicePolicy servicepolicy) {
		this.servicepolicy = servicepolicy;
	}

	public ServicePolicy getServicepolicyview() {
		return servicepolicyview;
	}

	@Autowired
	public void setServicepolicyview(ServicePolicy servicepolicyview) {
		this.servicepolicyview = servicepolicyview;
	}

	public ServicePolicy getServiceedit() {
		return serviceedit;
	}

	@Autowired
	public void setServiceedit(ServicePolicy serviceedit) {
		this.serviceedit = serviceedit;
	}

	public ServicePolicy getServicedet() {
		return servicedet;
	}

	@Autowired
	public void setServicedet(ServicePolicy servicedet) {
		this.servicedet = servicedet;
	}

	public ServicePolicy getServicedelete() {
		return servicedelete;
	}

	@Autowired
	public void setServicedelete(ServicePolicy servicedelete) {
		this.servicedelete = servicedelete;
	}

	public ServicePolicy getServicesearchbyname() {
		return servicesearchbyname;
	}

	@Autowired
	public void setServicesearchbyname(ServicePolicy servicesearchbyname) {
		this.servicesearchbyname = servicesearchbyname;
	}

	public ServicePolicy getServicesearchbytype() {
		return servicesearchbytype;
	}

	@Autowired
	public void setServicesearchbytype(ServicePolicy servicesearchbytype) {
		this.servicesearchbytype = servicesearchbytype;
	}

	public ServicePolicy getServicesearchbytime() {
		return servicesearchbytime;
	}

	@Autowired
	public void setServicesearchbytime(ServicePolicy servicesearchbytime) {
		this.servicesearchbytime = servicesearchbytime;
	}

	public ServicePolicy getServicesearchbycname() {
		return servicesearchbycname;
	}

	@Autowired
	public void setServicesearchbycname(ServicePolicy servicesearchbycname) {
		this.servicesearchbycname = servicesearchbycname;
	}

	public ServicePolicy getServicesearchbyamount() {
		return servicesearchbyamount;
	}

	@Autowired
	public void setServicesearchbyamount(ServicePolicy servicesearchbyamount) {
		this.servicesearchbyamount = servicesearchbyamount;
	}

	public ServicePolicy getServicesearchpolicy() {
		return servicesearchpolicy;
	}

	@Autowired
	public void setServicesearchpolicy(ServicePolicy servicesearchpolicy) {
		this.servicesearchpolicy = servicesearchpolicy;
	}

	public ServicePolicy getServicesearchbyid() {
		return servicesearchbyid;
	}

	@Autowired
	public void setServicesearchbyid(ServicePolicy servicesearchbyid) {
		this.servicesearchbyid = servicesearchbyid;
	}

	@GetMapping(value = { "/", "/mainpage" })
	public String showhome() {
		return "home";
	}
	@GetMapping("/view")
	public String homeview() {
		return "homepage";
	}

	@GetMapping("/createform")
	public String adminhomepage(Model model) {
		Policy policy = new Policy();
		model.addAttribute(policy);
		return "createpform";

	}

	@PostMapping("/createpolicy")
	public String policyform(@Valid @ModelAttribute("policy") Policy policy, BindingResult result, Model model) {
		String url = null;
		if (result.hasErrors()) {
			return "createpform";
		}
		Integer j = servicepolicy.insertPolicydetails(policy);
		if (j > 0) {
			url = "admin";
		} else {
			url = "admin";
			model.addAttribute("errormsg", "Not Inserted Succesfully Please try again later");

		}
		return url;
	}

	@GetMapping("/viewpolicy")
	public String viewpolicyhome(Model model) {
		List<Policy> policies = servicepolicyview.getPolicies();
		model.addAttribute("policies", policies);
		return "admin";

	}

	@GetMapping("/edit")
	public ModelAndView edit(HttpServletRequest request) {
		Integer policyid = Integer.parseInt(request.getParameter("policyid"));
		Policy policy = serviceedit.getPolicy(policyid);
		ModelAndView model = new ModelAndView("editform");
		model.addObject("policy", policy);
		return model;
	}

	@PostMapping("/update")
	public ModelAndView updatepage(@ModelAttribute Policy policy) {
		if (policy.getPolicyid() != 0) {
			servicedet.editPolicy(policy);
		}
		return new ModelAndView("admin");

	}

	@GetMapping("/delete")
	public ModelAndView deletepolicy(HttpServletRequest request) {
		Integer policyid = Integer.parseInt(request.getParameter("policyid"));
		servicedelete.deletePolicy(policyid);
		return new ModelAndView("admin");
	}

	@PostMapping("/searchbyname")
	public String searchpolicybyname(@RequestParam("pname") String pname, Model model) {
		List<Policy> policies = servicesearchbyname.searchPolicybyName(pname);
		model.addAttribute("searchbyname", policies);
		return "userpolicies";
	}

	@PostMapping("/searchbytype")
	public String searchpolicybytype(@RequestParam("ptype") String ptype, Model model) {
		List<Policy> policies = servicesearchbytype.searchPolicybyType(ptype);
		model.addAttribute("searchbytype", policies);
		return "userpolicies";
	}

	@PostMapping("/searchbyid")
	public String searchpolicybyid(@RequestParam("pid") Integer pid, Model model) {
		List<Policy> policies = servicesearchbyid.searchPolicybyId(pid);
		model.addAttribute("searchbyid", policies);
		return "userpolicies";
	}

	@PostMapping("/searchbycname")
	public String searchpolicybycname(@RequestParam("cname") String cname, Model model) {
		List<Policy> policies = servicesearchbycname.searchPolicybyCname(cname);
		model.addAttribute("searchbycname", policies);
		return "userpolicies";
	}

	@PostMapping("/searchbytime")
	public String searchpolicybytime(@RequestParam("ptime") Integer ptime, Model model) {
		List<Policy> policies = servicesearchbytime.searchPolicybyTime(ptime);
		model.addAttribute("searchbytime", policies);
		return "userpolicies";
	}

	@PostMapping("/searchbyamount")
	public String searchpolicybyamount(@RequestParam("pamount") Double pamount, Model model) {
		List<Policy> policies = servicesearchbyamount.searchPolicybyAmount(pamount);
		model.addAttribute("searchbyamount", policies);
		return "userpolicies";
	}

	@PostMapping("/specificsearch")
	public String searchpolicybytype(@RequestParam("pname") String pname, @RequestParam("ptype") String ptype,
			@RequestParam("cname") String cname, @RequestParam("ptime") Integer ptime,
			@RequestParam("pamount") Double pamount, Model model) {
		List<Policy> policies = servicesearchpolicy.searchPolicy(pname, ptype, ptime, pamount, cname);
		model.addAttribute("search", policies);
		return "userpolicies";
	}

}

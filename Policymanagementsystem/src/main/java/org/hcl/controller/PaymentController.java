package org.hcl.controller;

import javax.servlet.http.HttpServletRequest;

import org.hcl.entities.Payment;
import org.hcl.service.ServicePayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PaymentController {

	private ServicePayment servicepay;
	private ServicePayment servicestatus;

	@Autowired
	public PaymentController(ServicePayment servicepay, ServicePayment servicestatus) {
		super();
		this.servicepay = servicepay;
		this.servicestatus = servicestatus;
	}

	@GetMapping("/pay")
	String showpayment(HttpServletRequest request, Model model) {
		Integer pid = Integer.parseInt(request.getParameter("policyid"));
		Payment payment = servicepay.getPolicypayment(pid);
		model.addAttribute("payment", payment);
		return "payment";
	}

	@GetMapping("/paynow")
	String showmode(@RequestParam("id") Integer id, Model model) {
		model.addAttribute("pid", id);
		return "paymentmode";
	}

	@PostMapping("/paymode")
	String selectpaymentmode(@RequestParam("mode") String mode, @RequestParam("policyid") Integer pid, Model model) {
		model.addAttribute("policyid", pid);
		if (mode.equals("creditdebit"))
			return "creditdebit";
		else if (mode.equals("googlepay"))
			return "googlepay";
		else
			return "netbanking";
	}

	@PostMapping("/gpay")
	String gpay(@RequestParam("pid") Integer pid, Model model) {
		String url = null;
		boolean result = servicestatus.updateStatus(pid);
		if (result) {
			url = "paymentmsg";
		} else
			url = "user";
		model.addAttribute("cancelmsg", "Your Transaction is unsuccessful,sorry for the inconvienience");
		return url;
	}
}

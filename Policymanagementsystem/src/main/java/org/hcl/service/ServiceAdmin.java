package org.hcl.service;

import java.util.List;

import javax.validation.Valid;

import org.hcl.entities.Admin;
import org.hcl.entities.Payment;
import org.hcl.entities.Policy;
import org.hcl.entities.User;

public interface ServiceAdmin {
	public Integer insertAdmindetails(Admin a);

	public Integer validateadmin(Integer ad_id, String ad_pw);
}

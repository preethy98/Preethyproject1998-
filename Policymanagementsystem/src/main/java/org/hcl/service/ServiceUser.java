package org.hcl.service;

import org.hcl.entities.User;

public interface ServiceUser {
	public Integer insertUserdetails(User u);

	public Integer validateUser(Integer user_id, String user_pw);
}

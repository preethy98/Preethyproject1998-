package org.hcl.dao;

import java.util.List;

import org.hcl.entities.Policy;
import org.hcl.entities.User;

public interface UserDao {
	public Integer insert(User u);

	Integer validate(Integer user_id, String user_pw);
}

package org.hcl.service;

import org.hcl.dao.UserDao;
import org.hcl.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceUserImpl implements ServiceUser {
	private UserDao daouser;
	private UserDao userlogindao;

	@Autowired
	public ServiceUserImpl(UserDao daouser, UserDao userlogindao) {
		super();
		this.daouser = daouser;
		this.userlogindao = userlogindao;
	}

	@Override
	public Integer insertUserdetails(User u) {
		// TODO Auto-generated method stub
		return daouser.insert(u);
	}

	@Override
	public Integer validateUser(Integer user_id, String user_pw) {
		// TODO Auto-generated method stub
		return userlogindao.validate(user_id, user_pw);
	}

}

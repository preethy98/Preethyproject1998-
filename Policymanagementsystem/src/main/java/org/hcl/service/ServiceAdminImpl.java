package org.hcl.service;

import java.util.List;

import org.hcl.dao.AdminDao;
import org.hcl.entities.Admin;
import org.hcl.entities.Payment;
import org.hcl.entities.Policy;
import org.hcl.entities.User;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ServiceAdminImpl implements ServiceAdmin {
	private AdminDao dao;
	private AdminDao logindao;

	@Autowired
	public ServiceAdminImpl(AdminDao dao, AdminDao logindao) {
		super();
		this.dao = dao;
		this.logindao = logindao;
	}

	@Override
	public Integer insertAdmindetails(Admin a) {
		// TODO Auto-generated method stub
		return dao.insert(a);
	}

	@Override
	public Integer validateadmin(Integer ad_id, String ad_pw) {
		// TODO Auto-generated method stub
		return logindao.validate(ad_id, ad_pw);
	}
}

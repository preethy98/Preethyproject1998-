package org.hcl.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hcl.entities.Admin;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDaoImpl implements AdminDao {
	private SessionFactory sessionfactory;

	@Autowired
	public AdminDaoImpl(SessionFactory sessionfactory) {
		super();
		this.sessionfactory = sessionfactory;
	}

	@Transactional
	@Override
	public Integer insert(Admin a) {
		Session session = sessionfactory.getCurrentSession();
		Integer i = (Integer) session.save(a);
		return i;
	}

	@Transactional
	@Override
	public Integer validate(Integer ad_id, String ad_pw) {
		// TODO Auto-generated method stub
		Session session = sessionfactory.getCurrentSession();
		Query query = session.createQuery(
				"from org.hcl.entities.Admin as a where a.adminid=:admin_id and a.password=:admin_password");
		query.setParameter("admin_id", ad_id);
		query.setParameter("admin_password", ad_pw);
		List result = query.list();
		if (result.isEmpty()) {
			return 0;
		} else
			return 1;
	}
}

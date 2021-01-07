package org.hcl.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hcl.entities.Policy;
import org.hcl.entities.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
	private SessionFactory sessionfactory;

	@Autowired
	public UserDaoImpl(SessionFactory sessionfactory) {
		super();
		this.sessionfactory = sessionfactory;
	}

	@Transactional
	@Override
	public Integer insert(User u) {

		Session session = sessionfactory.getCurrentSession();
		Integer b = (Integer) session.save(u);
		return b;
	}

	@Transactional
	@Override
	public Integer validate(Integer user_id, String user_pw) {
		// TODO Auto-generated method stub
		Session session = sessionfactory.getCurrentSession();
		Query query = session
				.createQuery("from org.hcl.entities.User as u where u.userid=:user_id and u.password=:user_password");
		query.setParameter("user_id", user_id);
		query.setParameter("user_password", user_pw);
		List result = query.list();
		if (result.isEmpty()) {
			return 0;
		} else
			return 1;
	}
}

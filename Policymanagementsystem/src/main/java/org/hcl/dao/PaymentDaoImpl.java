package org.hcl.dao;

import javax.transaction.Transactional;

import org.hcl.entities.Payment;
import org.hcl.entities.Policy;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentDaoImpl implements PaymentDao {
	private SessionFactory sessionfactory;

	@Autowired
	public PaymentDaoImpl(SessionFactory sessionfactory) {
		super();
		this.sessionfactory = sessionfactory;
	}

	@Transactional
	@Override
	public Payment getPay(Integer policyid) {
		// TODO Auto-generated method stub
		Session session = sessionfactory.getCurrentSession();
		return session.get(Payment.class, policyid);
	}

	@Transactional
	@Override
	public boolean update(Integer policyid) {
		// TODO Auto-generated method stub
		Session session = sessionfactory.getCurrentSession();
		Query query = session.createQuery("update Payment set status=:newstatus where policyid=:pid");
		query.setParameter("pid", policyid);
		query.setParameter("newstatus", "paid");
		int result = query.executeUpdate();
		if (result > 0)
			return true;
		else
			return false;
	}

}

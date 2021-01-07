package org.hcl.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hcl.entities.Policy;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PolicyDaoImpl implements PolicyDao {
	private SessionFactory sessionfactory;

	@Autowired
	public PolicyDaoImpl(SessionFactory sessionfactory) {
		super();
		this.sessionfactory = sessionfactory;
	}

	@Transactional
	@Override
	public Integer insert(Policy policy) {
		// TODO Auto-generated method stub
		Session session = sessionfactory.getCurrentSession();
		Integer i = (Integer) session.save(policy);
		return i;
	}

	@Transactional
	@Override
	public List<Policy> getAll() {
		// TODO Auto-generated method stub
		Session session = sessionfactory.getCurrentSession();
		Query query = session.createQuery(" from org.hcl.entities.Policy as p");
		List<Policy> policies = query.list();
		return policies;
	}

	@Transactional
	@Override
	public Policy getPolicy(Integer policyid) {
		// TODO Auto-generated method stub
		Session session = sessionfactory.getCurrentSession();
		return session.get(Policy.class, policyid);
	}

	@Transactional
	@Override
	public Policy edit(Policy policy) {
		// TODO Auto-generated method stub
		Session session = sessionfactory.getCurrentSession();
		session.update(policy);
		return policy;
	}

	@Transactional
	@Override
	public void delete(Integer policyid) {
		// TODO Auto-generated method stub
		Session session = sessionfactory.getCurrentSession();
		Policy policy = session.load(Policy.class, policyid);
		if (policy != null) {
			session.delete(policy);
		}
	}

	@Transactional
	@Override
	public List<Policy> searchbyname(String pname) {
		// TODO Auto-generated method stub
		Session session = sessionfactory.getCurrentSession();
		Query query = session.createQuery("from org.hcl.entities.Policy as p where p.policyname=:policy_name");
		query.setParameter("policy_name", pname);
		List<Policy> result = query.list();
		return result;

	}

	@Transactional
	@Override
	public List<Policy> searchbypid(Integer pid) {
		// TODO Auto-generated method stub
		Session session = sessionfactory.getCurrentSession();
		Query query = session.createQuery("from org.hcl.entities.Policy as p where p.policyid=:policy_id");
		query.setParameter("policy_id", pid);
		List<Policy> result = query.list();
		return result;

	}

	@Transactional
	@Override
	public List<Policy> searchbyptype(String ptype) {
		// TODO Auto-generated method stub
		Session session = sessionfactory.getCurrentSession();
		Query query = session.createQuery("from org.hcl.entities.Policy as p where p.policytype=:policy_type");
		query.setParameter("policy_type", ptype);
		List<Policy> result = query.list();
		return result;

	}

	@Transactional
	@Override
	public List<Policy> searchbyptime(Integer ptime) {
		// TODO Auto-generated method stub
		Session session = sessionfactory.getCurrentSession();
		Query query = session.createQuery("from org.hcl.entities.Policy as p where p.policyduration=:policy_time");
		query.setParameter("policy_time", ptime);
		List<Policy> result = query.list();
		return result;

	}

	@Transactional
	@Override
	public List<Policy> searchbypamount(Double pamount) {
		// TODO Auto-generated method stub
		Session session = sessionfactory.getCurrentSession();
		Query query = session.createQuery("from org.hcl.entities.Policy as p where p.policyamount=:policy_amount");
		query.setParameter("policy_amount", pamount);
		List<Policy> result = query.list();
		return result;

	}

	@Transactional
	@Override
	public List<Policy> searchbycname(String cname) {
		// TODO Auto-generated method stub
		Session session = sessionfactory.getCurrentSession();
		Query query = session.createQuery("from org.hcl.entities.Policy as p where p.companyname=:policy_cname");
		query.setParameter("policy_cname", cname);
		List<Policy> result = query.list();
		return result;

	}

	@Transactional
	@Override
	public List<Policy> search(String pname, String ptype, String cname, Double pamount, Integer ptime) {
		// TODO Auto-generated method stub
		Session session = sessionfactory.getCurrentSession();
		Query query = session.createQuery(
				"from org.hcl.entities.Policy as p where p.policyname=:policy_name and p.policytype=:policy_type and  p.policyduration=:policy_time and p.policyamount=:policy_amount and p.companyname=:policy_cname");
		query.setParameter("policy_name", pname);
		query.setParameter("policy_type", ptype);
		query.setParameter("policy_time", ptime);
		query.setParameter("policy_amount", pamount);
		query.setParameter("policy_cname", cname);
		List<Policy> result = query.list();
		return result;
	}
}

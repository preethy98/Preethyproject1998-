package org.hcl.dao;

import java.util.List;

import org.hcl.entities.Policy;

public interface PolicyDao {
	Integer insert(Policy policy);

	List<Policy> getAll();

	Policy getPolicy(Integer policyid);

	Policy edit(Policy policy);

	void delete(Integer policyid);

	List<Policy> searchbyname(String pname);

	List<Policy> searchbypid(Integer pid);

	List<Policy> searchbyptype(String ptype);

	List<Policy> searchbyptime(Integer ptime);

	List<Policy> searchbypamount(Double pamount);

	List<Policy> searchbycname(String cname);

	List<Policy> search(String pname, String ptype, String cname, Double pamount, Integer ptime);
}

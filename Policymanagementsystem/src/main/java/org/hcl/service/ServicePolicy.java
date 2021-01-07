package org.hcl.service;

import java.util.List;

import org.hcl.entities.Policy;

public interface ServicePolicy {
	public Integer insertPolicydetails(Policy policy);

	public List<Policy> getPolicies();

	public Policy editPolicy(Policy policy);

	public Policy getPolicy(Integer policyid);

	public void deletePolicy(Integer policyid);

	public List<Policy> searchPolicybyName(String pname);

	public List<Policy> searchPolicybyId(Integer pid);

	public List<Policy> searchPolicybyType(String ptype);

	public List<Policy> searchPolicybyTime(Integer ptime);

	public List<Policy> searchPolicybyAmount(Double pamount);

	public List<Policy> searchPolicybyCname(String cname);

	public List<Policy> searchPolicy(String pname, String ptype, Integer ptime, Double pamount, String cname);

}

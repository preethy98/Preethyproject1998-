package org.hcl.service;

import java.util.List;

import org.hcl.dao.PolicyDao;
import org.hcl.entities.Policy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicePolicyImpl implements ServicePolicy {
	private PolicyDao policydao;
	private PolicyDao policyviewdao;
	private PolicyDao editdao;
	private PolicyDao policydetdao;
	private PolicyDao deletedao;
	private PolicyDao policybynamedao;
	private PolicyDao policybypiddao;
	private PolicyDao policybytypedao;
	private PolicyDao policybytimedao;
	private PolicyDao policybyamountdao;
	private PolicyDao policybycnamedao;
	private PolicyDao searchdao;

	public ServicePolicyImpl() {
		// TODO Auto-generated constructor stub
	}

	public PolicyDao getPolicydao() {
		return policydao;
	}

	@Autowired
	public void setPolicydao(PolicyDao policydao) {
		this.policydao = policydao;
	}

	public PolicyDao getPolicyviewdao() {
		return policyviewdao;
	}

	@Autowired
	public void setPolicyviewdao(PolicyDao policyviewdao) {
		this.policyviewdao = policyviewdao;
	}

	public PolicyDao getEditdao() {
		return editdao;
	}

	@Autowired
	public void setEditdao(PolicyDao editdao) {
		this.editdao = editdao;
	}

	public PolicyDao getPolicydetdao() {
		return policydetdao;
	}

	@Autowired
	public void setPolicydetdao(PolicyDao policydetdao) {
		this.policydetdao = policydetdao;
	}

	public PolicyDao getDeletedao() {
		return deletedao;
	}

	@Autowired
	public void setDeletedao(PolicyDao deletedao) {
		this.deletedao = deletedao;
	}

	public PolicyDao getPolicybynamedao() {
		return policybynamedao;
	}

	@Autowired
	public void setPolicybynamedao(PolicyDao policybynamedao) {
		this.policybynamedao = policybynamedao;
	}

	public PolicyDao getPolicybypiddao() {
		return policybypiddao;
	}

	@Autowired
	public void setPolicybypiddao(PolicyDao policybypiddao) {
		this.policybypiddao = policybypiddao;
	}

	public PolicyDao getPolicybytypedao() {
		return policybytypedao;
	}

	@Autowired
	public void setPolicybytypedao(PolicyDao policybytypedao) {
		this.policybytypedao = policybytypedao;
	}

	public PolicyDao getPolicybytimedao() {
		return policybytimedao;
	}

	@Autowired
	public void setPolicybytimedao(PolicyDao policybytimedao) {
		this.policybytimedao = policybytimedao;
	}

	public PolicyDao getPolicybyamountdao() {
		return policybyamountdao;
	}

	@Autowired
	public void setPolicybyamountdao(PolicyDao policybyamountdao) {
		this.policybyamountdao = policybyamountdao;
	}

	public PolicyDao getPolicybycnamedao() {
		return policybycnamedao;
	}

	@Autowired
	public void setPolicybycnamedao(PolicyDao policybycnamedao) {
		this.policybycnamedao = policybycnamedao;
	}

	public PolicyDao getSearchdao() {
		return searchdao;
	}

	@Autowired
	public void setSearchdao(PolicyDao searchdao) {
		this.searchdao = searchdao;
	}

	@Override
	public Integer insertPolicydetails(Policy policy) {
		// TODO Auto-generated method stub
		return policydao.insert(policy);
	}

	@Override
	public List<Policy> getPolicies() {
		// TODO Auto-generated method stub
		return policyviewdao.getAll();
	}

	@Override
	public Policy editPolicy(Policy policy) {
		// TODO Auto-generated method stub
		return editdao.edit(policy);
	}

	@Override
	public Policy getPolicy(Integer policyid) {
		// TODO Auto-generated method stub
		return policydetdao.getPolicy(policyid);
	}

	@Override
	public void deletePolicy(Integer policyid) {
		// TODO Auto-generated method stub
		deletedao.delete(policyid);
	}

	@Override
	public List<Policy> searchPolicybyName(String pname) {
		// TODO Auto-generated method stub
		return policybynamedao.searchbyname(pname);
	}

	@Override
	public List<Policy> searchPolicybyId(Integer pid) {
		// TODO Auto-generated method stub
		return policybypiddao.searchbypid(pid);
	}

	@Override
	public List<Policy> searchPolicybyType(String ptype) {
		// TODO Auto-generated method stub
		return policybytypedao.searchbyptype(ptype);
	}

	@Override
	public List<Policy> searchPolicybyTime(Integer ptime) {
		// TODO Auto-generated method stub
		return policybytimedao.searchbyptime(ptime);
	}

	@Override
	public List<Policy> searchPolicybyAmount(Double pamount) {
		// TODO Auto-generated method stub
		return policybyamountdao.searchbypamount(pamount);
	}

	@Override
	public List<Policy> searchPolicybyCname(String cname) {
		// TODO Auto-generated method stub
		return policybycnamedao.searchbycname(cname);
	}

	@Override
	public List<Policy> searchPolicy(String pname, String ptype, Integer ptime, Double pamount, String cname) {
		// TODO Auto-generated method stub
		return searchdao.search(pname, ptype, cname, pamount, ptime);
	}
}

package org.hcl.service;

import org.hcl.dao.PaymentDao;
import org.hcl.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicePaymentImpl implements ServicePayment {
	private PaymentDao paydao;
	private PaymentDao statusdao;

	@Autowired
	public ServicePaymentImpl(PaymentDao paydao, PaymentDao statusdao) {
		super();
		this.paydao = paydao;
		this.statusdao = statusdao;
	}

	@Override
	public Payment getPolicypayment(Integer policyid) {
		// TODO Auto-generated method stub
		return paydao.getPay(policyid);
	}

	@Override
	public boolean updateStatus(Integer policyid) {
		// TODO Auto-generated method stub
		return statusdao.update(policyid);
	}

}

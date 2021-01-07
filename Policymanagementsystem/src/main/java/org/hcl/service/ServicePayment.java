package org.hcl.service;

import org.hcl.entities.Payment;

public interface ServicePayment {
	public Payment getPolicypayment(Integer policyid);

	public boolean updateStatus(Integer policyid);
}

package org.hcl.dao;

import org.hcl.entities.Payment;

public interface PaymentDao {
	Payment getPay(Integer policyid);

	boolean update(Integer policyid);
}

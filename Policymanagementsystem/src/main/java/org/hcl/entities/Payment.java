package org.hcl.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {
	@Id
	Integer policyid;
	Date billdate;
	Double paymentamount;
	Double fine;
	Date duedate;
	String status;

	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public Payment(Integer policyid, Date billdate, Double paymentamount, Double fine, Date duedate, String status) {
		super();
		this.policyid = policyid;
		this.billdate = billdate;
		this.paymentamount = paymentamount;
		this.fine = fine;
		this.duedate = duedate;
		this.status = status;
	}

	public Integer getPolicyid() {
		return policyid;
	}

	public void setPolicyid(Integer policyid) {
		this.policyid = policyid;
	}

	public Date getBilldate() {
		return billdate;
	}

	public void setBilldate(Date billdate) {
		this.billdate = billdate;
	}

	public Double getPaymentamount() {
		return paymentamount;
	}

	public void setPaymentamount(Double paymentamount) {
		this.paymentamount = paymentamount;
	}

	public Double getFine() {
		return fine;
	}

	public void setFine(Double fine) {
		this.fine = fine;
	}

	public Date getDuedate() {
		return duedate;
	}

	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

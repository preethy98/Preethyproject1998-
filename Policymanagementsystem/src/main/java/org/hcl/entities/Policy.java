package org.hcl.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer policyid;
	@NotEmpty(message = "policyname is required")
	private String policyname;
	@NotEmpty(message = "policytype is required")
	private String policytype;
	@NotNull(message = "policyduration is required")
	private Integer policyduration;
	@NotNull(message = "policyamount is required")
	private Double policyamount;
	@NotEmpty(message = "companyname is required")
	private String companyname;

	public Policy() {
		// TODO Auto-generated constructor stub
	}

	public Policy(Integer policyid, String policyname, String policytype, Integer policyduration, Double policyamount,
			String companyname) {
		super();
		this.policyid = policyid;
		this.policyname = policyname;
		this.policytype = policytype;
		this.policyduration = policyduration;
		this.policyamount = policyamount;
		this.companyname = companyname;
	}

	public Integer getPolicyid() {
		return policyid;
	}

	public void setPolicyid(Integer policyid) {
		this.policyid = policyid;
	}

	public String getPolicyname() {
		return policyname;
	}

	public void setPolicyname(String policyname) {
		this.policyname = policyname;
	}

	public String getPolicytype() {
		return policytype;
	}

	public void setPolicytype(String policytype) {
		this.policytype = policytype;
	}

	public Integer getPolicyduration() {
		return policyduration;
	}

	public void setPolicyduration(Integer policyduration) {
		this.policyduration = policyduration;
	}

	public Double getPolicyamount() {
		return policyamount;
	}

	public void setPolicyamount(Double policyamount) {
		this.policyamount = policyamount;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
}

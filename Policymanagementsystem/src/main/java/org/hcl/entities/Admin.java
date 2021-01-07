package org.hcl.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Admin {
	@NotEmpty(message = "firstname is required")
	private String firstname;
	@NotEmpty(message = "lastname is required")
	private String lastname;
	@NotNull(message = "age is required")
	private Integer age;
	@NotNull(message = "gender is required")
	private String gender;
	@NotNull(message = "contactnumber is required")
	private Long contactnumber;
	@Id
	@NotNull(message = "adminid is required")
	private Integer adminid;
	@NotEmpty(message = "password is required")
	private String password;

	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(String firstname, String lastname, Integer age, String gender, Long contactnumber, Integer adminid,
			String password) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.gender = gender;
		this.contactnumber = contactnumber;
		this.adminid = adminid;
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(Long contactnumber) {
		this.contactnumber = contactnumber;
	}

	public Integer getAdminid() {
		return adminid;
	}

	public void setAdminid(Integer adminid) {
		this.adminid = adminid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

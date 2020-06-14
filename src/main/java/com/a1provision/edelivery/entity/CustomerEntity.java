package com.a1provision.edelivery.entity;

import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import javax.validation.constraints.NotNull;

/**
 * The Class customerEntity.
 */
@Entity
@Table(name="customer")
@GenericGenerator(name="pkgenCustomerEntity",strategy="increment")
public class CustomerEntity {
	
	/** The customer id. */
	@Id
	@GeneratedValue(generator="pkgenCustomerEntity")
	@Column(name="customer_id")
	@NotNull
	private Long customerId;
	
	
	/** The customer name. */
	@Column(name="customer_name")
	@NotNull
	private String customerName;
	
	/** The customer_address */
	@Column(name="customer_address")
	@NotNull
	private String customerAddress;
	
	
	/** The customer mobile number */
	@Column(name="customer_mobile_number")
	@NotNull
	private BigInteger customerMobileNumber;
	
	
	/** The customer is active */
	@Column(name="customer_is_active",columnDefinition="boolean default false")
	@NotNull
	private boolean customerIsActive;
	
	/** The customer is verified */
	@Column(name="customer_is_verified",columnDefinition="boolean default false")
	@NotNull
	private boolean customerIsVerified;
	
	/** The customer_email_id */
	@Column(name="customer_email_id")
	@NotNull
	private String customerEmailId;
	
	
	/** The customer password. */
	@Column(name="customer_password")
	@NotNull
	private String customerPassword;
	
	
	public Long getcustomerId() {
		return customerId;
	}


	public void setcustomerId(Long customerId) {
		this.customerId = customerId;
	}


	public String getcustomerName() {
		return customerName;
	}


	public void setcustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getcustomerAddress() {
		return customerAddress;
	}


	public void setcustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}


	public BigInteger getcustomerMobileNumber() {
		return customerMobileNumber;
	}


	public void setcustomerMobileNumber(BigInteger customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}


	public boolean iscustomerIsActive() {
		return customerIsActive;
	}


	public void setcustomerIsActive(boolean customerIsActive) {
		this.customerIsActive = customerIsActive;
	}


	public boolean iscustomerIsVerified() {
		return customerIsVerified;
	}


	public void setcustomerIsVerified(boolean customerIsVerified) {
		this.customerIsVerified = customerIsVerified;
	}


	public String getcustomerEmailId() {
		return customerEmailId;
	}


	public void setcustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}


	public String getcustomerPassword() {
		return customerPassword;
	}


	public void setcustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	
	

}

package com.a1provision.edelivery.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import javax.validation.constraints.NotNull;

@Entity
@Table(name="checkout")
@GenericGenerator(name="pkgenCheckoutEntity",strategy="increment")

public class CheckoutEntity {
	
	/** The checkout id */
	@Id
	@GeneratedValue(generator="pkgenCheckoutEntity")
	@Column(name="checkout_id")
	@NotNull
	private Long checkoutId;
	
	@OneToOne(cascade=CascadeType.ALL,orphanRemoval=true)
	@JoinColumn(name="checkout_cart_id",referencedColumnName="cart_id")
	@NotNull
	private CartEntity checkoutCartId;
	
	/** The checkout total */
	@Column(name="checkout_total")
	@NotNull
	private Long checkoutTotal;

	public Long getCheckoutId() {
		return checkoutId;
	}

	public void setCheckoutId(Long checkoutId) {
		this.checkoutId = checkoutId;
	}

	public CartEntity getCheckoutCartId() {
		return checkoutCartId;
	}

	public void setCheckoutCartId(CartEntity checkoutCartId) {
		this.checkoutCartId = checkoutCartId;
	}

	public Long getCheckoutTotal() {
		return checkoutTotal;
	}

	public void setCheckoutTotal(Long checkoutTotal) {
		this.checkoutTotal = checkoutTotal;
	}
	
	
	
	

}

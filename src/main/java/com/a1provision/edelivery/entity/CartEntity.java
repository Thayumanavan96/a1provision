package com.a1provision.edelivery.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import javax.validation.constraints.NotNull;

@Entity
@Table(name="cart")
@GenericGenerator(name="pkgenCartEntity",strategy="increment")

public class CartEntity {
	
	/** The cart id. */
	@Id
	@GeneratedValue(generator="pkgenCartEntity")
	@Column(name="cart_id")
	@NotNull
	private Long cartId;
	
	/** The cart user id */
	@ManyToOne
	@JoinColumn(name="cart_cust_id",referencedColumnName= "customer_id",insertable=false,updatable=false)
	@NotNull
	private CustomerEntity cartCustId;
	
	/** The cart s product id */
	@OneToMany(cascade=CascadeType.ALL,orphanRemoval=true)
	@Column(name="cart_s_product_id")
	@NotNull
	private List<CartEntity> cartSelectedProductId = new ArrayList<>();
	
	
	/** The cart is active */
	@Column(name="cart_is_active",columnDefinition="boolean default false")
	@NotNull
	private boolean cartIsActive;


	public Long getCartId() {
		return cartId;
	}


	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}


	public CustomerEntity getUserId() {
		return cartCustId;
	}


	public void setUserId(CustomerEntity userId) {
		this.cartCustId = userId;
	}


	public List<CartEntity> getCart_s_product_id() {
		return cartSelectedProductId;
	}


	public void setCart_s_product_id(List<CartEntity> cart_s_product_id) {
		this.cartSelectedProductId = cart_s_product_id;
	}


	public boolean isCartIsActive() {
		return cartIsActive;
	}


	public void setCartIsActive(boolean cartIsActive) {
		this.cartIsActive = cartIsActive;
	}
	
	
	

}

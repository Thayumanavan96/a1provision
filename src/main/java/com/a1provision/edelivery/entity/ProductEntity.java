package com.a1provision.edelivery.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import javax.validation.constraints.NotNull;

/**
 * The Class ProductEntity.
 */


@Entity
@Table(name="product")
@GenericGenerator(name="pkgenProductEntity",strategy="increment")
public class ProductEntity {
	
	/** The product id. */
	@Id
	@GeneratedValue(generator="pkgenProductEntity")
	@Column(name="product_id")
	@NotNull
	private Long productId;
	
	/** The product name. */
	@Column(name="product_name")
	@NotNull
	private String productName;
	
	/** The product description */
	@NotNull
	@Column(name="product_desc")
	private String productDescription;
	
	/** The product price */
	@Column(name="product_price")
	private Float productPrice;
	
	/** The product Image Path */
	@Column(name="product_image_path")
	private String productImagePath;
	
	/** The product Brand Name */
	@NotNull
	@Column(name="product_brand_name")
	private String productBrandName;
	
	/** The product is active */
	@Column(name="product_is_active",columnDefinition="boolean default false")
	@NotNull
	private boolean productIsActive;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductImagePath() {
		return productImagePath;
	}

	public void setProductImagePath(String productImagePath) {
		this.productImagePath = productImagePath;
	}

	public String getProductBrandName() {
		return productBrandName;
	}

	public void setProductBrandName(String productBrandName) {
		this.productBrandName = productBrandName;
	}

	public boolean isProductIsActive() {
		return productIsActive;
	}

	public void setProductIsActive(boolean productIsActive) {
		this.productIsActive = productIsActive;
	}
	
	
	
	
	

}

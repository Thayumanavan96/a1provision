package com.a1provision.edelivery.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import javax.validation.constraints.NotNull;

@Entity
@Table(name="product_category")
@GenericGenerator(name="pkgenProductCategoryEntity",strategy="increment")

public class ProductCategoryEntity {
	
	/** The category id */
	@Id
	@GeneratedValue(generator="pkgenProductCategoryEntity")
	@Column(name="category_id")
	@NotNull
	private Long categoryId;
	
	/** The category name */
	@NotNull
	@Column(name="category_name")
	private String categoryName;
	
	
	@OneToMany(cascade=CascadeType.ALL,orphanRemoval=true)
	@Column(name="category_product_id")
	@NotNull
	private List<ProductEntity> categoryProductId = new ArrayList<>();
	
	/** The category Unit */
	@NotNull
	@Column(name="category_unit")
	private String categoryUnit;
	
	/** The category is active */
	@Column(name="category_is_active",columnDefinition="boolean default false")
	@NotNull
	private boolean categoryIsActive;
	

	public boolean isCategoryIsActive() {
		return categoryIsActive;
	}

	public void setCategoryIsActive(boolean categoryIsActive) {
		this.categoryIsActive = categoryIsActive;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<ProductEntity> getCategoryProductId() {
		return categoryProductId;
	}

	public void setCategoryProductId(List<ProductEntity> categoryProductId) {
		this.categoryProductId = categoryProductId;
	}

	public String getCategoryUnit() {
		return categoryUnit;
	}

	public void setCategoryUnit(String categoryUnit) {
		this.categoryUnit = categoryUnit;
	}
	
	
	
	

}

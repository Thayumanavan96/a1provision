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

/**
 * The Class Selected product
 */


@Entity
@Table(name="selected_product")
@GenericGenerator(name="pkgenSelectedProductEntity",strategy="increment")

public class SelectedProductEntity {
	
	/** The selected product id */
	@Id
	@GeneratedValue(generator="pkgenSelectedProductEntity")
	@Column(name="s_id")
	@NotNull
	private Long selectedId;
	
	@OneToMany(cascade=CascadeType.ALL,orphanRemoval=true)
	@Column(name="s_product_id")
	@NotNull
	private List<ProductEntity> selectedProductId = new ArrayList<>();
	
	@OneToMany(cascade=CascadeType.ALL,orphanRemoval=true)
	@Column(name="s_pack_id")
	@NotNull
	private List<OfferPackEntity> selectedPackId = new ArrayList<>();

	
	/** The product quantity */
	@Column(name="s_product_quantity")
	private Long selectedProductQuantity;

	/** The product total */
	@Column(name="s_product_total")
	@NotNull
	private Long selectedProductTotal;

	public Long getSelectedId() {
		return selectedId;
	}

	public void setSelectedId(Long selectedId) {
		this.selectedId = selectedId;
	}

	public List<ProductEntity> getSelectedProductId() {
		return selectedProductId;
	}

	public void setSelectedProductId(List<ProductEntity> selectedProductId) {
		this.selectedProductId = selectedProductId;
	}

	public List<OfferPackEntity> getSelectedPackId() {
		return selectedPackId;
	}

	public void setSelectedPackId(List<OfferPackEntity> selectedPackId) {
		this.selectedPackId = selectedPackId;
	}

	public Long getSelectedProductQuantity() {
		return selectedProductQuantity;
	}

	public void setSelectedProductQuantity(Long selectedProductQuantity) {
		this.selectedProductQuantity = selectedProductQuantity;
	}

	public Long getSelectedProductTotal() {
		return selectedProductTotal;
	}

	public void setSelectedProductTotal(Long selectedProductTotal) {
		this.selectedProductTotal = selectedProductTotal;
	}
	
	
}

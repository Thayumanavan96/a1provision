package com.a1provision.edelivery.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import javax.validation.constraints.NotNull;

/**
 * The Class OfferPackEntity.
 */


@Entity
@Table(name="offer_pack")
@GenericGenerator(name="pkgenOfferPackEntity",strategy="increment")

public class OfferPackEntity {

	/** The pack id. */
	@Id
	@GeneratedValue(generator="pkgenOfferPackEntity")
	@Column(name="pack_id")
	@NotNull
	private Long packId;
	
	/** The pack name. */
	@Column(name="pack_name")
	@NotNull
	private String packName;
	
	/** The pack price */
	@Column(name="pack_price")
	@NotNull
	private Long packPrice;
	
	/** The pack description */
	@Column(name="pack_description")
	@NotNull
	private String packDescription;
	
	/** The pack Image Path */
	@Column(name="pack_image_path")
	@NotNull
	private String packImagePath;
	
	/** The pack offer price */
	@Column(name="pack_offer_price")
	@NotNull
	private Long packOfferPrice;
	
	/** The category is active */
	@Column(name="pack_is_active",columnDefinition="boolean default false")
	@NotNull
	private boolean packIsActive;

	public Long getPackId() {
		return packId;
	}

	public void setPackId(Long packId) {
		this.packId = packId;
	}

	public String getPackName() {
		return packName;
	}

	public void setPackName(String packName) {
		this.packName = packName;
	}

	public Long getPackPrice() {
		return packPrice;
	}

	public void setPackPrice(Long packPrice) {
		this.packPrice = packPrice;
	}

	public String getPackDescription() {
		return packDescription;
	}

	public void setPackDescription(String packDescription) {
		this.packDescription = packDescription;
	}

	public String getPackImagePath() {
		return packImagePath;
	}

	public void setPackImagePath(String packImagePath) {
		this.packImagePath = packImagePath;
	}

	public Long getPackOfferPrice() {
		return packOfferPrice;
	}

	public void setPackOfferPrice(Long packOfferPrice) {
		this.packOfferPrice = packOfferPrice;
	}

	public boolean isOfferPackIsActive() {
		return packIsActive;
	}

	public void setOfferPackIsActive(boolean offerPackIsActive) {
		this.packIsActive = offerPackIsActive;
	}
	
	
	
	
}

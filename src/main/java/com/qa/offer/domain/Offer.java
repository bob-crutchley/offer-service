package com.qa.offer.domain;

public class Offer {
	
	private String offerProduct;

	public Offer(String offerProduct) {
		this.offerProduct = offerProduct;
	}

	public String getOfferProduct() {
		return offerProduct;
	}

	public void setOfferProduct(String offerProduct) {
		this.offerProduct = offerProduct;
	}

	@Override
	public String toString() {
		return "Offer [offerProduct=" + offerProduct + "]";
	}

}

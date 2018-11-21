package com.qa.offer.service;

import org.springframework.stereotype.Service;

import com.qa.offer.constant.OfferConstant;

@Service
public class OfferService {
	
	public String findOfferType(String offerCode) 
	{
		String firstFourLettersOfCode = firstFourLetters(offerCode);
		return typeOfOfferCode(firstFourLettersOfCode);
	}

	private String typeOfOfferCode(String firstTwoLettersOfCode) {
		if(OfferConstant.PREMIUM.equals(firstTwoLettersOfCode)) 
		{
			return OfferConstant.PREMIUM_PRODUCT;
		}
		else if(OfferConstant.GOLD.equals(firstTwoLettersOfCode)) 
		{
			return OfferConstant.GOLD_PRODUCT;
		}
		else if(OfferConstant.SILVER.equals(firstTwoLettersOfCode)) 
		{
			return OfferConstant.SILVER_PRODUCT;
		}
		else 
		{
			return OfferConstant.UNPRIVILAGED;
		}
	}
	
	private String firstFourLetters(String str) {
		String result = "";
		if(str.length() >= 4) 
		{
			result = str.substring(0, 4);
		}
		return result;
	}
}

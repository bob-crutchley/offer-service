package com.qa.offer.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.offer.constant.OfferConstant;
import com.qa.offer.domain.Offer;
import com.qa.offer.service.OfferService;

@RestController
public class OfferController {

    @RequestMapping(OfferConstant.GET_OFFER)
    public Offer offer(@PathVariable(OfferConstant.OFFER_PARAMATER) String offercode) {
    		OfferService service = new OfferService();
    		String offerValue = service.findOfferType(offercode);
    		return new Offer(offerValue);
    }
}

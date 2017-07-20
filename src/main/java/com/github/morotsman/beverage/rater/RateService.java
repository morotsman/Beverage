package com.github.morotsman.beverage.rater;

import com.github.morotsman.beverage.model.Rate;


public interface RateService {
    
    RateDto createRate(String username,RateDto rate);
    
    Rate getRate(String username,long rateId);
    
    RateDto updateRate(String username, RateDto rate);
    
    void deleteRate(String username, long rateId);
    
    Iterable<Rate> getRates(String username);
    
}
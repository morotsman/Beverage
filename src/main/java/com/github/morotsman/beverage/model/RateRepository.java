package com.github.morotsman.beverage.model;

import java.util.stream.Stream;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface RateRepository extends PagingAndSortingRepository<Rate, Long> {
    
    Stream<Rate> findByBevarageUserOrderByUpdatedDesc(BeverageUser user);
    
    Stream<Rate> findByBevarageUserOrderByUpdatedDesc(BeverageUser user,final Pageable pageable); 
    
    void deleteByRateIdAndBevarageUser(long rateId, BeverageUser user);    
    
}

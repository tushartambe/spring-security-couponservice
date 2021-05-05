package com.tushar.spring.repository;

import com.tushar.spring.model.Coupon;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponRepository extends MongoRepository<Coupon, String> {

    public Coupon findByCode(String code);

}

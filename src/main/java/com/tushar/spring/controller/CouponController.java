package com.tushar.spring.controller;

import com.tushar.spring.model.Coupon;
import com.tushar.spring.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coupons")
public class CouponController {

    @Autowired
    CouponRepository couponRepository;

    @PostMapping("/create")
    public Coupon create(@RequestBody Coupon coupon) {
        return couponRepository.save(coupon);
    }

    @GetMapping("/{code}")
    public Coupon getCoupon(@PathVariable String code) {
        return couponRepository.findByCode(code);
    }
}

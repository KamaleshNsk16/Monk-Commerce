package com.monk_commerce.controller;

import com.monk_commerce.model.Coupon;
import com.monk_commerce.service.CouponFilter;
import com.monk_commerce.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CouponController {
    @Autowired
    private CouponService couponService;

    @GetMapping("/api/v1/coupons/{couponId}")
    public Coupon getCoupon(@PathVariable Long couponId) {
        return couponService.getCoupon(couponId).get();
    }
}

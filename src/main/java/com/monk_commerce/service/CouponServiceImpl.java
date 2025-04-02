package com.monk_commerce.service;

import com.monk_commerce.model.Coupon;
import com.monk_commerce.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CouponServiceImpl implements CouponService {

    @Autowired
    private CouponRepository couponRepository;

    @Override
    public Coupon createCoupon(Coupon coupon) {
        return couponRepository.save(coupon);
    }

    @Override
    public List<Coupon> getCoupons(CouponFilter couponFilter) {
        return couponRepository.findAll(Sort.by(Sort.Direction.DESC, "createdTime"));
    }

    @Override
    public Optional<Coupon> getCoupon(Long couponId) {
        return couponRepository.findById(couponId);
    }
}

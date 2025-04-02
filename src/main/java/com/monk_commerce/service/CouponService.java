package com.monk_commerce.service;

import com.monk_commerce.model.Coupon;

import java.util.List;
import java.util.Optional;

public interface CouponService {

    /**
     * This API adds a new coupon to the system.
     *
     * @param coupon    the coupon to be added
     *
     * @return created {@code Coupon}
     */
    public Coupon createCoupon(Coupon coupon);

    /**
     * This API gets the list of coupons.
     *
     * @param couponFilter  the filter to be applied to the coupons while retrieving
     *
     * @return list of {@code Coupon}
     */
    public List<Coupon> getCoupons(CouponFilter couponFilter);

    /**
     * This API gets the coupon by couponId.
     *
     * @param couponId the ID of the coupon to be retrieved
     * @return {@code Coupon}
     */
    public Optional<Coupon> getCoupon(Long couponId);

}

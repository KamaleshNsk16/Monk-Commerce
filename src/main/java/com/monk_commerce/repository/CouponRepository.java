package com.monk_commerce.repository;

import com.monk_commerce.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CouponRepository extends JpaRepository<Coupon, Long> {

    public List<Coupon> findByIdIn(List<Long> ids);
}

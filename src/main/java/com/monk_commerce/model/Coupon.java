package com.monk_commerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Setter
@Entity
@Table(name="Coupons")
public class Coupon {
    @Id
    @GeneratedValue
    private Long couponId;
    private Long id;
    private Boolean isExpired;
    private long createdTime;
    private long modifiedTime;
    private long expiryTime;
    private int couponType;
}
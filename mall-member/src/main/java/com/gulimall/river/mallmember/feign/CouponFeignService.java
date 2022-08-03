package com.gulimall.river.mallmember.feign;

import com.gulimall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mall-coupon")
public  interface  CouponFeignService {

    @RequestMapping("/mallcoupon/coupon/member/list")
    public  R membercoupons();
}

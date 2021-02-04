package com.lfy.controller;

import com.lfy.entities.CommonResult;
import com.lfy.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: 李凡宇
 * @Description:
 * @Date: create in 17:28 2021/2/4
 * @Modified By: 李凡宇
 */
@RestController
public class PaymentController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/payment/save")
    public CommonResult<Payment> save(Payment payment) {
        CommonResult<Payment> commonResult =
                restTemplate.postForObject("http://localhost:8001/payment/save",payment,CommonResult.class);
        return commonResult;
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> save(@PathVariable("id") Long id) {
        CommonResult<Payment> commonResult =
                restTemplate.getForObject("http://localhost:8001/payment/get/"+id,CommonResult.class);
        return commonResult;

    }
}

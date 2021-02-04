package com.lfy.controller;

import com.lfy.entities.CommonResult;
import com.lfy.entities.Payment;
import com.lfy.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: 李凡宇
 * @Description:
 * @Date: create in 16:11 2021/2/4
 * @Modified By: 李凡宇
 */
@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> findPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.findPaymentById(id);
        CommonResult commonResult = null;
        if (payment != null) {
            commonResult = new CommonResult(200,"查找成功",payment);
        } else {
            commonResult = new CommonResult(500,"查找失败",null);
        }
        return commonResult;
    }

    @PostMapping(value = "/payment/save")
    public CommonResult save(@RequestBody Payment payment) {
        if (payment == null) {
            System.out.println("========================");
        }
        System.out.println(payment);
        int save = paymentService.save(payment);
        if (save > 0) {
            return new CommonResult(200,"保存成功",save);
        } else {
            return new CommonResult(400,"保存失败",null);
        }
    }

}

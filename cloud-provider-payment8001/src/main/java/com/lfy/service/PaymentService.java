package com.lfy.service;

import com.lfy.entities.Payment;

/**
 * @Author: 李凡宇
 * @Description:
 * @Date: create in 16:07 2021/2/4
 * @Modified By: 李凡宇
 */
public interface PaymentService {
    Payment findPaymentById(Long id);
    int save(Payment payment);
}

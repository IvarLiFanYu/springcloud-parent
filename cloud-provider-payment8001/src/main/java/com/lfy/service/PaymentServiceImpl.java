package com.lfy.service;

import com.lfy.dao.PaymentDao;
import com.lfy.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: 李凡宇
 * @Description:
 * @Date: create in 16:08 2021/2/4
 * @Modified By: 李凡宇
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public Payment findPaymentById(Long id) {
        return paymentDao.findPaymentById(id);
    }

    @Override
    public int save(Payment payment) {
        return paymentDao.save(payment);
    }
}

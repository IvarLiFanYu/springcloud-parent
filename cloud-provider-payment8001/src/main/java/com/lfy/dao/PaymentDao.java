package com.lfy.dao;

import com.lfy.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: 李凡宇
 * @Description:
 * @Date: create in 15:45 2021/2/4
 * @Modified By: 李凡宇
 */
@Mapper
public interface PaymentDao {
    Payment findPaymentById(Long id);
    int save(Payment payment);
}

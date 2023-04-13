package com.joctas.springcloud.service.impl;

import com.joctas.springcloud.dao.PaymentDao;
import com.joctas.springcloud.entities.Payment;
import com.joctas.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author joctas059
 * @create 2023/4/1
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }

}

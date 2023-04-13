package com.joctas.springcloud.service;

import com.joctas.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author joctas059
 * @create 2023/4/1
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}

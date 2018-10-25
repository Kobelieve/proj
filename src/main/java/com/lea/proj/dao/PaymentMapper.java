package com.lea.proj.dao;

import com.lea.proj.model.Payment;
import com.lea.proj.model.PaymentExample;
import java.util.List;

import com.lea.proj.model.common.ConditionVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component("paymentMapper")
public interface PaymentMapper {
    int countByExample(PaymentExample example);

    int deleteByExample(PaymentExample example);

    int deleteByPrimaryKey(Long orderId);

    int insert(Payment record);

    int insertSelective(Payment record);

    List<Payment> selectByExample(PaymentExample example);

    Payment selectByPrimaryKey(Long orderId);

    int updateByExampleSelective(@Param("record") Payment record, @Param("example") PaymentExample example);

    int updateByExample(@Param("record") Payment record, @Param("example") PaymentExample example);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);

    int saveOrUpdate(Payment record);

    List<String> getAllOrderId();

    List<Payment> selectByConditions(ConditionVo vo);
}
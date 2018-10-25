package com.lea.proj.dao;

import com.lea.proj.model.Refund;
import com.lea.proj.model.RefundExample;
import java.util.List;

import com.lea.proj.model.common.ConditionVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component("refundMapper")
public interface RefundMapper {
    int countByExample(RefundExample example);

    int deleteByExample(RefundExample example);

    int deleteByPrimaryKey(Long orderId);

    int insert(Refund record);

    int insertSelective(Refund record);

    List<Refund> selectByExample(RefundExample example);

    Refund selectByPrimaryKey(Long orderId);

    int updateByExampleSelective(@Param("record") Refund record, @Param("example") RefundExample example);

    int updateByExample(@Param("record") Refund record, @Param("example") RefundExample example);

    int updateByPrimaryKeySelective(Refund record);

    int updateByPrimaryKey(Refund record);

    int saveOrUpdate(Refund record);

    List<String> getAllOrderId();

    List<Refund> selectByConditions(ConditionVo vo);
}
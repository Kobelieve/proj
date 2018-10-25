package com.lea.proj.dao;

import com.lea.proj.model.Settlement;
import com.lea.proj.model.SettlementExample;
import java.util.List;

import com.lea.proj.model.common.ConditionVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component("settlementMapper")
public interface SettlementMapper {
    int countByExample(SettlementExample example);

    int deleteByExample(SettlementExample example);

    int deleteByPrimaryKey(Long orderId);

    int insert(Settlement record);

    int insertSelective(Settlement record);

    List<Settlement> selectByExample(SettlementExample example);

    Settlement selectByPrimaryKey(Long orderId);

    int updateByExampleSelective(@Param("record") Settlement record, @Param("example") SettlementExample example);

    int updateByExample(@Param("record") Settlement record, @Param("example") SettlementExample example);

    int updateByPrimaryKeySelective(Settlement record);

    int updateByPrimaryKey(Settlement record);

    int saveOrUpdate(Settlement record);

    List<String> getAllOrderId();

    List<Settlement> selectByConditions(ConditionVo vo);

    List<String> getAllSettleId();
}
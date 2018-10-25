package com.lea.proj.dao;

import com.lea.proj.model.Cost;
import com.lea.proj.model.CostExample;
import java.util.List;

import com.lea.proj.model.common.ConditionVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component("costMapper")
public interface CostMapper {
    int countByExample(CostExample example);

    int deleteByExample(CostExample example);

    int deleteByPrimaryKey(Long orderId);

    int insert(Cost record);

    int insertSelective(Cost record);

    List<Cost> selectByExample(CostExample example);

    Cost selectByPrimaryKey(Long orderId);

    int updateByExampleSelective(@Param("record") Cost record, @Param("example") CostExample example);

    int updateByExample(@Param("record") Cost record, @Param("example") CostExample example);

    int updateByPrimaryKeySelective(Cost record);

    int updateByPrimaryKey(Cost record);

    int saveOrUpdate(Cost record);

    List<String> getAllOrderId();

    List<Cost> selectByConditions(ConditionVo vo);
}
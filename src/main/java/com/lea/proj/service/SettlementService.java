package com.lea.proj.service;

import com.github.pagehelper.PageInfo;
import com.lea.proj.model.Settlement;
import com.lea.proj.model.common.Select2Vo;

import java.util.List;

public interface SettlementService {

    PageInfo<Settlement> getDataByPage(Integer pageNum, Integer pageSize);

    void importExcel(List<Settlement> settlementList);

    List<Select2Vo> getAllOrderId();

    List<Select2Vo> getAllSettleId();

    PageInfo<Settlement> selectByConditions(Integer pageNum, Integer pageSize, Long id, String startTime, String endTime);

    List<Settlement> getAll();
}

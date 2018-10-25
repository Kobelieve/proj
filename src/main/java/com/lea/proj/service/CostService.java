package com.lea.proj.service;

import com.github.pagehelper.PageInfo;
import com.lea.proj.model.Cost;
import com.lea.proj.model.common.Select2Vo;

import java.util.List;

public interface CostService {

    PageInfo<Cost> getDataByPage(Integer pageNum, Integer pageSize);

    void importExcel(List<Cost> costList);

    List<Select2Vo> getAllOrderId();

    List<Cost> getAll();

    PageInfo<Cost> selectByConditions(Integer pageNum, Integer pageSize, Long id, String startTime, String endTime, String startTime1, String endTime1);
}

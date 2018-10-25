package com.lea.proj.service;


import com.github.pagehelper.PageInfo;
import com.lea.proj.model.Refund;
import com.lea.proj.model.common.Select2Vo;

import java.util.List;

public interface RefundService {

    PageInfo<Refund> getDataByPage(Integer pageNum, Integer pageSize);

    void importExcel(List<Refund> refundList);

    List<Select2Vo> getAllOrderId();

    List<Refund> getAll();

    PageInfo<Refund> selectByConditions(Integer pageNum, Integer pageSize, Long id, String startTime, String endTime);
}

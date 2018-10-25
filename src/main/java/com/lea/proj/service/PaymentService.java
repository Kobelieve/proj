package com.lea.proj.service;

import com.github.pagehelper.PageInfo;
import com.lea.proj.model.Payment;
import com.lea.proj.model.common.CommonOutVo;
import com.lea.proj.model.common.Select2Vo;

import java.util.List;

public interface PaymentService {

    PageInfo<Payment> getDataByPage(Integer pageNum, Integer pageSize);

    List<Payment> getAll();

    void importExcel(List<Payment> paymentList);

    CommonOutVo delByPrimarykey(Long orderId);

    List<Select2Vo> getAllOrderId();

    PageInfo<Payment>selectByConditions(Integer pageNum, Integer pageSize, Long id, String startTime, String endTime);
}

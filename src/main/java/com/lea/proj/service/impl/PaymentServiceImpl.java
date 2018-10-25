package com.lea.proj.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lea.proj.dao.PaymentMapper;
import com.lea.proj.model.Payment;
import com.lea.proj.model.PaymentExample;
import com.lea.proj.model.common.CommonOutVo;
import com.lea.proj.model.common.ConditionVo;
import com.lea.proj.model.common.Select2Vo;
import com.lea.proj.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service("paymentService")
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public PageInfo<Payment> getDataByPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        PaymentExample example = new PaymentExample();
        List<Payment> paymentList = paymentMapper.selectByExample(example);
        PageInfo result = new PageInfo(paymentList);
        return result;
    }

    @Override
    public List<Payment> getAll() {
        PaymentExample example = new PaymentExample();
        List<Payment> paymentList = paymentMapper.selectByExample(example);
        return paymentList;
    }

    @Override
    public void importExcel(List<Payment> paymentList) {
        for (Payment payment : paymentList) {
            paymentMapper.saveOrUpdate(payment);
        }
    }

    @Override
    public CommonOutVo delByPrimarykey(Long orderId) {
        int key = paymentMapper.deleteByPrimaryKey(orderId);
        CommonOutVo outVo = new CommonOutVo();
        outVo.setStatus("0");
        if (key == 1) {
            outVo.setMsg("删除成功");
            return outVo;
        }
        outVo.setStatus("1");
        outVo.setMsg("删除失败");
        return outVo;
    }

    @Override
    public List<Select2Vo> getAllOrderId() {
        List<String> allOrderId = paymentMapper.getAllOrderId();
        List<Select2Vo> result = new ArrayList<>();
        Select2Vo first = new Select2Vo();
        first.setId("");
        first.setText("全部");
        result.add(first);
        for (String id : allOrderId) {
            Select2Vo vo = new Select2Vo();
            vo.setId(id);
            vo.setText(id);
            result.add(vo);
        }

        return result;
    }

    @Override
    public PageInfo<Payment> selectByConditions(Integer pageNum, Integer pageSize, Long id, String startTime, String endTime) {
        PageHelper.startPage(pageNum, pageSize);
        ConditionVo vo = new ConditionVo(id, startTime, endTime);
        List<Payment> paymentList = paymentMapper.selectByConditions(vo);
        PageInfo result = new PageInfo(paymentList);
        return result;
    }

}

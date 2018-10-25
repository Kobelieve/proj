package com.lea.proj.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lea.proj.dao.RefundMapper;
import com.lea.proj.model.Refund;
import com.lea.proj.model.RefundExample;
import com.lea.proj.model.common.ConditionVo;
import com.lea.proj.model.common.Select2Vo;
import com.lea.proj.service.RefundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("refundService")
public class RefundServiceImpl implements RefundService {

    @Autowired
    private RefundMapper refundMapper;

    @Override
    public PageInfo<Refund> getDataByPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        RefundExample example = new RefundExample();
        List<Refund> refundList = refundMapper.selectByExample(example);
        PageInfo result = new PageInfo(refundList);
        return result;
    }

    @Override
    public void importExcel(List<Refund> refundList) {
        for (Refund refund : refundList) {
            refundMapper.saveOrUpdate(refund);
        }
    }

    @Override
    public List<Select2Vo> getAllOrderId() {
        List<String> ids = refundMapper.getAllOrderId();
        List<Select2Vo> result = new ArrayList<>();
        Select2Vo first = new Select2Vo();
        first.setId("");
        first.setText("全部");
        result.add(first);
        for (String id : ids) {
            Select2Vo vo = new Select2Vo();
            vo.setId(id);
            vo.setText(id);
            result.add(vo);
        }
        return result;
    }

    @Override
    public List<Refund> getAll() {
        RefundExample example = new RefundExample();
        return refundMapper.selectByExample(example);
    }

    @Override
    public PageInfo<Refund> selectByConditions(Integer pageNum, Integer pageSize, Long id, String startTime, String endTime) {
        PageHelper.startPage(pageNum, pageSize);
        ConditionVo vo = new ConditionVo(id, startTime, endTime);
        List<Refund> refundList = refundMapper.selectByConditions(vo);
        PageInfo result = new PageInfo(refundList);
        return result;
    }

}

package com.lea.proj.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lea.proj.dao.CostMapper;
import com.lea.proj.model.Cost;
import com.lea.proj.model.CostExample;
import com.lea.proj.model.common.ConditionVo;
import com.lea.proj.model.common.CostConditionVo;
import com.lea.proj.model.common.Select2Vo;
import com.lea.proj.service.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("costService")
public class CostServiceImpl implements CostService {

    @Autowired
    private CostMapper costMapper;

    @Override
    public PageInfo<Cost> getDataByPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        CostExample example = new CostExample();
        List<Cost> costList = costMapper.selectByExample(example);
        PageInfo result = new PageInfo(costList);
        return result;
    }

    @Override
    public void importExcel(List<Cost> costList) {
        for (Cost cost : costList) {
            costMapper.saveOrUpdate(cost);
        }
    }

    @Override
    public List<Select2Vo> getAllOrderId() {
        List<String> allOrderId = costMapper.getAllOrderId();
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
    public List<Cost> getAll() {
        CostExample example = new CostExample();
        List<Cost> costs = costMapper.selectByExample(example);
        return costs;
    }

    @Override
    public PageInfo<Cost> selectByConditions(Integer pageNum, Integer pageSize, Long id, String startTime, String endTime, String startTime1, String endTime1) {
        PageHelper.startPage(pageNum, pageSize);
        CostConditionVo vo = new CostConditionVo(id, startTime, endTime, startTime1, endTime1);
        List<Cost> costList = costMapper.selectByConditions(vo);
        PageInfo result = new PageInfo(costList);
        return result;
    }

}

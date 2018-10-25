package com.lea.proj.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lea.proj.dao.SettlementMapper;
import com.lea.proj.model.Settlement;
import com.lea.proj.model.SettlementExample;
import com.lea.proj.model.common.ConditionVo;
import com.lea.proj.model.common.Select2Vo;
import com.lea.proj.service.SettlementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("settlementService")
public class SettlementServiceImpl implements SettlementService {

    @Autowired
    private SettlementMapper settlementMapper;

    @Override
    public PageInfo<Settlement> getDataByPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        SettlementExample example = new SettlementExample();
        List<Settlement> settlements = settlementMapper.selectByExample(example);
        PageInfo result = new PageInfo(settlements);
        return result;
    }

    @Override
    public void importExcel(List<Settlement> settlementList) {
        for (Settlement settlement : settlementList) {
            System.out.println(settlement);
            settlementMapper.saveOrUpdate(settlement);
        }
    }

    @Override
    public List<Select2Vo> getAllOrderId() {
        List<String> ids = settlementMapper.getAllOrderId();
        List<Select2Vo> result = new ArrayList<>();
        for (String id : ids) {
            Select2Vo vo = new Select2Vo();
            vo.setId(id);
            vo.setText(id);
            result.add(vo);
        }
        return result;
    }

    @Override
    public List<Select2Vo> getAllSettleId() {
        List<String> ids = settlementMapper.getAllSettleId();
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
    public PageInfo<Settlement> selectByConditions(Integer pageNum, Integer pageSize, Long id, String startTime, String endTime) {
        PageHelper.startPage(pageNum, pageSize);
        ConditionVo vo = new ConditionVo(id, startTime, endTime);
        List<Settlement> settlementList = settlementMapper.selectByConditions(vo);
        PageInfo result = new PageInfo(settlementList);
        return result;
    }

    @Override
    public List<Settlement> getAll() {
        SettlementExample example = new SettlementExample();
        List<Settlement> settlements = settlementMapper.selectByExample(example);
        return settlements;
    }
}

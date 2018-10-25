package com.lea.proj.controller;

import com.github.pagehelper.PageInfo;
import com.lea.proj.model.Settlement;
import com.lea.proj.model.common.Select2Vo;
import com.lea.proj.service.SettlementService;
import com.lea.proj.utils.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 结算列表
 */
@RestController
@RequestMapping("/settlement")
public class SettlementController {

    @Autowired
    private SettlementService settlementService;

    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "getDataByPage")
    public PageInfo<Settlement> getDataByPage(@RequestParam Integer pageNum, @RequestParam Integer pageSize) {
        PageInfo<Settlement> result = settlementService.getDataByPage(pageNum, pageSize);
        return result;
    }

    /**
     * 导入
     * @param file
     */
    @RequestMapping(value = "importExcel")
    public void importExcel(@RequestParam("file") MultipartFile file) {
        List<Settlement> settlementList = FileUtil.importExcel(file, 0, 1, Settlement.class);
        settlementService.importExcel(settlementList);
    }

    /**
     * 导出
     * @param response
     */
    @RequestMapping(value = "exportExcel")
    public void exportExcel(HttpServletResponse response) {
        List<Settlement> settlementList = settlementService.getAll();
        FileUtil.exportExcel(settlementList, null, "结算", Settlement.class, "结算列表.xls", true, response);
    }

    /**
     * 获取所有订单id
     * @return
     */
    @RequestMapping(value = "getAllOrderId", method = RequestMethod.GET)
    public List<Select2Vo> getAllOrderId() {
        return settlementService.getAllOrderId();
    }

    /**
     * 获取所有结算单号
     * @return
     */
    @RequestMapping(value = "getAllSettleId", method = RequestMethod.GET)
    public List<Select2Vo> getAllSettleId() {
        return settlementService.getAllSettleId();
    }

    /**
     * 根据条件获取数据
     * @param id
     * @param startTime
     * @param endTime
     * @return
     */
    @RequestMapping(value = "selectByConditions", method = RequestMethod.GET)
    public PageInfo<Settlement> selectByConditions(Integer pageNum, Integer pageSize, Long id, String startTime, String endTime) {
        PageInfo<Settlement> settlementList = settlementService.selectByConditions(pageNum, pageSize, id, startTime, endTime);
        return settlementList;
    }

}

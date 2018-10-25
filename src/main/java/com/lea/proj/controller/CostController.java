package com.lea.proj.controller;

import com.github.pagehelper.PageInfo;
import com.lea.proj.model.Cost;
import com.lea.proj.model.common.Select2Vo;
import com.lea.proj.service.CostService;
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
 * 费用列表
 */
@RestController
@RequestMapping("/cost")
public class CostController {

    @Autowired
    private CostService costService;

    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "getDataByPage")
    public PageInfo<Cost> getDataByPage(@RequestParam Integer pageNum, @RequestParam Integer pageSize) {
        PageInfo<Cost> result = costService.getDataByPage(pageNum, pageSize);
        return result;
    }

    /**
     * 导入
     * @param file
     */
    @RequestMapping(value = "importExcel")
    public void importExcel(@RequestParam("file") MultipartFile file) {
        List<Cost> costList = FileUtil.importExcel(file, 0, 1, Cost.class);
        costService.importExcel(costList);
    }

    /**
     * 导出
     * @param response
     */
    @RequestMapping(value = "exportExcel")
    public void exportExcel(HttpServletResponse response) {
        List<Cost> paymentList = costService.getAll();
        FileUtil.exportExcel(paymentList, null, "费用", Cost.class, "费用列表.xls", true, response);
    }

    /**
     * 获取所有订单id
     * @return
     */
    @RequestMapping(value = "getAllOrderId", method = RequestMethod.GET)
    public List<Select2Vo> getAllOrderId() {
        return costService.getAllOrderId();
    }

    /**
     * 根据条件获取数据
     * @param id
     * @param startTime
     * @param endTime
     * @return
     */
    @RequestMapping(value = "selectByConditions", method = RequestMethod.GET)
    public PageInfo<Cost> selectByConditions(Integer pageNum, Integer pageSize, Long id, String startTime, String endTime, String startTime1, String endTime1) {
        PageInfo<Cost> costList = costService.selectByConditions(pageNum, pageSize, id, startTime, endTime, startTime1, endTime1);
        return costList;
    }


}

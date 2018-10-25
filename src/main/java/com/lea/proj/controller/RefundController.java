package com.lea.proj.controller;

import com.github.pagehelper.PageInfo;
import com.lea.proj.model.Refund;
import com.lea.proj.model.common.Select2Vo;
import com.lea.proj.service.RefundService;
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
 * 退款列表
 */
@RestController
@RequestMapping("/refund")
public class RefundController {

    @Autowired
    private RefundService refundService;

    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "getDataByPage")
    public PageInfo<Refund> getDataByPage(@RequestParam Integer pageNum, @RequestParam Integer pageSize) {
        PageInfo<Refund> result = refundService.getDataByPage(pageNum, pageSize);
        return result;
    }

    /**
     * 导入
     * @param file
     */
    @RequestMapping(value = "importExcel")
    public void importExcel(@RequestParam("file") MultipartFile file) {
        List<Refund> refundList = FileUtil.importExcel(file, 0, 1, Refund.class);
        refundService.importExcel(refundList);
    }

    /**
     * 导出
     * @param response
     */
    @RequestMapping(value = "exportExcel")
    public void exportExcel(HttpServletResponse response) {
        List<Refund> paymentList = refundService.getAll();
        FileUtil.exportExcel(paymentList, null, "退款", Refund.class, "退款列表.xls", true, response);
    }

    /**
     * 获取所有订单id
     * @return
     */
    @RequestMapping(value = "getAllOrderId", method = RequestMethod.GET)
    public List<Select2Vo> getAllOrderId() {
        return refundService.getAllOrderId();
    }

    /**
     * 根据条件获取数据
     * @param id
     * @param startTime
     * @param endTime
     * @return
     */
    @RequestMapping(value = "selectByConditions", method = RequestMethod.GET)
    public PageInfo<Refund> selectByConditions(Integer pageNum, Integer pageSize, Long id, String startTime, String endTime) {
        PageInfo<Refund> refundtList = refundService.selectByConditions(pageNum, pageSize, id, startTime, endTime);
        return refundtList;
    }

}

package com.lea.proj.controller;

import com.github.pagehelper.PageInfo;
import com.lea.proj.model.Payment;
import com.lea.proj.model.common.CommonOutVo;
import com.lea.proj.model.common.Select2Vo;
import com.lea.proj.service.PaymentService;
import com.lea.proj.utils.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 支付列表
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "getDataByPage")
    public PageInfo<Payment> getDataByPage(@RequestParam Integer pageNum, @RequestParam Integer pageSize) {
        PageInfo<Payment> result = paymentService.getDataByPage(pageNum, pageSize);
        return result;
    }

    /**
     * 导出
     * @param response
     */
    @RequestMapping(value = "exportExcel")
    public void exportExcel(HttpServletResponse response) {
        List<Payment> paymentList = paymentService.getAll();
        FileUtil.exportExcel(paymentList, null, "支付", Payment.class, "支付列表.xls", true, response);
    }

    /**
     * 导入
     * @param file
     */
    @RequestMapping(value = "importExcel")
    public void importExcel(@RequestParam("file") MultipartFile file) {
        List<Payment> paymentList = FileUtil.importExcel(file, 0, 1, Payment.class);
        paymentService.importExcel(paymentList);
    }

    /**
     * 根据订单id删除
     * @param orderId
     * @return
     */
    @RequestMapping(value = "delByPrimarykey/{orderId}", method = RequestMethod.GET)
    public CommonOutVo delByPrimarykey(@PathVariable("orderId") Long orderId) {
        return paymentService.delByPrimarykey(orderId);
    }

    /**
     * 获取所有订单id
     * @return
     */
    @RequestMapping(value = "getAllOrderId", method = RequestMethod.GET)
    public List<Select2Vo> getAllOrderId() {
        return paymentService.getAllOrderId();
    }

    /**
     * 根据条件获取数据
     * @param id
     * @param startTime
     * @param endTime
     * @return
     */
    @RequestMapping(value = "selectByConditions", method = RequestMethod.GET)
    public PageInfo<Payment> selectByConditions(Integer pageNum, Integer pageSize, Long id, String startTime, String endTime) {
        PageInfo<Payment> paymentList = paymentService.selectByConditions(pageNum, pageSize, id, startTime, endTime);
        return paymentList;
    }

}
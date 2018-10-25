package com.lea.proj.model.common;

public class CostConditionVo extends ConditionVo {

    private String startTime1;
    private String endTime1;

    public CostConditionVo(Long id, String startTime, String endTime, String startTime1, String endTime1) {
        super(id, startTime, endTime);
        this.startTime1 = startTime1;
        this.endTime1 = endTime1;
    }

    public String getStartTime1() {
        return startTime1;
    }

    public void setStartTime1(String startTime1) {
        this.startTime1 = startTime1;
    }

    public String getEndTime1() {
        return endTime1;
    }

    public void setEndTime1(String endTime1) {
        this.endTime1 = endTime1;
    }

    public CostConditionVo(Long id, String startTime, String endTime) {
        super(id, startTime, endTime);
    }
}

package com.infosys.china.common;

public class ResponseBase {

    private Integer rtnCode;
    private String msg;
    private Object data;

    public ResponseBase() {

    }

    public Integer getRtnCode()
    {
        return rtnCode;
    }

    public void setRtnCode(Integer rtnCode)
    {
        this.rtnCode = rtnCode;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public Object getData()
    {
        return data;
    }

    public void setData(Object data)
    {
        this.data = data;
    }

    public ResponseBase(Integer rtnCode, String msg, Object data) {
        super();
        this.rtnCode = rtnCode;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseBase [rtnCode=" + rtnCode + ", msg=" + msg + ", data=" + data + "]";
    }

}
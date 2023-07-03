package com.neuedu.kjds.util;

/**
 * 系统的通用结果类
 */
public class KJDSResult {
    //响应业务状态
    private Integer status;
    //响应消息
    private String msg;
    //响应的数据
    private Object data;

    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public KJDSResult(Integer status, String msg, Object data) {
        super();
        this.status = status;
        this.msg = msg;
        this.data = data;
    }
    public KJDSResult(Object data) {
        super();
        this.status=200;
        this.msg="ok";
        this.data = data;
    }
    public static KJDSResult build(Integer status,String msg,Object data){
        return new KJDSResult(status,msg,data);
    }
    public static KJDSResult build(Integer status,String msg){
        return new KJDSResult(status,msg,null);
    }
    public static KJDSResult ok(Object data){
        return new KJDSResult(data);
    }
    public static KJDSResult ok(){
        return new KJDSResult(null);
    }
    public KJDSResult() {
        super();
        // TODO Auto-generated constructor stub
    }
}

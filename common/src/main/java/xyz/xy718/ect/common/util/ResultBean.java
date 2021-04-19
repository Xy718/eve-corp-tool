package xyz.xy718.ect.common.util;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class ResultBean {
    private String msg=SUCCESS_MSG;
    private int code=SUCCESS_CODE;
    private Object data;

    private static final String SUCCESS_MSG="操作成功";
    private static final String FAIL_MSG="操作失败";
    private static final int SUCCESS_CODE=0;
    private static final int FAIL_CODE=-1;

    @JsonIgnore
    public Boolean isSuccess(){
        return code==SUCCESS_CODE;
    }

    public ResultBean(String msg, int code, Object data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }
    public ResultBean() {
    }

    public static ResultBean success(String msg,Object data){
        return new ResultBean(msg,SUCCESS_CODE,data);
    }
    public static ResultBean success(){
        return ResultBean.success(SUCCESS_MSG);
    }
    public static ResultBean success(String msg){
        return ResultBean.success(msg,null);
    }
    public static ResultBean success(Object data){
        return ResultBean.success(SUCCESS_MSG,data);
    }

    public static ResultBean fail(String msg,Object data){
        return new ResultBean(msg,FAIL_CODE,data);
    }
    public static ResultBean fail(){
        return ResultBean.fail(FAIL_MSG);
    }
    public static ResultBean fail(String msg){
        return ResultBean.fail(msg,null);
    }
    public static ResultBean fail(Object data){
        return ResultBean.fail(FAIL_MSG,data);
    }
}

package xyz.xy718.ect.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import xyz.xy718.ect.common.annotation.XyController;
import xyz.xy718.ect.common.util.ResultBean;

/**
 * 权限控制器
 * 包含，认证，授权，等权限相关的接口入口
 * @author Xy718
 * @date 2021-04-19 11:37:29
 **/
@Slf4j
@RefreshScope
@XyController("/auth")
public class AuthController {
    @Value("${author}")
    String author;

    @GetMapping("/test")
    public ResultBean getTest(){
        return ResultBean.success("开始徒步了，家人们");
    }
    @GetMapping("/test2")
    public ResultBean getTest2(){
        return ResultBean.success(author);
    }
}

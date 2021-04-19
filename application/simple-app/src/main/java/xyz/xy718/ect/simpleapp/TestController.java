package xyz.xy718.ect.simpleapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import xyz.xy718.ect.common.annotation.XyController;
import xyz.xy718.ect.common.service.rpc.WebAuthServiceRPC;
import xyz.xy718.ect.common.util.ResultBean;

import javax.annotation.Resource;

@Slf4j
@XyController("/simple")
public class TestController {
    @Resource
    WebAuthServiceRPC webAuthServiceRPC;

    @GetMapping("/kkp")
    public ResultBean getTest(){
        return webAuthServiceRPC.test();
    }
    @GetMapping("/kkp2")
    public ResultBean getTest2(){
        return webAuthServiceRPC.test2();
    }
}

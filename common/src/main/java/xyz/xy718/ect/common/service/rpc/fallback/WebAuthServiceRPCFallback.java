package xyz.xy718.ect.common.service.rpc.fallback;

import xyz.xy718.ect.common.service.rpc.WebAuthServiceRPC;
import xyz.xy718.ect.common.util.ResultBean;

public class WebAuthServiceRPCFallback implements WebAuthServiceRPC {

    @Override
    public ResultBean test() {
        return ResultBean.fail("test有事，请稍后");
    }

    @Override
    public ResultBean test2() {
        return ResultBean.fail("别求了");
    }
}

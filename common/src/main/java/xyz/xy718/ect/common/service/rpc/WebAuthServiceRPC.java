package xyz.xy718.ect.common.service.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.xy718.ect.common.configuration.FeignConfiguration;
import xyz.xy718.ect.common.service.rpc.fallback.WebAuthServiceRPCFallback;
import xyz.xy718.ect.common.util.ResultBean;

@FeignClient(name = "app-authority", fallback = WebAuthServiceRPCFallback.class,
        configuration = FeignConfiguration.class)
public interface WebAuthServiceRPC {
    @GetMapping("/auth/test")
    ResultBean test();

    @GetMapping("/auth/test2")
    ResultBean test2();
}

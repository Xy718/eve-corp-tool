package xyz.xy718.ect.common.configuration;

import org.springframework.context.annotation.Bean;
import xyz.xy718.ect.common.service.rpc.fallback.WebAuthServiceRPCFallback;

public class FeignConfiguration {
    @Bean
    public WebAuthServiceRPCFallback webAuthServiceFallback(){return new WebAuthServiceRPCFallback();}
}

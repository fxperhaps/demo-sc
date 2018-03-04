package io.eightmonth.sc.democonsumermovie.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonConfiguration {
    @Bean

    public IRule ribbonRule(){
        // LB规则改为随机
        return new RandomRule();
    }
}

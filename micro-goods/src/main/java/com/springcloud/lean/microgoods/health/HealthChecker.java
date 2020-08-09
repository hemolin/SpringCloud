package com.springcloud.lean.microgoods.health;

import com.springcloud.lean.microgoods.controller.GoodsController;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HealthChecker implements HealthIndicator {
    @Override
    public Health health() {
        if(true){
            return new Health.Builder(Status.UP).build();
        }else{
            return new Health.Builder(Status.DOWN).build();
        }
    }
}

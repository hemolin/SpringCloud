package com.springcloud.lean.microweb.health;

import com.springcloud.lean.microweb.controller.GoodsController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class HealthChecker implements HealthIndicator {
    @Override
    public Health health() {
        log.info("GoodsController.canVisitDB");
        if(GoodsController.canVisitDB){
            return new Health.Builder(Status.UP).build();
        }else{
            return new Health.Builder(Status.DOWN).build();
        }
    }
}

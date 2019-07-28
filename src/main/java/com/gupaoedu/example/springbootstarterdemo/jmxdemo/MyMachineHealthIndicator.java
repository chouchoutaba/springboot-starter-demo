package com.gupaoedu.example.springbootstarterdemo.jmxdemo;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Jiang
 * @Date: 2019/7/28 11:37
 */
@Component
public class MyMachineHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        Map<String, Object> details = new HashMap<>(4);
        details.put("availableProcessors", Runtime.getRuntime().availableProcessors());
        details.put("freeMemory", Runtime.getRuntime().freeMemory());
        details.put("maxMemory", Runtime.getRuntime().maxMemory());
        details.put("totalMemory", Runtime.getRuntime().totalMemory());
        builder.up().withDetails(details).build();

    }
}

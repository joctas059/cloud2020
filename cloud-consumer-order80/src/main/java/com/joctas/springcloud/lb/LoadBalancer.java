package com.joctas.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author joctas059
 * @create 2023/4/6
 */
public interface LoadBalancer {
    //收集Eruake所有
    ServiceInstance instance (List<ServiceInstance> serviceInstances);
}

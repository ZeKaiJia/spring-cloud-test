package com.ky.kevin.component;

import com.netflix.appinfo.InstanceInfo;
import org.springframework.cloud.netflix.eureka.server.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Author: Kevin
 * @Date: 2021/3/13 1:52 下午
 */
@Component
public class EurekaStateChangeListener {
    @EventListener
    public void listen(EurekaInstanceCanceledEvent event) {
        System.err.println(event.getServerId() + "\t" + event.getAppName() + "服务下线 ");
    }

    @EventListener
    public void listen(EurekaInstanceRegisteredEvent event) {
        InstanceInfo instanceInfo = event.getInstanceInfo();
        System.err.println(instanceInfo.getAppName() + " 进行注册 ");
    }

    @EventListener
    public void listen(EurekaInstanceRenewedEvent event) {
        System.err.println(event.getServerId() + "\t" + event.getAppName() + " 接受到心跳包 ");
    }

    @EventListener
    public void listen(EurekaRegistryAvailableEvent event) {
        System.err.println("中心启动 ");
    }

    @EventListener
    public void listen(EurekaServerStartedEvent event) {
        System.err.println("服务启动 ");
    }
}

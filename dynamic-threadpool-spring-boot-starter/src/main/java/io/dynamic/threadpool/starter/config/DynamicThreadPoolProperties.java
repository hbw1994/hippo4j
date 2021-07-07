package io.dynamic.threadpool.starter.config;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 动态线程池配置
 *
 * @author chen.ma
 * @date 2021/6/22 09:14
 */
@Slf4j
@Getter
@Setter
@ConfigurationProperties(prefix = DynamicThreadPoolProperties.PREFIX)
public class DynamicThreadPoolProperties {

    public static final String PREFIX = "spring.dynamic.thread-pool";

    /**
     * 服务地址
     */
    private String serverAddr;

    /**
     * 租户 ID
     */
    private String namespace;

    /**
     * 项目 ID
     */
    private String itemId;

    /**
     * 是否开启动态线程池
     */
    private boolean enabled;

    /**
     * 是否开启 banner
     */
    private boolean banner = true;
}

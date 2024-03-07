package com.wxw.ssyx.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: RedissonConfig
 * Package: com.wxw.ssyx.common.config
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/11/23 14:17
 * @Version 1.0
 */
@Data
@Configuration
@ConfigurationProperties("spring.redis")
public class RedissonConfig {

    private String host;

    private String addresses;

    private String password;

    private String port;

    private int timeout = 3000;
    private int connectionPoolSize = 64;
    private int connectionMinimumIdleSize=10;
    private int pingConnectionInterval = 60000;
    private static String ADDRESS_PREFIX = "redis://";

    /**
     * 自动装配
     *
     */
//    @Bean
//    RedissonClient redissonSingle() {
//        Config config = new Config();
//        //  判断redis 的host是否为空
//        if(StringUtils.isEmpty(host)){
//            throw new RuntimeException("host is  empty");
//        }
//        //  配置host，port等参数
//        SingleServerConfig serverConfig = config.useSingleServer()
//                //redis://127.0.0.1:7181
//                .setAddress(ADDRESS_PREFIX + this.host + ":" + port)
//                .setTimeout(this.timeout)
//                .setPingConnectionInterval(pingConnectionInterval)
//                .setConnectionPoolSize(this.connectionPoolSize)
//                .setConnectionMinimumIdleSize(this.connectionMinimumIdleSize);
//        //  判断进入redis 是否密码
//        if(!StringUtils.isEmpty(this.password)) {
//            serverConfig.setPassword(this.password);
//        }
//        // RedissonClient redisson = Redisson.create(config);
//        return Redisson.create(config);
//    }
}
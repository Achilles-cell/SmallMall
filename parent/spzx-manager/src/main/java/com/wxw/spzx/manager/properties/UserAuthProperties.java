package com.wxw.spzx.manager.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * ClassName: UserAuthProperties
 * Package: com.wxw.spzx.manager.properties
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/12/19 15:31
 * @Version 1.0
 */
@Data
@ConfigurationProperties(prefix = "spzx.auth")      // 前缀不能使用驼峰命名
public class UserAuthProperties {
    private List<String> noAuthUrls ;
}

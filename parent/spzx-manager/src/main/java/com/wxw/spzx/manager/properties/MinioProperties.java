package com.wxw.spzx.manager.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * ClassName: MinioProperties
 * Package: com.wxw.spzx.manager.properties
 * Description:
 *
 * @Author 风雅颂
 * @Create 2023/12/23 15:55
 * @Version 1.0
 */
@Data
@ConfigurationProperties(prefix="spzx.minio") //读取节点
public class MinioProperties {

    private String endpointUrl;
    private String accessKey;
    private String secreKey;
    private String bucketName;

}

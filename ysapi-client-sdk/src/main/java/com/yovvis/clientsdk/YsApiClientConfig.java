package com.yovvis.clientsdk;

import com.yovvis.clientsdk.client.YsApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 客户端配置
 *
 * @author yovvis
 * @date 2023/11/30
 */
@Configuration
@ConfigurationProperties("ysapi.client")
@Data
@ComponentScan
public class YsApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public YsApiClient YsApiClientConfig() {
        return new YsApiClient(accessKey, secretKey);
    }
}

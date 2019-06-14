package com.example.dev.configclient.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 自定义业务配置类
 *
 * @author yinzl
 * @Title MyBizConfig
 * @Package com.example.dev.configclient.config
 * @Description:
 * @email
 */
@ConfigurationProperties(prefix = "biz")
@Component
public class MyBizConfig {

    private String host;

    private Integer port;

    private String username;

    private String password;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

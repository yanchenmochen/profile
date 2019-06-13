package com.example.profile.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 服务器配置类
 *
 * @Owner: SongQuanHeng
 * @Time: 2019/6/11-14:27
 * @Version:
 * @Change:
 */
@Component
public class ServerConfig {
    @Value("${tomcat.ip}")
    private String ip;
    @Value("${tomcat.port}")
    private int port;
    @Value("${tomcat.projectName}")
    private String proectName;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getProectName() {
        return proectName;
    }

    public void setProectName(String proectName) {
        this.proectName = proectName;
    }

    public String getUrl() {
        return "http://" + getIp()+":"+getPort()+getProectName();
    }
}

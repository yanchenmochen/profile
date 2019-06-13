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
@ConfigurationProperties(prefix = "tomcat")
public class ServerConfig {
    private String ip;
    private int port;
    private String projectName;

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

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getUrl() {
        return "http://" + getIp()+":"+getPort()+"/"+getProjectName();
    }
}

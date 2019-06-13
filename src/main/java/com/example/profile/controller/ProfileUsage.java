package com.example.profile.controller;

import com.example.profile.model.ServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通过Controller演示
 *
 * @Owner: SongQuanHeng
 * @Time: 2019/6/11-15:17
 * @Version:
 * @Change:
 */
@RestController
public class ProfileUsage {

    @Autowired
    private ServerConfig config;

    @RequestMapping("/hello")
    public String use() {
        return config.getUrl();
    }
}

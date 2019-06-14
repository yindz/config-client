package com.example.dev.configclient.controller;

import com.example.dev.configclient.config.MyBizConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 通过配置类注入值(自动刷新)
 *
 * @author yinzl
 * @Title DemoController
 * @Package com.example.dev.configclient.controller
 * @Description:
 * @email
 */
@RestController
@RequestMapping("/demo1")
public class Demo1Controller {

    @Autowired
    private MyBizConfig bizConfig;

    @RequestMapping(value = "/queryMyConfig")
    public Map<String, Object> queryMyConfig(){
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("host", bizConfig.getHost());
        map.put("port", bizConfig.getPort());
        map.put("username", bizConfig.getUsername());
        map.put("password", bizConfig.getPassword());
        map.put("timestamp", LocalDateTime.now());
        return map;
    }
}

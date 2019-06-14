package com.example.dev.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 直接注入值(无刷新)
 *
 * @author yinzl
 * @Title DemoController
 * @Package com.example.dev.configclient.controller
 * @Description:
 * @email
 */
@RestController
@RequestMapping("/demo3")
public class Demo3Controller {

    @Value("${sys.title}")
    private String title;

    @RequestMapping(value = "/queryMyConfig")
    public Map<String, Object> queryMyConfig() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("title", title);
        map.put("timestamp", LocalDateTime.now());
        return map;
    }
}

package com.partick.springcloudcourse.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制层，用于项目初始化构建测试
 * @author partick_peng
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "success";
    }
}

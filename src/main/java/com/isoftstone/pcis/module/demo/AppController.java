package com.isoftstone.pcis.module.demo;

import com.isoftstone.pcis.module.demo.service.AppServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Demo
 *
 * @Description:
 * @Date: 2020/7/10 14:26
 * @auther: pfyangf@isoftstone.com
 */
@RestController
public class AppController {

    @Autowired
    private AppServiceImpl appService;

    /**
     * <b>功能：test request</b><br>
     * <br>
     * <b>参数：</b> [request] <br>
     * <b>返回：</b> java.util.Map<java.lang.String,java.lang.Object> <br>
     * <b>创建日期：</b> 14:35 2020/7/10 <br>
     *
     * @author pfyangf@isoftstone.com<br>
     * @version 1.0
     */
    @GetMapping("hi")
    Map<String, Object> sayHi(HttpServletRequest request) {
        Map<String, Object> res = new HashMap<>();
        res.put("service", appService.getValue());
        res.put("parameter", request.getParameterMap());
        return res;
    }
}

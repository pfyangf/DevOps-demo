package com.isoftstone.pcis.module;

import com.isoftstone.pcis.DevOpsDemoApplication;
import com.isoftstone.pcis.module.demo.service.AppServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DevOpsDemoApplication.class})
class DevOpsDemoApplicationTests {

    private Logger logger = LoggerFactory.getLogger(DevOpsDemoApplicationTests.class);

    @Autowired
    private AppServiceImpl appService;

    @Test
    void contextLoads() {
        logger.info("test -------- begin");
        Assert.assertEquals(appService.getValue(), "hi");
    }
}

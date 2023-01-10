package com.andantonyan.apitester.common;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@SpringBootTest
@EnableFeignClients(basePackages = "com.andantonyan.apitester.github.client")
public abstract class AbstractApiTest extends AbstractTestNGSpringContextTests {
}

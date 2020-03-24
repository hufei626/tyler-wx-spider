package com.tyler.spider.web;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: WxSpiderLanuch.java
 * @author: f.hu
 * @date: 2020-03-24 10:42
 * @Description:
 */
@EnableDiscoveryClient
@SpringBootApplication
public class WxSpiderLanuch {

    public static void main(String[] args) {
        new SpringApplicationBuilder(WxSpiderLanuch.class).run(args);
    }
}

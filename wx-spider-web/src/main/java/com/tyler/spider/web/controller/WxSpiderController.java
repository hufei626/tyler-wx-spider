package com.tyler.spider.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: WxSpiderController.java
 * @author: f.hu
 * @date: 2020-03-24 11:11
 * @Description:
 */
@Controller
@RequestMapping(value = "/invoke")
public class WxSpiderController {

    /*@Value("${str}")
    private String str;*/

    @RequestMapping(value = "/spider")
    @ResponseBody
    public String spider() {
        return "tyler wx spider";
    }
}

package com.imooc.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
public class HelloWordController {
    @GetMapping("")
    public String index(){

        return "hello word !!";
    }
}

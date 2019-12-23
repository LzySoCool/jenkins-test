package com.jax.cloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author jax
 * @date 2019/12/19 19:09
 **/
@RequestMapping("/jenkins")
@RestController
public class Test {

    @GetMapping("test")
    public String helloWord(){
        return "hello,word!";
    }
}

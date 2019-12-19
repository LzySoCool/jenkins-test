package com.jax.cloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author jax
 * @date 2019/12/19 19:09
 **/
@RequestMapping("/jenkins")
@RestController
public class Test {

    @GetMapping("test")
    public void helloWord(){
        System.out.println("hello,Word!");
    }
}

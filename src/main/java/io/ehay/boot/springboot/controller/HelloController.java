package io.ehay.boot.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ehay@naver.com on 2018-09-21
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

@RestController
public class HelloController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello, Spring Boot !!";
    }
}

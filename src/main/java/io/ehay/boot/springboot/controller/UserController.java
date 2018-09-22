package io.ehay.boot.springboot.controller;

import io.ehay.boot.springboot.model.UserVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ehay@naver.com on 2018-09-21
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

/**
 * 책과 관련 없음
 * REST API 랭킹시스템 테스트용
 */

@RestController
public class UserController {

    @PostMapping("/score")
    public UserVO getUserScore(@RequestBody UserVO user){
        System.out.println(user.getId());
        System.out.println(user.getScore());
        return user;
    }
}

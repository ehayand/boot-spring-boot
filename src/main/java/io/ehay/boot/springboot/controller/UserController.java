package io.ehay.boot.springboot.controller;

import io.ehay.boot.springboot.model.User;
import io.ehay.boot.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // create
    @PutMapping
    public User put(@RequestParam(value = "name") String name,
                    @RequestParam(value = "score") int score){
        return userRepository.save(new User(name, score));
    }

    // read all
    @GetMapping(value = "list")
    public Iterable<User> findAll(){
        return userRepository.findAll();
    }

    // read one
    @GetMapping(value = "{id}")
    public User findOne(@PathVariable(value = "id") Long id){
        return userRepository.findById(id).orElse(null);
    }

    // update
    @PostMapping(value = "{id}")
    public User update(@PathVariable(value = "id") Long id,
                        @PathVariable(value = "name") String name){
        User user = userRepository.findById(id).orElse(null);
        user.setName(name);
        return userRepository.save(user);
    }

    // delete
    @DeleteMapping
    public void delete(@RequestParam(value = "id") Long id){
        userRepository.deleteById(id);
    }

}

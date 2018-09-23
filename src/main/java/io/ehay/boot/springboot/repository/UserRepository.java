package io.ehay.boot.springboot.repository;

import io.ehay.boot.springboot.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ehay@naver.com on 2018-09-23
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

/**
 * 책과 관련 없음
 * REST API 랭킹시스템 테스트용
 */

public interface UserRepository extends CrudRepository<User, Long> {



}

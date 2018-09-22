package io.ehay.boot.springboot.model;

/**
 * Created by ehay@naver.com on 2018-09-21
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

/**
 * 책과 관련 없음
 * REST API 랭킹시스템 테스트용
 */

public class UserVO {

    private String id;
    private int score;

    public UserVO() {
    }

    public UserVO(String id, int score) {
        this.id = id;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

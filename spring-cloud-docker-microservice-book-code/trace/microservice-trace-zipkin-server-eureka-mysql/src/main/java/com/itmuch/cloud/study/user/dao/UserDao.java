package com.itmuch.cloud.study.user.dao;/**
 * Created by jerry.xu on 19-3-14.
 */

import com.itmuch.cloud.study.user.entity.UserVo;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

/**
 * @author jerry.xu
 * @create 2019-03-14
 * @desc
 **/
public interface UserDao {
    /**
     *
     * @param entity
     */
//    @Insert("insert into user (username,age)values(#{name,jdbcType=VARCHAR},#{age,jdbcType=INTEGER})")
    void insertUser(UserVo entity);
}

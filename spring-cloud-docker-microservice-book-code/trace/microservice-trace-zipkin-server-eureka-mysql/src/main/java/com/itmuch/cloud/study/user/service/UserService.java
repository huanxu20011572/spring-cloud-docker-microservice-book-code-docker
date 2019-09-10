package com.itmuch.cloud.study.user.service;


import com.itmuch.cloud.study.user.dao.UserDao;
import com.itmuch.cloud.study.user.entity.UserVo;

/**
 * @author jerry.xu
 * @create 2019-03-14
 * @desc service
 **/
public interface UserService {
    void insertUser(UserVo userVo);
}

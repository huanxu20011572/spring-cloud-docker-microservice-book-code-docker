package com.itmuch.cloud.study.user.service.impl;/**
 * Created by jerry.xu on 19-3-14.
 */

import com.itmuch.cloud.study.user.dao.UserDao;
import com.itmuch.cloud.study.user.entity.UserVo;
import com.itmuch.cloud.study.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jerry.xu
 * @create 2019-03-14
 * @desc
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    protected UserDao userDao;

    @Override
    public void insertUser(UserVo userVo) {
        userDao.insertUser(userVo);
    }
}

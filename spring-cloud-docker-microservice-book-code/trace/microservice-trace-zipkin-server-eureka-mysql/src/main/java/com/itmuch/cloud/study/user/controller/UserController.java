package com.itmuch.cloud.study.user.controller;/**
 * Created by jerry.xu on 19-3-14.
 */

import com.itmuch.cloud.study.user.entity.UserVo;
import com.itmuch.cloud.study.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * @author jerry.xu
 * @create 2019-03-14
 * @desc Controller
 **/
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/addUser/{name}/{age}", method = RequestMethod.GET)
    public void addUser(@PathVariable("name") String name, @PathVariable("age") Integer age) {
        UserVo entity = new UserVo();
        entity.setAge(age);
        entity.setName(name);
        userService.insertUser(entity);
    }
}

package com.itmuch.cloud.study.user.controller;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import com.itmuch.cloud.study.user.entity.User;

@Api(value = "movie接口", tags = "电影服务", description = "维护影院信息")
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;
    private String httpUrl="http://10.44.26.22:8000/";

    @ApiOperation(value = "根据ID查询用户", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    })
    @ApiResponses({@ApiResponse(code = 200, message = "success", response = User.class)})
    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return this.restTemplate.getForObject(httpUrl + id, User.class);
    }

    @ApiOperation(value = "根据ID/Name查询用户", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long"),
            @ApiImplicitParam(name = "name", value = "用户Name", required = false, dataType = "String"),
    })
    @ApiResponses({@ApiResponse(code = 200, message = "返回用户数据实体", response = User.class)})
    @GetMapping("/user/get/{id}/{name}")
    public User findByUserId(@PathVariable Long id, @PathVariable String name) {
        return this.restTemplate.getForObject(httpUrl + id, User.class);
    }

    @ApiOperation(value = "根据ID/Name Post方式查询用户", httpMethod = "POST")
    @ApiResponses({@ApiResponse(code = 200, message = "返回用户数据实体", response = User.class)})
    @PostMapping("user/post/")
    public User findByUserEntity(@RequestBody User user) {
        return this.restTemplate.getForObject(httpUrl + user.getId(), User.class);
    }
}

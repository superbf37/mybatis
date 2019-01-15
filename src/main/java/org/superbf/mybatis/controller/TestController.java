package org.superbf.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.superbf.mybatis.entity.Sign;
import org.superbf.mybatis.entity.User;
import org.superbf.mybatis.service.UserService;

@RestController
public class TestController {
    @Autowired
    private UserService userService;



    @RequestMapping("/user/{userId}")
    public User testSelectById(@PathVariable int userId){
        User user = userService.selectById(userId);
        return  user;
    }


    @RequestMapping("/sign/{enterId}/{sId}")
    public Sign testSelectByUnit(@PathVariable int enterId, @PathVariable int sId){
        Sign sign = userService.selectByUnit(enterId,sId);

        return  sign;
    }



    @RequestMapping("/sign/{enterId}/{sId}/del")
    public int testDeleteByUnit(@PathVariable int enterId, @PathVariable int sId){
        int i= userService.deleteByUnitKey(enterId,sId);
        return  i;
    }
}

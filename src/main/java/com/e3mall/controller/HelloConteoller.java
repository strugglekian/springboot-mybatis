/**
 * @Date 2018/5/25
 * @Author kkf7688
 */
package com.e3mall.controller;

import com.e3mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloConteoller {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String showHello(){
        System.out.println(userService.getUserByName(1L).getUsername());
        return "redirect:https://www.baidu.com";
    }
}

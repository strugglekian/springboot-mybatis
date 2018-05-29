package com.e3mall.test;

import com.e3mall.SpringbootMybatisApplication;
import com.e3mall.pojo.TbUser;
import com.e3mall.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisApplication.class)
public class SpringbootMybatisApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
        TbUser user = userService.getUserByName(1L);
        System.out.println(user.getUsername());
    }

}

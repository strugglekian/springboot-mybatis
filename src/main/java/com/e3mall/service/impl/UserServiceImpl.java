package com.e3mall.service.impl;

import com.e3mall.mapper.TbUserMapper;
import com.e3mall.pojo.TbUser;
import com.e3mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private  TbUserMapper tbUserMapper;

    @Override
    public TbUser getUserByName(Long id) {

        return tbUserMapper.selectByPrimaryKey(id);
    }
}

package com.soft1851.user.service.impl;

import com.soft1851.user.domain.dto.UserDto;
import com.soft1851.user.domain.entity.User;
import com.soft1851.user.mapper.UserMapper;
import com.soft1851.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    @Override
    public User getByUserId(int userId) {
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("id",userId);
        return userMapper.selectOneByExample(example);
    }

    @Override
    public User getByUser(UserDto user) {
        Example example = new Example(User.class);
        example.createCriteria().andEqualTo("id",user.getId()).andEqualTo("wxNickname",user.getWxNickname());
        return userMapper.selectOneByExample(example);
    }
}

package com.soft1851.user.service;

import com.soft1851.user.domain.dto.UserDto;
import com.soft1851.user.domain.entity.User;

public interface UserService {

    User getByUserId(int userId);

    User getByUser(UserDto user);
}

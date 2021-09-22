package com.saferide.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.saferide.entity.User;
import com.saferide.mapper.UserMapper;
import com.saferide.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 关注公众号：saferide
 * @since 2020-05-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}

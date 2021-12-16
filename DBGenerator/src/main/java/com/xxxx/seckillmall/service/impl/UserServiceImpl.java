package com.xxxx.seckillmall.service.impl;

import com.xxxx.seckillmall.pojo.User;
import com.xxxx.seckillmall.mapper.UserMapper;
import com.xxxx.seckillmall.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author haoranXue
 * @since 2021-12-02
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}

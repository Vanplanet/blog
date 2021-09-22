package com.saferide.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.saferide.entity.Blog;
import com.saferide.mapper.BlogMapper;
import com.saferide.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}

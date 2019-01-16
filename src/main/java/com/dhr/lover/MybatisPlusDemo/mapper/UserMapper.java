package com.dhr.lover.MybatisPlusDemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dhr.lover.MybatisPlusDemo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}

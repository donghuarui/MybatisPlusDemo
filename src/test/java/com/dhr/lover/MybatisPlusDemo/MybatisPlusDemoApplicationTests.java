package com.dhr.lover.MybatisPlusDemo;

import com.dhr.lover.MybatisPlusDemo.entity.User;
import com.dhr.lover.MybatisPlusDemo.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlusDemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private UserMapper userMapper;

	@Test
	public void testSelect() {
		System.out.println(("----- selectAll method test ------"));
		List<User> userList = userMapper.selectList(null);
		Assert.assertEquals(1, userList.size());
		userList.forEach(System.out::println);
	}

}


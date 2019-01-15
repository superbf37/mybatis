package org.superbf.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.superbf.mybatis.entity.User;
import org.superbf.mybatis.service.UserService;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisApplicationTests {
	@Autowired
	private UserService userService;
	@Test
	public void contextLoads() {
		User user = new User();
		user.setUsername("zhangcheng");
		User user1 = new User();
		user1.setUsername("duanjingyun");
		User user2 = new User();
		user2.setUsername("hechao");
		List<User> list = new ArrayList<>();
		list.add(user);
		list.add(user1);
		list.add(user2);

		int i = userService.insertList(list);
		System.out.println(i);
	}

}


package com.school.school;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SchoolApplicationTests {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Test
	public void listAll() {
		List<Map<String, Object>> result = jdbcTemplate.queryForList("SELECT customername, customerphone FROM customers");
		System.out.println(result);
	}

}

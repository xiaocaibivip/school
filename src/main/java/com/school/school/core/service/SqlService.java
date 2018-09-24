package com.school.school.core.service;

import com.school.school.core.sql.Sql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SqlService {
	@Autowired
	JdbcTemplate jdbcTemplate;

	// 投影查询
	public List<Map<String, Object>> touyingchaxun() {
		List<Map<String, Object>> result = jdbcTemplate.queryForList(Sql.TOU_YING_CHA_XUN);
		return result;
	}
}

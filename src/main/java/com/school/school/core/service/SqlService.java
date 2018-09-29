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
	//浏览手机信息
	public List<Map<String, Object>> liuLanShouJiXinXi() {
		List<Map<String, Object>> result = jdbcTemplate.queryForList(Sql.SHU_JU_LIU_LAN);
		return result;
	}
	// 条件查询
	public List<Map<String, Object>> tiaoJianChaXun(String city) {
		String sql = Sql.TIAO_JIAN_CHA_XUN.replaceAll("cityParam",city);
		List<Map<String, Object>> result = jdbcTemplate.queryForList(sql);
		return result;
	}
	//两表连接查询
	public List<Map<String, Object>> liangBiaoLianJieChaXun(String brandname) {
		String sql = Sql.LIANG_BIAO_CHA_XUN.replaceAll("[brandname]",brandname);
		List<Map<String, Object>> result = jdbcTemplate.queryForList(sql);
		return result;
	}

	//三表查询
	public List<Map<String, Object>> sanBiaoChaXun(String brandname) {
		String sql = Sql.SAN_BIAO_CHA_XUN.replaceAll("[brandname]",brandname);
		List<Map<String, Object>> result = jdbcTemplate.queryForList(sql);
		return result;
	}
}

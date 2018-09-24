package com.school.school.web;

import com.school.school.core.service.SqlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sql")
public class ApiSqlController {
	@Autowired
	private SqlService sqlService;

	@RequestMapping(value = "/touyingchaxun", method = RequestMethod.GET)
	public List<Map<String, Object>> get() {
		List<Map<String, Object>> result = sqlService.touyingchaxun();
		return result;
	}
}

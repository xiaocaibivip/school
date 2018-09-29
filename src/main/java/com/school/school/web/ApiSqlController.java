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

	//浏览手机信息
	@RequestMapping(value = "/liulanshoujixinxi", method = RequestMethod.GET)
	public List<Map<String, Object>> liuLanShouJiXinXi() {
		List<Map<String, Object>> result = sqlService.liuLanShouJiXinXi();
		return result;
	}

	// 条件查询
	@RequestMapping(value = "/tiaojianchaxun/{city}", method = RequestMethod.GET)
	public List<Map<String, Object>> tiaoJianChaXun(@PathVariable String city) {
		List<Map<String, Object>> result = sqlService.tiaoJianChaXun(city);
		return result;
	}

	//两表连接查询
	@RequestMapping(value = "/liangbiaolianjiechaxun/{brandname}", method = RequestMethod.GET)
	public List<Map<String, Object>> liangBiaoLianJieChaXun(@PathVariable String brandname) {
		List<Map<String, Object>> result = sqlService.liangBiaoLianJieChaXun(brandname);
		return result;
	}

	//三表查询
	@RequestMapping(value = "/sanbiaochaxun/{brandname}", method = RequestMethod.GET)
	public List<Map<String, Object>> sanBiaoChaXun(@PathVariable String brandname) {
		List<Map<String, Object>> result = sqlService.sanBiaoChaXun(brandname);
		return result;
	}

}

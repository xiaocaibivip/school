package com.school.school.core.sql;

// 用于标书SQL语句
public class Sql {
	// 投影查询
	public static String TOU_YING_CHA_XUN = "SELECT customername, customerphone FROM customers";
	//浏览手机信息
	public static String SHU_JU_LIU_LAN = "SELECT * FROM mobileInfo";
	// 条件查询
	public static String TIAO_JIAN_CHA_XUN = "SELECT * FROM customers where city = 'cityParam'";
	//两表连接查询
	public static String LIANG_BIAO_CHA_XUN = "SELECT " +
			"mi.mname, " +
			"mi.unitprice, " +
			"mi.remain, " +
			"mb.brandname " +
			"FROM mobileinfo mi " +
			"INNER JOIN mobilebrand mb ON mi.bid = mb.bid " +
			"WHERE mb.brandname = 'brandnameParam'";
	//三表查询
	public static String SAN_BIAO_CHA_XUN = "SELECT " +
			"mi.mname, " +
			"mi.os, " +
			"ms.total, " +
			"ms.buydate, " +
			"mb.brandname " +
			"FROM mobileinfo mi " +
			"INNER JOIN mobilebrand mb ON mi.bid = mb.bid  " +
			"INNER JOIN mobilesales ms ON mi.mid = ms.mid " +
			"WHERE mb.brandname = 'brandnameParam'";
}

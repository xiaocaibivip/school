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
	public static String LIANG_BIAO_CHA_XUN = "select a.price,a.remain,a.dateoflisting from mobileInfo a where bid=(select bid from mobilebrand where brandname like'[brandname]')";
	//三表查询
	public static String SAN_BIAO_CHA_XUN = "select b.mname,a.buydate,a.salescount from mobilesales a,mobileinfo b,mobilebrand c where b.bid=c.bid and b.mid = a.mid and c.brandname like'[brandname]'";
}

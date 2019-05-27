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
			"ms.salescount, " +
			"ms.buydate, " +
			"mb.brandname " +
			"FROM mobileinfo mi " +
			"INNER JOIN mobilebrand mb ON mi.bid = mb.bid  " +
			"INNER JOIN mobilesales ms ON mi.mid = ms.mid " +
			"WHERE mb.brandname = 'brandnameParam'";

	//数据查询(根据手机品牌统计手机销售信息)
	public static String SHU_JU_TONG_JI = "SELECT " +
			"SUM(ms.salescount) as amount, " +
			"mb.brandname " +
			"FROM mobileinfo mi " +
			"INNER JOIN mobilebrand mb ON mi.bid = mb.bid  " +
			"INNER JOIN mobilesales ms ON mi.mid = ms.mid " +
			"WHERE mb.brandname = 'brandnameParam' group by brandname";

	//数据统计(统计当月注册了的会员人数)
	public static String HUI_YUAN_TONG_JI = "select COUNT(*) as amount,Datename(year,GetDate())+Datename(month,GetDate()) as monthNum from customers\n" +
			"where year(regdate)=year(GETDATE())and  month(regdate)=month(GETDATE())\n";

	public static String LOGIN_CHECK = "SELECT * FROM customers WHERE customerphone = 'phoneNeed' AND password = 'passwordNeed'";

	public static String SAVE_CUSTOMER = "INSERT INTO customers VALUES ('customerid', 'customername', 'password', 'customerphone', 'email', 'regdate', 'address', 'city', 'birthday', 'upoint')";
}

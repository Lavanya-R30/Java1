package com.xworkz.mall.app.boot;

import com.xworkz.mall.app.Mall;
import com.xworkz.mall.app.OraienMall;



public class MallRunner {

	public static void main(String[] args) {


		System.out.println("invoking main in MarketRunner");

		OraienMall mall = new  OraienMall();
		mall.invite();
		System.out.println("*********Child ref*************");
		OraienMall malls = new OraienMall();
		malls.invite();

	}
	
}

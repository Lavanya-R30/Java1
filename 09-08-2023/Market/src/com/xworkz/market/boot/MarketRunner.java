package com.xworkz.market.boot;

import com.xworkz.market.app.FishMarket;
import com.xworkz.market.app.Market;

public class MarketRunner {

	public static void main(String[] args) {

		System.out.println("invoking main in MarketRunner");

		FishMarket market = new FishMarket();
		market.sell();
		System.out.println("*********Child ref*************");
		FishMarket fishMarket = new FishMarket();
		fishMarket.sell();

	

	}

}

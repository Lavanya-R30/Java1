package com.xworkz.gate.boot;

import com.xworkz.gate.app.FrontGate;
import com.xworkz.gate.app.Gate;

public class GateRunner {

	public static void main(String[] args) {

		Gate backgate=new FrontGate();
		backgate.protect();
		

	}

}

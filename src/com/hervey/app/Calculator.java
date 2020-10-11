package com.hervey.app;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Calculator {

	

	public static void calculations() {

		BigDecimal firstNum = new BigDecimal("12.20");
		BigDecimal secondNum = new BigDecimal("15.50");

		BigDecimal sumFirstSecond = firstNum.add(secondNum);

		System.out.println("Result should be  27.70, and it is: " + sumFirstSecond);

	}

}

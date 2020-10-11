package com.hervey.app;

import java.math.BigDecimal;
import java.util.List;

public class AddingMachine {

	public static void addListAndPrint(List<BigDecimal> incomingList) {
		BigDecimal result = new BigDecimal(0);
		for (BigDecimal bigDecimal : incomingList) {
			result = result.add(bigDecimal);
		}
		System.out.println("Sum of incoming list:  " + result.toString());
	}

}

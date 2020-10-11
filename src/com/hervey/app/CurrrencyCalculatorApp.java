package com.hervey.app;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CurrrencyCalculatorApp {

	public static void main(String[] args) {
		
		Calculator.calculations();
		
		System.out.println("..........");
		
		List<BigDecimal> listNumbers = new ArrayList<BigDecimal>();
		
		BigDecimal num1 = new BigDecimal("11.22");
		BigDecimal num2 = new BigDecimal("9.88");
		BigDecimal num3 = new BigDecimal("10.00");
		
		listNumbers.add(num1);
		listNumbers.add(num2);
		listNumbers.add(num3);
		
		
		AddingMachine.addListAndPrint(listNumbers);

		
		
		
		
		
	}

}

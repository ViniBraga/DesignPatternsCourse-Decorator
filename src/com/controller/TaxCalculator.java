package com.controller;
import com.model.Budget;
import com.tax.Tax;

public class TaxCalculator {

	public void doCalculate(Budget budget, Tax anyTax) {
		double value = anyTax.calculate(budget);
		System.out.println(value);
	}
	
}

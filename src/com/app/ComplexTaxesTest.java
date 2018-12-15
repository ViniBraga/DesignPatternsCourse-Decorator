package com.app;
import com.model.Budget;
import com.tax.ICMS;
import com.tax.ICPP;
import com.tax.ISS;
import com.tax.Tax;

public class ComplexTaxesTest {

	public static void main(String[] args) {
		Tax iss = new ISS(new ICMS(new ICPP()));	
		Budget budget = new Budget(500);		
		double value = iss.calculate(budget);
		System.out.println(value);
	}

}

package com.tax;
import com.model.Budget;

public class ICMS extends Tax {

	public ICMS(Tax otherTax) {
		super(otherTax);
	}
	
	public ICMS() {}
	
	public double calculate(Budget budget) {
		return budget.getValue() * .1 + calculateOtherTax(budget);
	}

}

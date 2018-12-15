package com.tax;
import com.model.Budget;

public class ISS extends Tax {

	public ISS(Tax otherTax) {
		super(otherTax);
	}
	
	public ISS() {
	}
	
	public double calculate(Budget budget) {
		return budget.getValue() * .06 + calculateOtherTax(budget);
	}

}

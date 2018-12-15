package com.tax;

import com.model.Budget;

public abstract class ConditionalTaxTemplate extends Tax {

	@Override
	public double calculate(Budget budget) {
		if(mustUseMaximumRate(budget)) {
			return maximumTax(budget) + calculateOtherTax(budget);
		} else {
			return  minimumRate(budget) + calculateOtherTax(budget);
		}
	}
	
	public abstract boolean mustUseMaximumRate(Budget budget);
	
	public abstract double maximumTax(Budget budget);

	public abstract double minimumRate(Budget budget);

}

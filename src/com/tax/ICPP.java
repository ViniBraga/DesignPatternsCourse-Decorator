package com.tax;
import com.model.Budget;

public class ICPP extends ConditionalTaxTemplate {

	@Override
	public boolean mustUseMaximumRate(Budget budget) {
		return budget.getValue() > 500;
	}

	@Override
	public double minimumRate(Budget budget) {
		return budget.getValue() * .05;
	}
	
	@Override
	public double maximumTax(Budget budget) {
		return budget.getValue() * .07;
	}
	
}

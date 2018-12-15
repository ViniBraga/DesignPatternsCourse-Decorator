package com.tax;
import com.model.Budget;

public class IKCV extends ConditionalTaxTemplate {

	@Override
	public boolean mustUseMaximumRate(Budget budget) {
		return budget.getValue() > 500 && hasMoreThan100(budget);
	}
	
	private boolean hasMoreThan100(Budget budget) {
		return budget.getItems().stream().filter(i -> i.getValue() > 100).findAny().isPresent();
	}

	@Override
	public double maximumTax(Budget budget) {
		return budget.getValue() * .10;
	}

	@Override
	public double minimumRate(Budget budget) {
		return budget.getValue() * .06;
	}
	
}
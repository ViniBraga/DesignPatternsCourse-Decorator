package com.tax;
import com.model.Budget;

/**
 * DECORATOR
 * 
 * In order to create compound taxes (such as ICMSwithISS),
 * Tax should be an abstract class which receive another tax on constructor
 * 
 * The decorator aims to join broken behaviors into different classes
 */

public abstract class Tax {

	protected Tax otherTax;
	
	public Tax(Tax otherTax) {
		this.otherTax = otherTax;
	}
	
	public Tax() {}
	
	public abstract double calculate(Budget budget);
	
	protected double calculateOtherTax(Budget budget) {
		if (otherTax == null) {
			return 0;
		}
		return otherTax.calculate(budget);
	}
	
}

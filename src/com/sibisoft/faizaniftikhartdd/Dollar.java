package com.sibisoft.faizaniftikhartdd;

public class Dollar extends Money
{
	public Dollar() 
	{
		
	}
	public Dollar(int amount,String currency)
	{
		this.amount = amount;
		this.currency = currency;
	}
	public Money times(int multiplier)
	{
		return Money.dollar(amount * multiplier);
	}
}

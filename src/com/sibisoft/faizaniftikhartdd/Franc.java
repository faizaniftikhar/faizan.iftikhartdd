package com.sibisoft.faizaniftikhartdd;

public class Franc extends Money 
{
	public Franc() 
	{
		
	}
	public Franc(int amount,String currency)
	{
		this.amount= amount;
		this.currency = currency;
	}
	public Money times(int multiplier) 
	{
		return Money.franc(amount * multiplier);
	}
}







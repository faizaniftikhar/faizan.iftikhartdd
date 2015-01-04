package com.sibisoft.faizaniftikhartdd;

public class Franc extends Money 
{
	public Franc() 
	{
		
	}
	public Franc(int amount,String currency)
	{
		super(amount,currency);
	}
	public Money times(int multiplier) 
	{
		return Money.franc(amount * multiplier);
	}
}







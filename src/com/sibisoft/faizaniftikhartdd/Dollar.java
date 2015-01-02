package com.sibisoft.faizaniftikhartdd;

public class Dollar extends Money
{
	public Dollar() 
	{
		
	}
	public Dollar(int amount)
	{
		this.amount = amount;
	}
	public Dollar times(int multiplier)
	{
		return new Dollar(this.amount * multiplier);
	}
	
}

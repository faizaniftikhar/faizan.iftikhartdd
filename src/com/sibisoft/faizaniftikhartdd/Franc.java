package com.sibisoft.faizaniftikhartdd;

public class Franc extends Money 
{
	public Franc() 
	{
		
	}
	public Franc(int amount)
	{
		this.amount= amount;
	}
	Money times(int multiplier) 
	{
		return new Franc(amount * multiplier);
	}
	
}







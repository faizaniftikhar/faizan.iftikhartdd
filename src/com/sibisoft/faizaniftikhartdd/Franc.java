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
	Franc times(int multiplier) 
	{
		return new Franc(amount * multiplier);
	}
	public boolean equals(Object object) 
	{
		Money franc= (Money) object;
		return amount == franc.amount;
	}

}







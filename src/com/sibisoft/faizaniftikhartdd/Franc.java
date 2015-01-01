package com.sibisoft.faizaniftikhartdd;

public class Franc 
{
	private int amount;
	public Franc() 
	{
		// TODO Auto-generated constructor stub
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
		Franc franc= (Franc) object;
		return amount == franc.amount;
	}

}







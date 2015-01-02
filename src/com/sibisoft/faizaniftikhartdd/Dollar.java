package com.sibisoft.faizaniftikhartdd;

public class Dollar extends Money
{
	private int amount;
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
	public boolean equals(Object object)
	{
		Dollar dollar= (Dollar) object;
		return amount == dollar.amount;
	}
	
	public int hashCode() 
	{
		return (this.hashCode()%2)+amount;
	}
}

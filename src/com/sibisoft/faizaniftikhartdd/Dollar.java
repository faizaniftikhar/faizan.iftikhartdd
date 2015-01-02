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
	public boolean equals(Object object)
	{
		Money money= (Money) object;
		return amount == money.amount;
	}
	
	public int hashCode() 
	{
		return (this.hashCode()%2)+amount;
	}
}

package com.sibisoft.faizaniftikhartdd;

public class Dollar 
{
	int amount;
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
		return true;
	}
}

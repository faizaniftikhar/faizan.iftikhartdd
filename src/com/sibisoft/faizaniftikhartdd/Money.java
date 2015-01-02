package com.sibisoft.faizaniftikhartdd;

public class Money 
{
	protected int amount;
	
	public Money() 
	{
		
	}
	public boolean equals(Object object)
	{
		Money money= (Money) object;
		return amount == money.amount && getClass().equals(money.getClass());
	}
}

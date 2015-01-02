package com.sibisoft.faizaniftikhartdd;

public abstract class Money 
{
	abstract Money times(int multiplier);
	protected int amount;
	
	public Money() 
	{
		
	}
	
	public boolean equals(Object object)
	{
		Money money= (Money) object;
		return amount == money.amount && getClass().equals(money.getClass());
	}

	public static Money dollar(int amount)
	{
		return new Dollar(amount);
	}
}

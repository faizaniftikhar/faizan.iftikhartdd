package com.sibisoft.faizaniftikhartdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class DollarTest 
{
	@Test
	public void testMultiplication()
	{
		Dollar dollar = new Dollar(5);
		dollar.times(2);
		assertEquals(10, dollar.amount);
	}
	
	

}

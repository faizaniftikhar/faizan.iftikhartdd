package com.sibisoft.faizaniftikhartdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class DollarTestV2 
{

	@Test
	public void testMultiplication() 
	{
			Dollar five= new Dollar(5);
			five.times(2);
			assertEquals(10, five.amount);
			five.times(3);
			assertEquals(15, five.amount);
	}
}
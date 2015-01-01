package com.sibisoft.faizaniftikhartdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class DollarTestV2 
{

	@Test
	public void testMultiplication() 
	{
			Dollar five= new Dollar(5);
			Dollar container1 = five.times(2);
			assertEquals(10, container1.amount);
			Dollar container2 = five.times(3);
			assertEquals(15, container2.amount);
	}
}

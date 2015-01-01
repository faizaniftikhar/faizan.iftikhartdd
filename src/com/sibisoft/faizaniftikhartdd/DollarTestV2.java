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
			assertEquals(new Dollar(10), container1);
			container1 = five.times(3);
			assertEquals(new Dollar(15), container1);
	}
}

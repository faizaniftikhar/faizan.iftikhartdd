package com.sibisoft.faizaniftikhartdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class DollarHashCode {

	@Test
	public void testHashCode() 
	{
		Dollar dollar = new Dollar(5);
		int dollarHash = dollar.hashCode();
		assertEquals(dollar.hashCode(), dollarHash);
	}

}

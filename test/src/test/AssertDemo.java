package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;


import org.junit.jupiter.api.Test;

//program to demonstrate assert

public class AssertDemo {
	@Test
	public void testforassertequals()
	{
		int result=1;
		int expected=1;
		assertEquals(result,expected);
	}
	@Test
	void testasserttrue()
	{
		assertFalse("hello".contains("j"));
	}
	@Test
	void testassernull()
	{
		String str=null;
		assertNull(str);
	}
	
	
	
	
	
	

}

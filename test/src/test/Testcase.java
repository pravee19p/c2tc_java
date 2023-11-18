package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Testcase {
	@Test
	@DisplayName("factorial finding")
	void fact()
	{
		int excepted=120;
		int result=testfact.factorialmethod();
		
		assertEquals(excepted,result);
		
		
	}

}

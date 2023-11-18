package test;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo {
	
	@Test
	void testassumetrue()
	{
		int a=5;
		int s=25;
		Assumptions.assumeFalse(s!=a*a);
		System.out.println("it wil display");
	}
	
	@Test
	void testassumption()
	{
		int a=5;
		int b=5;
		Assumptions.assumingThat(a==b,()->{System.out.println("testing a=b");});
	}
	
	
	
	
	

}

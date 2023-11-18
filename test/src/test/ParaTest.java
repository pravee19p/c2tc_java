package test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParaTest {
	
	@ParameterizedTest
	@ValueSource(strings= {"ram","raj","jim"})
	void endswithm(String str) {
		assertTrue(str.endsWith("m"));
		
	}

}

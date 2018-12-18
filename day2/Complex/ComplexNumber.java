package complex;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ComplexNumber {
	public ComplexNumbers complex1;
    public ComplexNumbers complex2;

	@Before

	public void setUp() {
		complex1 = new ComplexNumbers(8.7, 8.8);
		complex2 = new ComplexNumbers(8.4, 7.8);
	}

	@Test
	public void test() {
		String expectedResult = "17.1+16.6i";

		ComplexNumbers finalResult = ComplexNumbers.sum(complex1, complex2);

		finalResult.display();

		assertEquals(expectedResult, finalResult.real+"+"+finalResult.imaginary+"i");

	}
}

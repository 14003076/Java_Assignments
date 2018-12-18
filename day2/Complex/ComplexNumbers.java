package complex;

public class ComplexNumbers{
	double real;

	double imaginary;

	public ComplexNumbers(double real, double imaginary) {

		this.real = real;

		this.imaginary = imaginary;

	}

	public ComplexNumbers() {

	}

	public void display() { 
		System.out.println(real+"+"+imaginary+"i");

	}

	public static ComplexNumbers sum(ComplexNumbers complex1, ComplexNumbers complex2) {

		ComplexNumbers result = new ComplexNumbers();

		result.real = complex1.real + complex2.real;

		result.imaginary = complex1.imaginary + complex2.imaginary;

		return result;

	}
}

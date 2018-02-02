package me.ankit.spring.springAOP;

public class ProductServiceImplementation implements ProductService {

	@Override
	public int multiply(int num1, int num2) {
		
		return num1 * num2;
	}

}

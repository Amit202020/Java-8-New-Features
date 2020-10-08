package annodemo;

import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {

		Supplier<Double> rv = () -> Math.random();
		System.out.println(rv.get());

	}

}

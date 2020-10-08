package bifi;

import java.util.function.BiFunction;

class BiFunctionDemo {
	
	public static void main(String args[]) {

		BiFunction<Integer, Integer, String> bf = (x, y) -> "Result is:" + (x + y);
		
		
		System.out.println(bf.apply(400, 200));

	}
}
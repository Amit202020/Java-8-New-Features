package bifi;

import java.util.function.BinaryOperator;

class BinaryOperatorDemo {
	
	public static void main(String args[]) {
		

		BinaryOperator<Integer> bo = BinaryOperator.minBy((a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));
		
		System.out.println(bo.apply(300, 100000));

	}
}
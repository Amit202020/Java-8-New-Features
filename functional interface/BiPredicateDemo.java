package bifi;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> bp = (x, y) -> x < y;
		System.out.println(bp.test(50, 60));

	}

}

package bifi;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

class BiConsumerDemo {
	public static void main(String args[]) {

	  Map<Integer,String>    mp= new HashMap<> ();
	          mp.put(11,"max");
	          mp.put(12,"srini");
	          mp.put(13,"paro");

		BiConsumer<Integer, String> bc = (key, value) -> System.out.println("Key:" + key + "  Value:" + value);
		//bc.accept(14, "nikhil");
		
		mp.forEach(bc);

	}
}
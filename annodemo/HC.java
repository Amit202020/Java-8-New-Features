package annodemo;




@FunctionalInterface
interface HelloWorld {
	void hello();
}



public class HC {

	public static void main(String args[]) {

		HelloWorld obj = () -> System.out.println("Inside Anno");
		obj.hello();
	}
}
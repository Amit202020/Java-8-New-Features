package annodemo;


interface FI {
	
	void display();

	default void show(int a) {
		System.out.println("This is default method");

	}
	
}

public class DefaultTest implements FI {
	
	public void display() {
		
	}
	public void show(int a) {
		System.out.println("This is default------");

	}

	public static void main(String[] args) {
	
		DefaultTest  obj=new DefaultTest();
		obj.show(10);
		
		
	}

}

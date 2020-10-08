package mref;

@FunctionalInterface
interface HelloWorld {
	void hello();
}

class MethodRefDemo {
	

	// static method
	public static void demo1() {
		System.out.println("Welcome To  Method Reference Using static method");
	}

	
	// instance method
	public void demo() {
		System.out.println("Welcome To  Method Reference Uisng instance method");
	}

	public static void main(String args[]){
              MethodRefDemo   obj = new MethodRefDemo();

              //calling instance method
              HelloWorld    hw =    obj  ::  demo  ;
                        hw.hello();   
                        

              //calling static method
              HelloWorld    hw1 =    MethodRefDemo  ::  demo1  ;
                                hw1.hello();   

    }
}
package cf;



@FunctionalInterface
interface E {
	Emp get(int empId);
}



class Emp {
	Emp(int empId) {
		System.out.println("Default costructor"+ empId);
	}
}



class ConstructorRefDemo {
	public static void main(String args[]) {

		E obj = Emp ::  new;
		Emp ob = obj.get(7);
	}
}

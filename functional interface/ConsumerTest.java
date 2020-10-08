package annodemo;

import java.util.function.*;

class Emp {
	String empName;

	Emp(String name) {
		this.empName = name;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}

class ConsumerTest {
	public static void main(String args[]) {
		Consumer<Emp> c1 = e -> System.out.println(e.getEmpName() + "1st come");
		Consumer<Emp> c2 = e -> System.out.println(e.getEmpName() + "2nd come");
		Consumer<Emp> c3 = e -> System.out.println(e.getEmpName() + "3rd come");

		Consumer<Emp> cc = c1.andThen(c2).andThen(c3);

		Emp e1 = new Emp("Srinibus");
		cc.accept(e1);
	}

}

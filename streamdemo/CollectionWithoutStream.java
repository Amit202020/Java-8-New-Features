package colwithoutstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Emp {
	int empId;
	String name;
	float salary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Emp(int empId, String name, float salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public Emp() {
		super();
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

}

class CollectionWithoutStream {
	public static void main(String args[]) {
		List<Emp> empList = new ArrayList<Emp>();
		empList.add(new Emp(1, "srini", 25000f));
		empList.add(new Emp(2, "max", 37000f));
		empList.add(new Emp(3, "navin", 56000f));
		empList.add(new Emp(4, "alok", 20000f));
		empList.add(new Emp(5, "paro", 450000f));
		
		List<Float> empSalList = new ArrayList<Float>();

//		for (Emp emp : empList) {
//			if (emp.getSalary() > 30000) {
//				empSalList.add(emp.getSalary());
//			}
//		}
//		System.out.println(empSalList);

		// All employee whose is 20000/-
		//empList.stream().filter(emp -> emp.getSalary() == 20000).forEach(emp -> System.out.println(emp.getName()));
		
		// find all salary > 30000 inside  a list
		//empSalList = empList.stream().filter( emp -> emp.getSalary() > 30000 ).map( emp ->  emp.getSalary() ).collect(Collectors.toList());
		//System.out.println(empSalList);
		
		//We have to count sum of all the salary
//		double   d = empList.stream().collect(Collectors.summingDouble( emp -> emp.getSalary() ));
//		System.out.println("sum of all  salary:  "+d);
//		
		
		// HIGHEST  SALARY PROVIDED BY  THE ORG
		//Emp    emp11 = empList.stream().max((emp1,emp2) ->  emp1.getSalary() > emp2.getSalary()  ?  1 : -1).get();
	    //System.out.println(emp11.getSalary());
		
		
		
        //TOTAL number of employee whose salary is greater than 30000/-
        long   count   =  empList.stream().filter(emp -> emp.getSalary() > 30000 ).count();
        System.out.println("TOTAL NO OF EMPLOYEE : "+count);
		
		
         //find all salary > 30000 inside  a list  
         empSalList = empList.stream().filter( emp -> emp.getSalary() > 30000 ).map( emp ->  emp.getSalary() ).collect(Collectors.toList());
     	 System.out.println(empSalList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
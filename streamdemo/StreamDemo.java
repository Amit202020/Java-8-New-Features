package streamdemo;

import java.util.*;

class Emp {
	private String empId;
	private String empName;
	private String empEmail;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Emp(String empId, String empEmail,String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public Emp() {
		super();
	}

}

public class StreamDemo {

	public static void main(String[] args) {

		ArrayList<Emp> arr = new ArrayList<Emp>();
		arr.add(new Emp("11", "arun@gmail.com", "arun"));
		arr.add(new Emp("12", "max@gmail.com", "max"));
		arr.add(new Emp("13", "paro@gmail.com", "paro"));
		arr.add(new Emp("14", "navin@gmail.com", "navin"));
		arr.add(new Emp("15", "nikhil@gmail.com", "mik"));
		arr.add(new Emp("16", "kav@gmail.com", "kav"));
		
		arr.stream().
		filter(p -> p.getEmpEmail().startsWith("p")).forEach(p -> System.out.println(p.getEmpName()));
		

	}

}

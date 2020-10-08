package comp;

import java.math.BigDecimal;

class Emp {
	
	private int empId;
	private String name;
	private BigDecimal marks;
	
	
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
	public BigDecimal getMarks() {
		return marks;
	}
	public void setMarks(BigDecimal marks) {
		this.marks = marks;
	}
	public Emp(int empId, String name, BigDecimal marks) {
		super();
		this.empId = empId;
		this.name = name;
		this.marks = marks;
	}
	public Emp() {
		super();
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
	

}
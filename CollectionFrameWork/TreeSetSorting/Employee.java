package CollectionFrameWork.TreeSetSorting;

public class Employee {
	private Integer employeeId;
	private String employeeName;
	private Double employeeSalary;

	public Employee(Integer employeeId, String employeeName, Double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	@Override
	public int hashCode() {
		return this.getEmployeeId();
	}

	@Override
	public boolean equals(Object obj) {
		return this.getEmployeeSalary() == ((Employee) obj).getEmployeeSalary();
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}

}


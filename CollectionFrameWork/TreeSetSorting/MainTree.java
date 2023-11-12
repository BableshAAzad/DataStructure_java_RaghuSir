package collectionFrameWork.TreeSetSorting;

import java.util.*;

public class MainTree {
	public static void main(String[] args) {
		TreeSet<Employee> employees = new TreeSet<Employee>((e1, e2) -> e1.getEmployeeId() - e2.getEmployeeId());
		employees.add(new Employee(105, "Bablesh", 80.2));
		employees.add(new Employee(102, "Lalita", 71.1));
		employees.add(new Employee(104, "Kajol", 78.3));
		employees.add(new Employee(103, "Durgesh", 93.6));
		employees.add(new Employee(101, "Anjani", 93.6));

		employees.forEach(System.out::println);
        System.out.println("\nSorted Based on the Salary : \n");
		TreeSet<Employee> empSal = new TreeSet<Employee>(
				(e1, e2) -> e1.getEmployeeSalary().compareTo(e2.getEmployeeSalary()));
		empSal.addAll(employees);
		empSal.forEach(System.out::println);
	}
}


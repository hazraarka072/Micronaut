package example.micronaut.service;

import java.util.Arrays;
import java.util.List;

import javax.inject.Singleton;

import example.micronaut.pojo.Employee;
@Singleton
public class EmployeeService {
	public List<Employee> getAllEmployees()
	{
		Employee e1= new Employee(1,"emp1",1);
		Employee e2= new Employee(2,"emp2",2);
		Employee e3= new Employee(3,"emp3",3);
		Employee e4= new Employee(4,"emp4",4);
		Employee e5= new Employee(5,"emp5",5);
		return Arrays.asList(e1,e2,e3,e4,e5);
		
	}
}

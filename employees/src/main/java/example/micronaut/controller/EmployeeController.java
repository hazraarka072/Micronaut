package example.micronaut.controller;

import java.util.List;

import javax.inject.Inject;
import javax.validation.constraints.NotBlank;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Flowable;
import example.micronaut.client.DeptDetail;
import example.micronaut.client.implementatin.DeptDetailImpl;
import example.micronaut.pojo.Department;
import example.micronaut.pojo.Employee;
import example.micronaut.service.EmployeeService;
@Controller("/")
public class EmployeeController {
	//@Inject
	private final DeptDetail departments;
	private final EmployeeService employeeService;
	
	public EmployeeController(DeptDetail departments,EmployeeService employeeService) {
		super();
		this.departments = departments;
		this.employeeService = employeeService;
	}

	@Get("/employees/{empId}")
	Employee getEmpDetails(@NotBlank int empId){
		Employee e=employeeService.getAllEmployees()
				   .stream()
				   .filter(emp->emp.getE_id()==empId)
				   .findFirst().get();
		
		Department d=departments.getAllDepts().toList().blockingGet()
				      .stream()
				      .filter(dept->dept.getId()==e.getE_id())
				      .findFirst()
				      .get();
		e.setD(d);
		return e;
	}
}

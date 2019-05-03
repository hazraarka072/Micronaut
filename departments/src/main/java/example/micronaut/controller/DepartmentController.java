package example.micronaut.controller;

import java.util.Arrays;
import java.util.List;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import example.micronaut.pojo.Department;
@Controller("/") 
public class DepartmentController {

	@Get("/departments")
	List<Department> getAllDepartments(){
		
		Department d1=new Department(1,"Dept1","Head1");
		Department d2=new Department(2,"Dept2","Head2");
		Department d3=new Department(3,"Dept3","Head3");
		Department d4=new Department(4,"Dept4","Head4");
		Department d5=new Department(5,"Dept5","Head5");
		return Arrays.asList(d1,d2,d3,d4,d5);
		
	}
}

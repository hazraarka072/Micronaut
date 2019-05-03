package example.micronaut.pojo;

public class Department {
	
	int id;
	String department_name;
	String department_head;
	
	public Department(int id, String department_name, String department_head) {
		super();
		this.id = id;
		this.department_name = department_name;
		this.department_head = department_head;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public String getDepartment_head() {
		return department_head;
	}
	public void setDepartment_head(String department_head) {
		this.department_head = department_head;
	}
	
}

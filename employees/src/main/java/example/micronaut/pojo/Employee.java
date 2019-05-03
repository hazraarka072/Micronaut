package example.micronaut.pojo;

public class Employee {
	int e_id;
	String name;
	int d_id;
	Department d;
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getD_id() {
		return d_id;
	}
	public void setD_id(int d_id) {
		this.d_id = d_id;
	}
	public Department getD() {
		return d;
	}
	public void setD(Department d) {
		this.d = d;
	}
	public Employee(int e_id, String name, int d_id) {
		super();
		this.e_id = e_id;
		this.name = name;
		this.d_id = d_id;
	}
	
}

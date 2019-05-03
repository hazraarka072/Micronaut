package example.micronaut.client.fallback;

import javax.inject.Singleton;

import example.micronaut.client.DeptDetail;
import example.micronaut.pojo.Department;
import io.micronaut.retry.annotation.CircuitBreaker;
import io.micronaut.retry.annotation.Fallback;
import io.reactivex.Flowable;

@Fallback
@CircuitBreaker
@Singleton
public class DeptDetailFallback implements DeptDetail {

	
	public Flowable<Department> getAllDepts() {
		// TODO Auto-generated method stub
		
		Department d1=new Department(1,"FDept1","Head1");
		Department d2=new Department(2,"FDept2","Head2");
		Department d3=new Department(3,"FDept3","Head3");
		Department d4=new Department(4,"FDept4","Head4");
		Department d5=new Department(5,"FDept5","Head5");
		return (Flowable<Department>)Flowable.just(d1, d2, d3, d4,d5);
	}

}

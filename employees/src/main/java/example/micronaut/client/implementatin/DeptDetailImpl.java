package example.micronaut.client.implementatin;

import java.util.List;

import example.micronaut.client.DeptDetail;
import example.micronaut.pojo.Department;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Flowable;

@Client("http://localhost:8010")
public interface DeptDetailImpl extends DeptDetail{
	
	@Get("/departments")
	Flowable<Department> getAllDepts();
	
}

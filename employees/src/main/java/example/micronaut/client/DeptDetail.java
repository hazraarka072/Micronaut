package example.micronaut.client;

import example.micronaut.pojo.Department;
import io.reactivex.Flowable;

public interface DeptDetail {
	Flowable<Department> getAllDepts();
}

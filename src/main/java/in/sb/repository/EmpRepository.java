package in.sb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.sb.model.Employee;

@Repository
public interface EmpRepository extends CrudRepository<Employee, Integer> {

	public Employee findById(int id);

	public Employee findByUserAndPass(String user, String pass);

}

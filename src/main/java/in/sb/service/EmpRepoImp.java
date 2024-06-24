package in.sb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sb.model.Employee;
import in.sb.repository.EmpRepository;

@Service
public class EmpRepoImp implements EmpService {

	@Autowired
	private EmpRepository empRepository;

	@Override
	public void saveData(Employee emp) {
		empRepository.save(emp);

	}

	@Override
	public Employee logincheck(String user, String pass) {
		return empRepository.findByUserAndPass(user, pass);

	}

	@Override
	public Iterable<Employee> displayAll() {
		return empRepository.findAll();
	}

	@Override
	public void delete(int id) {
		empRepository.deleteById(id);

	}

	@Override
	public Employee editRecord(int id) {
		return empRepository.findById(id);
	}

}

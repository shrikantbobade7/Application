package in.sb.service;

import in.sb.model.Employee;

public interface EmpService {
	
	public void saveData(Employee emp);
	
	public Employee logincheck(String user, String pass);
	
	public Iterable<Employee> displayAll();
	
	public void delete(int id);
	
	public Employee editRecord(int id);

}

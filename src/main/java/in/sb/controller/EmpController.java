package in.sb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sb.model.Employee;
import in.sb.service.EmpService;

@RestController
public class EmpController {

	@Autowired
	private EmpService empService;

	@PostMapping("/reg")
	public Employee registerData(@RequestBody Employee emp) {
		empService.saveData(emp);
		return emp;
	}

	@RequestMapping(value = "/log/{user}/{pass}")
	public Employee loginData(@PathVariable String user, @PathVariable String pass) {
		return empService.logincheck(user, pass);

	}

	@GetMapping("/getAll")
	public Iterable<Employee> getAllData() {
		return empService.displayAll();

	}

	@DeleteMapping("/delete/{id}")
	public Iterable<Employee> deleteById(@PathVariable int id) {
		empService.delete(id);
		return empService.displayAll();

	}

	@PatchMapping("/edit/{id}")
	public Employee editRecord(@PathVariable int id) {
		return empService.editRecord(id);
	}

	@PutMapping("/update")
	public Iterable<Employee> updateRecord(@RequestBody Employee emp) {
		empService.saveData(emp);
		Iterable<Employee> allData = empService.displayAll();
		return allData;
	}

}

package in.co.vwits.emp.service;

import java.util.List;

import in.co.vwits.emp.model.Employee;



public interface EmployeeService {
	List<Employee> All();
	void save(Employee s);
	void UpdateSalById(int roll, double perc);
	void DeleteById(int id);
	List<Employee> sortBySal();
	List<Employee> sortByName();

}

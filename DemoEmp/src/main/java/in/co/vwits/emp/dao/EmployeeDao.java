package in.co.vwits.emp.dao;

import java.util.List;

import in.co.vwits.emp.model.Employee;




public interface EmployeeDao {
	public List<Employee> All();
	public int save(Employee s);
	public void UpdateSalById(int roll, double per);
	public void DeleteById(int id);
	
	
	
}

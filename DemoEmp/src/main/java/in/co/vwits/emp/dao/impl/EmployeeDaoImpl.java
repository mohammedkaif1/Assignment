package in.co.vwits.emp.dao.impl;

import java.util.ArrayList;
import java.util.List;

import in.co.vwits.emp.model.Employee;

public class EmployeeDaoImpl {
	private List<Employee> emp;
	public EmployeeDaoImpl ()
	{
		emp=new ArrayList<Employee>();
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("kaif");
		e1.setSalary(9000.0);
		emp.add(e1);
		
		
	}
	public List<Employee> All()
	{
		return emp;
	}

}

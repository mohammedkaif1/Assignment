package in.co.vwits.emp.service.impl;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import in.co.vwits.emp.dao.EmployeeDao;
import in.co.vwits.emp.dao.impl.EmployeeJDBCImpl;
import in.co.vwits.emp.model.Employee;
import in.co.vwits.emp.service.EmployeeService;


public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao dao;
	 //Student s=new Student();
	//private StudentJDBCDaoImpl 
	public EmployeeServiceImpl()
	{
		dao=new EmployeeJDBCImpl();
	}
	public List<Employee> All() {
		// TODO Auto-generated method stub
		return dao.All();
	}
	
	
	public void save(Employee s)
	{
		dao.save(s);
		System.out.println("Inserted");
		
	}
	
	@Override
	public void UpdateSalById(int id, double sal) {
		// TODO Auto-generated method stub
		dao.UpdateSalById(id,sal);
	}
	@Override
	public void DeleteById(int id) {
		// TODO Auto-generated method stub
		dao.DeleteById(id);
		
	}

	
	


	@Override
	public List<Employee> sortBySal() {
		// TODO Auto-generated method stub
		return dao.All().stream().sorted(Comparator.comparing(Employee::getSalary)).toList();
                 
		
	}
	public List<Employee> sortByName()
	{
		return dao.All().stream().sorted(Comparator.comparing(Employee::getName)).toList();
	}
	
}


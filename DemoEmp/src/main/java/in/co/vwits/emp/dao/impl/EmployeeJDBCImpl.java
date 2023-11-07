package in.co.vwits.emp.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.co.vwits.emp.dao.EmployeeDao;
import in.co.vwits.emp.model.Employee;


public class EmployeeJDBCImpl implements EmployeeDao {
	public List<Employee> All()
	{
		List<Employee> employees=new ArrayList<>();
		try (Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_db","root","");	
				PreparedStatement psmt=con.prepareStatement("SELECT * FROM tbl_emp");
				)
		{

			   ResultSet rs=psmt.executeQuery(); 
			   while(rs.next())
			   {
				 Employee empy =new Employee();
				 empy.setId(rs.getInt(1));
				 empy.setName(rs.getString(2));
				 empy.setSalary(rs.getDouble(3));
				 employees.add(empy);
				 
			    
			   }   
			  
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employees;
		
	
	}
	public int save(Employee s)
	{
		try (Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","");	
				PreparedStatement psmt=con.prepareStatement("INSERT INTO tbl_emp VALUES(?,?,?)");
				)
		{
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:;3306/student_db","root","9492706012Aa#");
			//PreparedStatement psmt;
			//PreparedStatement psmt=con.prepareStatement("INSERT INTO tbl_student values(?,?,?)");
			//Before actually firing the query we must set the values for all the ?mark
			psmt.setInt(1, s.getId());
			psmt.setString(2,s.getName());
			psmt.setDouble(3, s.getSalary());
			psmt.executeUpdate();
			
			
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
return 0;
	}
	@Override
	public void UpdateSalById(int id, double sal) {
		// TODO Auto-generated method stub

		try (Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","");	
				PreparedStatement psmt=con.prepareStatement("UPDATE tbl_emp SET salary =? WHERE id=?");
				)
		{
			psmt.setDouble(1,sal);
			psmt.setInt(2,id);
			psmt.executeUpdate();
			
			System.out.println("Updated");
			
			
		}
		
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
		@Override
		public void DeleteById(int id) {
			// TODO Auto-generated method stub

			try (Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root","");	
					PreparedStatement psmt=con.prepareStatement("DELETE FROM tbl_emp Where id=?");
					
					)
			{
				
			psmt.setInt(1,id);
			psmt.executeUpdate();
			System.out.println("deleted ");
			//con.commit();	
				
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
	



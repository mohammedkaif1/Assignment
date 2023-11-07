import java.util.List;
import java.util.Scanner;

import in.co.vwits.emp.dao.impl.EmployeeDaoImpl;
import in.co.vwits.emp.model.Employee;
import in.co.vwits.emp.service.EmployeeService;
import in.co.vwits.emp.service.impl.EmployeeServiceImpl;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService service=new EmployeeServiceImpl();
		
		int option=-1;
		Scanner sc=new Scanner(System.in);
		do
		{
			
		   System.out.println("1.for reterving all");
		   System.out.println("2.insert the data");
		   System.out.println("3. Update by id");
		   System.out.println("4. Delete by id");
		   System.out.println("5. sort by salary");
		   
		   option=sc.nextInt() ;
		   switch(option)
		   {
		   case 1:
			   List<Employee> e=service.All();
			   System.out.println(e);
			   break;
		   case 2:
			   Employee s=new Employee();
				 System.out.println("Enter Student Details\n");
				 s.setId(sc.nextInt());
				// System.out.println();
				 s.setName(sc.next());
				 s.setSalary(sc.nextDouble());
				 
				
				 
				 service.save(s);
				 break;
		   case 3:
			   System.out.println("Enter id  and salary to Update");
				  int id=sc.nextInt();
				  double sal=sc.nextDouble();
				 service.UpdateSalById(id,sal);
				 break;
		   case 4:
			   System.out.println("Enter the id u want to delete");
			   int id1=sc.nextInt();
			   service.DeleteById(id1);
			   break;
		   case 5:
			   System.out.println("sorting the employees by salary");
			   System.out.println(service.sortBySal());
			   break;
		   case 6:
			   System.out.println("sort by names");
			   System.out.println(service.sortByName);
		   case -1:
			  System.out.println("thanku for visiting us");
			  break;
			   
			   
			   
		   }
		}while(option!=-1);
		
		

	}

}

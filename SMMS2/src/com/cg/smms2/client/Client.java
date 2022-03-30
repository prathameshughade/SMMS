package com.cg.smms2.client;
import com.cg.smms2.entities.Employee;
import com.cg.smms2.services.IEmployeeService;
import com.cg.smms2.services.IEmployeeServiceImpl;
import java.time.LocalDate;

	public class Client 
	{
		public static void main(String[] args) 
		{
			// CRUD operation calling activity
			Employee employee = new Employee();
			
			IEmployeeService service = new IEmployeeServiceImpl();
			
			// Create
		
			
			
		/*	employee.setId(105);
			employee.setName("amis");
			employee.setSalary(30000);
			employee.setAddress("Maharashtra");
			employee.setDesignation("Helper");
			service.addEmployee(employee);
			employee.Dob(LocalDate.of(1996,4,5));*/
			
			// Retrieve
			
			employee	= service.searchEmployeeById(101);
			System.out.println("ID is:"+employee.getId());
			System.out.println("salary is:"+employee.getSalary());
			System.out.println("Name is:"+employee.getName());
			System.out.println("Address is:"+employee.getAddress());
			System.out.println("designation is:"+employee.getDesignation());
		
			
			
			
			
			
			  
			
			
		/*	// Update
			employee= service.searchEmployeeById(101);
			employee.setDesignation("Manager");
			employee.setSalary(100000);
			employee.setName("Praths");
			service.updateEmployee(employee);
			System.out.println("Update is successful");*/
			
			
			
		/*	employee	= service.searchEmployeeById(106);
			service.deleteEmployee(employee);
			System.out.println("Delete is successful");*/
			
			
			
			
		}

	
}

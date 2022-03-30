package com.cg.smms2.services;


	
	


	import com.cg.smms2.entities.Employee;

	public interface IEmployeeService 
	{
	public Employee addEmployee(Employee employee);  
	public Employee updateEmployee(Employee employee);  
	public Employee searchEmployeeById(int id);  

	


	public Employee deleteEmployee(Employee employee); 
	}



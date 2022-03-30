package com.cg.smms2.repositories;

import com.cg.smms2.entities.Employee;

public interface IEmployeeRepository 
	{

		public Employee addEmployee(Employee employee);
		public Employee updateEmployee(Employee employee);
		public Employee searchEmployeeById(int id);
		
		public Employee deleteEmployee(Employee employee);
		
		
		public abstract void beginTransaction();
		public abstract void commitTrasaction();
		void deleteEmployee(int id);
		
	}



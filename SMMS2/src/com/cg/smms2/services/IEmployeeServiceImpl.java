package com.cg.smms2.services;



	import com.cg.smms2.entities.Employee;
	import com.cg.smms2.repositories.IEmployeeRepositoryImpl;
	import com.cg.smms2.repositories.IEmployeeRepository;

	public class IEmployeeServiceImpl implements IEmployeeService
	{
		// Step 1: Establishing connection between Service and Repo
		private IEmployeeRepository dao;
		
		public IEmployeeServiceImpl() 
		{
			dao = new IEmployeeRepositoryImpl();
		}
		
		// Step 2: Service calls to perform CRUD Operation

		@Override
		public Employee addEmployee(Employee employee) 
		{
			dao.beginTransaction();
			dao.addEmployee(employee);
			dao.commitTrasaction();
			return employee;
		}

		@Override
		public Employee updateEmployee(Employee employee) 
		{
			dao.beginTransaction();
			dao.updateEmployee(employee);
			dao.commitTrasaction();
			return employee;
		}

		@Override
		public Employee searchEmployeeById(int id) 
		{
			Employee employee = dao.searchEmployeeById(id);
			return employee;
		}

		
	


		
		@Override
		public Employee deleteEmployee(Employee employee) 
		{
			dao.beginTransaction();
			dao.deleteEmployee(employee);
			dao.commitTrasaction();
			return employee;
		}

	}



package com.cg.smms2.repositories;


	
	

	import javax.persistence.EntityManager;

	import com.cg.smms2.entities.Employee;

	public class IEmployeeRepositoryImpl implements IEmployeeRepository 
	{

		//Step 1: Start JPA LifeCycle
		private EntityManager entityManager;
		public IEmployeeRepositoryImpl() 
		{
			entityManager = JPAUtil.getEntityManager();
		}
		// Create operation - Repo/DAO
		@Override
		public Employee addEmployee(Employee employee) 
		{
			entityManager.persist(employee);
			return employee;
		}

		
		@Override
		public Employee updateEmployee(Employee employee) 
		{
			entityManager.merge(employee);
			return employee;
		}

		@Override
		public Employee searchEmployeeById(int id)
		{
			Employee employee = entityManager.find(Employee.class, id);
			return employee;
		}

		
		@Override
		public void deleteEmployee(int id) 
		{
			Employee employee = entityManager.find(Employee.class, id);
			entityManager.remove(employee);
		}
		@Override
		public void beginTransaction() 
		{
			entityManager.getTransaction().begin();
		}
		@Override
		public void commitTrasaction() 
		{	
			entityManager.getTransaction().commit();
		}
		@Override
		public Employee deleteEmployee(Employee employee) {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		
		}
		
		



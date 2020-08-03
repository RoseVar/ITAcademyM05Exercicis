package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository;
	
	public JobsController(){
		//instancio el repositorio
		repository= new EmployeeRepository();
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(boss);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		// Creo un objeto y lo añado al staff
		Employee manager = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);		
	}


	public void payAllEmployeers() {
		//Itero por todos los miembros del staff, llamando a su funcion de clase pay (que sobre escribe la 
		//función de la clase abstracta)
		for (AbsStaffMember emp: repository.getAllMembers()) {
			emp.pay();
		}
	
	}

	public String getAllEmployees() {
		// Creo el método para que devuelva todos los empleados (tipo toString)
		StringBuilder sb = new StringBuilder();
		for (AbsStaffMember employ:repository.getAllMembers()) {
			sb.append (employ.toString());
			sb.append("\n");
		}
		return sb.toString();
	}

	public void createVolunteer(String name, String address, String phone) throws Exception {
		// Creo un objeto y lo añado al staff
		Volunteer volunteer = new Volunteer(name, address, phone);
		repository.addMember(volunteer);	
		
	}
	
	
	
}

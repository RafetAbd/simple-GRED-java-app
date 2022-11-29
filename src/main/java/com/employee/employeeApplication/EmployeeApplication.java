package com.employee.employeeApplication;

import com.employee.employeeApplication.entity.Address;
import com.employee.employeeApplication.entity.Employee;
import com.employee.employeeApplication.entity.Project;
import com.employee.employeeApplication.entity.Spouse;
import com.employee.employeeApplication.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	@Bean
	public CommandLineRunner initialCreate(EmployeeService employeeService) {
		return(args) -> {
			Address address1 = new Address("lineOne", "city" , "country", 11111);
			Project project1 = new Project("employeeName1", "clientName1");
			Spouse spouse1 = new Spouse("name1", "454346", 23);
			Employee employee = new Employee("employee1", "city1");

//			employee.addProject(project1);
//			employee.addAddress(address1);
//			employee.setSpouse(spouse1);
//
//			employeeService.createEmployee(employee);
//			System.out.println("Getting an Employee");
//			Employee employee1 = employeeService.getAnEmployee(1);


		};
	}
}

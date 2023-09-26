package com.example.demoprojectcodedeploy;

import com.example.demoprojectcodedeploy.dao.EmployeeRepository;
import com.example.demoprojectcodedeploy.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoProjectCodedeployApplication implements CommandLineRunner {
private final EmployeeRepository employeeRepository;

@Autowired
	public DemoProjectCodedeployApplication(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectCodedeployApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	employeeRepository.save(new Employee(1,"John","Doe","john@email.com"));
		employeeRepository.save(new Employee(2,"Marry","Public","marry@email.com"));
		employeeRepository.save(new Employee(3,"Sachin","Tendulkar","sachin@email.com"));
	}
}

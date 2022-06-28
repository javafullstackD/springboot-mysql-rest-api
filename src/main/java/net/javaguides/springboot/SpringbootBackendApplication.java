package net.javaguides.springboot;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		Employee employee1 = new Employee();
		employee1.setFirstName("Phumlani");
		employee1.setLastName("Mlambo");
		employee1.setEmailId("phumlanijack25@gmail.com");

		Employee employee2 = new Employee();
		employee2.setFirstName("Philani");
		employee2.setLastName("Mlambo");
		employee2.setEmailId("philanijackson25@gmail.com");

		employeeRepository.save(employee1);
		employeeRepository.save(employee2);


	}
}

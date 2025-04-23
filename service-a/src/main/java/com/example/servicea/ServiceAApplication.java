
package com.example.servicea;

import com.example.servicea.model.Employee;
import com.example.servicea.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServiceAApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAApplication.class, args);
    }


    @Bean
    CommandLineRunner run(EmployeeRepository repo) {
        return args -> {
            repo.save(new Employee(null, "Alice", "Engineering"));
            repo.save(new Employee(null, "Bob", "HR"));
            repo.save(new Employee(null, "Charlie", "Finance"));
        };
    }
}

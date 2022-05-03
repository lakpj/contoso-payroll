package com.contoso.payroll;

import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.junit.Assert; 

import static org.assertj.core.api.Assertions.assertThat;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mockito;

import org.apache.catalina.User;

@SpringBootTest
public class EmployeeTests {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void testSaveEmployee(){
        Manager manager = new Manager("Oliver", "James", "ROLE_MANAGER"); 
        Employee user = new Employee("Peter","Jones","new employee", manager);
        long empId = 1; 
        employeeRepository.save(user);
        Assert.assertEquals("succesfully inserted", user, employeeRepository.findById(empId));
    }

    @Test
    public void testDeleteEmployee(){
        Manager manager = new Manager("Oliver", "James", "ROLE_MANAGER"); 
        Employee employee = new Employee("John","Doe","new employee", manager);
        long empId = 1; 
        employeeRepository.save(employee);
        employeeRepository.delete(employee);
        Assert.assertTrue(employeeRepository.findById(empId).isPresent());
    }

    @Test
    public void testDeleteEmployeebyId(){
        Manager manager = new Manager("Oliver", "James", "ROLE_MANAGER"); 
        Employee employee = new Employee("John","Doe","new employee", manager);
        long empId = 1; 
        employeeRepository.save(employee);
        employeeRepository.deleteById(empId);
        Assert.assertTrue(employeeRepository.findById(empId).isPresent());
    }
}

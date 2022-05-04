package com.contoso.payroll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

}

// @RestController
// @RequestMapping("/api")
// public class HomeController {

//   @Autowired
//   private EmployeeRepository employeeRepository;
//   @Autowired
//   private ManagerRepository managerRepository;
//   @Autowired
//   public HomeController(EmployeeRepository employeeRepository, ManagerRepository managerRepository){
//       this.employeeRepository = employeeRepository; 
//       this.managerRepository = managerRepository; 
//   } 

//   @PostMapping("/newEmployee")
//       public Employee save(@RequestBody Employee employee) {
//       return this.employeeRepository.save(employee);
//   }
  
//   @DeleteMapping("/updateEmployee")
//       public ResponseEntity<Void> delete(@RequestBody Employee employee) {
//       this.employeeRepository.delete(employee);
//       return ResponseEntity.ok().build();
//   }

//   @DeleteMapping("/deleteEmployee")
//   public ResponseEntity<Void> deleteById(@PathVariable(value = "id") Integer id) {
//       Employee user = this.employeeRepository.findById(id).orElseThrow(
//         ()-> new ResourceNotFoundException("User not found" + id));
//       this.employeeRepository.deleteById(id);
//       return ResponseEntity.ok().build();
//   }
// }
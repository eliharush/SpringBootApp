package com.hospital.hrservicems.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.hrservicems.models.Employee;
import com.hospital.hrservicems.models.EmployeeList;



@RestController
@RequestMapping("/hr")
public class HrResources {
	
	List <Employee> employees =Arrays.asList(
			new Employee("1","Eli","Harush","MediTech"),
			new Employee("2","Liat","Harush","MediTech"),
			new Employee("3","Tomer","Harush","MediTech")
			); 
@RequestMapping("/employees")
   public EmployeeList getEmployees()
   {
	EmployeeList employeesList= new EmployeeList();
	employeesList.setEmployees(employees);
	   return employeesList;
   }
@RequestMapping("/employees/{Id}")
  public  Employee getEmployeeByID(@PathVariable("Id") String Id)
  {
	  
	  return employees.stream().filter(employee-> Id.equals(employee.getId())).findAny().orElse(null);
  }
}

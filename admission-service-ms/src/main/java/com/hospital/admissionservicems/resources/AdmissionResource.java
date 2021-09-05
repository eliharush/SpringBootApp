package com.hospital.admissionservicems.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hospital.admissionservicems.models.DiseasesList;
import com.hospital.admissionservicems.models.EmployeeList;
import com.hospital.admissionservicems.models.Patient;

@RestController
@RequestMapping("/admissions")
public class AdmissionResource {
	@Autowired
	
	private RestTemplate restTemplate;
	
	List<Patient> patients = Arrays.asList(
			new Patient("p1","Gibor1","ehad"),
			new Patient("p2","Gibor2","stim")
			);
  @RequestMapping("/physicians")
	public EmployeeList getPhysicians() {
		EmployeeList employeelist= restTemplate.getForObject("http://hr-service/hr/employees", EmployeeList.class);
	
				return employeelist;
	 
	}
  @RequestMapping("/diseases")
	public DiseasesList getDiseases() {
	  DiseasesList diseaseslist= restTemplate.getForObject("http://pathology-service/pathlogy/diseases", DiseasesList.class);
	
				return diseaseslist;
	 
	}
	@RequestMapping("/patients")
	public List<Patient> getPatients(){
		
		return patients;
	}
	@RequestMapping("/patients/{Id}")
	public Patient getPatientById(@PathVariable("Id") String Id) {
		Patient p = patients.stream().filter(patient-> Id.equals(patient.getId())).findAny().orElse(null);
		return p;
	}
}

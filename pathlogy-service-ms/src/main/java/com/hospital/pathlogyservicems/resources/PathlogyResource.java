package com.hospital.pathlogyservicems.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.pathlogyservicems.models.Diseases;
import com.hospital.pathlogyservicems.models.DiseasesList;

@RestController
@RequestMapping("/pathlogy")
public class PathlogyResource {
	List<Diseases> diseases = Arrays.asList(
		new Diseases("A1", "Astma", "Air"),
		new Diseases("A2", "Sugar", "dir")
			);
	
	@RequestMapping("/diseases")
	public DiseasesList getPatients(){
		DiseasesList diseasesList= new DiseasesList();
		diseasesList.setDiseases(this.diseases);
		return diseasesList;
	}

	@RequestMapping("/diseases/{Id}")
	public Diseases getDiseasesById(@PathVariable("Id") String Id) {
		Diseases d = diseases.stream().filter(diseases-> Id.equals(diseases.getId())).findAny().orElse(null);
		return d;
	}

}

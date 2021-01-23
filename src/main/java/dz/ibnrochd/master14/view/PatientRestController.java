package dz.ibnrochd.master14.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dz.ibnrochd.master14.business.IPatientService;
import dz.ibnrochd.master14.model.Patient;



@RequestMapping("/patient")
@RestController  

public class PatientRestController {
	
	@Autowired 
	IPatientService IPatientService;
	
	@PostMapping
	public  void addlPatient(Patient p)
	{
		
		 IPatientService.savePatient(p);
	}
	
	@GetMapping
	List <Patient> getAllPatients()
	{
		
		return IPatientService.getAllPatient();
	}
	
	
 
	
	}
	
	
	


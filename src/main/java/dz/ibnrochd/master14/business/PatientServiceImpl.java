package dz.ibnrochd.master14.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.dao.PatientRepository;
import dz.ibnrochd.master14.dao.RendezVousRepository;
import dz.ibnrochd.master14.model.Patient;
import dz.ibnrochd.master14.model.RendezVous;

@Service
public class PatientServiceImpl implements IPatientService {
	@Autowired
	PatientRepository patientRepository;
	@Autowired
	RendezVousRepository rendezVousRespository;

	@Override
	public Patient savePatient(Patient p) {
		
		return patientRepository.save(p);
	}

	@Override
	public Patient updatePatient(Patient p) {
		
		return patientRepository.save(p);
	}

	@Override
	public void deletePatient(Patient p) {
		patientRepository.delete(p);
		
	}

	@Override
	public void deletePatientBId(int id) {
		
		patientRepository.deleteById(id); 
	}

	@Override
	public Patient getPatient(int id) {
		
		return patientRepository.findById(id).get() ;
	}

	@Override
	public List<Patient> getAllPatient() {
		
		return patientRepository.findAll();
	}
////// RendezVous /////
	@Override
	public RendezVous saveRendezVous(RendezVous r) {
		
		return rendezVousRespository.save(r);
	}

	@Override
	public RendezVous updateRendezVous(RendezVous r) {
		
		return rendezVousRespository.save(r);
	}

	@Override
	public void deleteRendezVous(RendezVous r) {
		rendezVousRespository.delete(r);
		
	}
	@Override
	public void deleteRendezVousBId(int id) {
		rendezVousRespository.deleteById(id);
		
	}

	@Override
	public RendezVous getRendezVous(int id) {
		
		return rendezVousRespository.findById(id).get();
	}

	@Override
	public List<RendezVous> getAllRendezVous() {
		
		return rendezVousRespository.findAll();
	}

}

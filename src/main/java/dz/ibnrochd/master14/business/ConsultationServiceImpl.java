package dz.ibnrochd.master14.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.dao.ConsultationRepository;
import dz.ibnrochd.master14.dao.LigneConsultationRepository;
import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.LigneConsultation;

@Service
public class ConsultationServiceImpl implements IConsultationService {

	@Autowired
	ConsultationRepository consultationRepository;
	@Autowired
	LigneConsultationRepository ligneConsultationRepository;
	@Override
	public Consultation saveConsultation(Consultation c) {
		// TODO Auto-generated method stub
		return consultationRepository.save(c);
	}

	@Override
	public Consultation updateConsultation(Consultation c) {
		// TODO Auto-generated method stub
		return consultationRepository.save(c);
	}

	@Override
	public void deleteConsultation(Consultation c) {
		consultationRepository.delete(c);
		
	}

	@Override
	public void deleteConsultationBId(int id) {
		consultationRepository.deleteById(id);
		
	}

	@Override
	public Consultation getConsultation(int id) {
		
		return consultationRepository.findById(id).get();
	}

	@Override
	public List<Consultation> getAllConsultation() {
		
		return consultationRepository.findAll();
	}

	@Override
	public LigneConsultation saveLigneConsultation(LigneConsultation c) {
		// TODO Auto-generated method stub
		return ligneConsultationRepository.save(c);
	}

	@Override
	public LigneConsultation updateLigneConsultation(LigneConsultation c) {
		// TODO Auto-generated method stub
		return ligneConsultationRepository.save(c);
	}

	@Override
	public void deleteLigneConsultation(LigneConsultation c) {
		ligneConsultationRepository.delete(c);
		
	}

	@Override
	public void deleteLigneConsultationBId(int id) {
		ligneConsultationRepository.deleteById(id);
		
	}

	@Override
	public LigneConsultation getLigneConsultation(int id) {
		// TODO Auto-generated method stub
		return ligneConsultationRepository.findById(id).get();
	}

	@Override
	public List<LigneConsultation> getAllLigneConsultation() {
		
		return ligneConsultationRepository.findAll();
	}

}

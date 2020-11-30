package dz.ibnrochd.master14.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.dao.TraitementRepository;
import dz.ibnrochd.master14.model.Traitement;

@Service
public class TraitementServiceImpl implements ITraitementService {
	
	
	
	@Autowired
	TraitementRepository traitementRepository;

	@Override
	public Traitement savePatient(Traitement t) {
		
		return traitementRepository.save(t);
	}

	@Override
	public Traitement updateTraitement(Traitement t) {
		
		return traitementRepository.save(t);
	}

	@Override
	public void deleteTraitement(Traitement t) {
		traitementRepository.delete(t);
		
	}

	@Override
	public void deleteTraitementBId(int id) {
		traitementRepository.deleteById(id);
		
	}

	@Override
	public Traitement getTraitement(int id) {
		
		return traitementRepository.findById(id).get();
	}

	@Override
	public List<Traitement> getAllTraitement() {
		
		return traitementRepository.findAll();
	}

}

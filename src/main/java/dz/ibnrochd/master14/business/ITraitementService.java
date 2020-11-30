package dz.ibnrochd.master14.business;

import java.util.List;


import dz.ibnrochd.master14.model.Traitement;

public interface ITraitementService {
	Traitement savePatient(Traitement t);
	Traitement updateTraitement(Traitement t);
	void deleteTraitement(Traitement t);
	void deleteTraitementBId(int id);
	Traitement getTraitement(int id);
	List<Traitement> getAllTraitement();
}

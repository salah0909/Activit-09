package dz.ibnrochd.master14.business;

import java.util.List;

import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.LigneConsultation;



public interface IConsultationService {
	/////gestion des consultation /////
	Consultation saveConsultation(Consultation c);
	Consultation updateConsultation(Consultation c);
	void deleteConsultation(Consultation c);
	void deleteConsultationBId(int id);
	Consultation getConsultation(int id);
	List<Consultation> getAllConsultation();
	////// gestion des ligne de consultation//////
	LigneConsultation saveLigneConsultation(LigneConsultation c);
	LigneConsultation updateLigneConsultation(LigneConsultation c);
	void deleteLigneConsultation(LigneConsultation c);
	void deleteLigneConsultationBId(int id);
	LigneConsultation getLigneConsultation(int id);
	List<LigneConsultation> getAllLigneConsultation();

}

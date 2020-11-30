package dz.ibnrochd.master14.business;

import java.util.List;

import dz.ibnrochd.master14.model.Patient;
import dz.ibnrochd.master14.model.RendezVous;
//// Gestion des Patient //////
public interface IPatientService {
Patient savePatient(Patient p);
Patient updatePatient(Patient p);
void deletePatient(Patient p);
void deletePatientBId(int id);
Patient getPatient(int id);
List<Patient> getAllPatient();

////Gestion des rendez-vous/////
RendezVous saveRendezVous(RendezVous r);
RendezVous updateRendezVous(RendezVous r);
void deleteRendezVous(RendezVous r);
void deleteRendezVousBId(int id);
RendezVous getRendezVous(int id);
List<RendezVous> getAllRendezVous();

}

package Gestion_Personnel;

import school.management.system.Membre;
import school.management.system.Teacher;

public interface GestionnairePersonnel {
	 public void ajouterPersonnel(Membre personnel);
	    public void supprimerPersonnel(Membre personnel);
	    public void modifierPersonnel(Membre personnel);
}

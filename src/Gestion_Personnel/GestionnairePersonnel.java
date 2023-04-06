package Gestion_Personnel;

import school.management.system.Teacher;

public interface GestionnairePersonnel {
	 public void ajouterPersonnel(Teacher personnel);
	    public void supprimerPersonnel(int id);
	    public void modifierPersonnel(Teacher personnel);
}

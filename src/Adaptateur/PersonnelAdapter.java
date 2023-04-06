package Adaptateur;

import Gestion_Personnel.Personnel;
import school.management.system.Membre;
import school.management.system.Teacher;

public class PersonnelAdapter implements APIPersonnel {
    private Personnel p;
     public PersonnelAdapter() {
    	 p = new Personnel();
     }
	@Override
	public void add(Membre personnel) {
		// TODO Auto-generated method stub
		p.ajouterPersonnel(personnel);
	}

	@Override
	public void remove(Membre membre) {
		// TODO Auto-generated method stub
		p.supprimerPersonnel(membre);
	}

	@Override
	public void update(Membre personnel) {
		// TODO Auto-generated method stub
		p.modifierPersonnel(personnel);
	}

}

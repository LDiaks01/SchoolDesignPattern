package Adaptateur;

import Gestion_Personnel.Personnel;
import school.management.system.Teacher;

public class PersonnelAdapter implements APIPersonnel {
    private Personnel p;
     public PersonnelAdapter() {
    	 p = new Personnel();
     }
	@Override
	public void add(Teacher personnel) {
		// TODO Auto-generated method stub
		p.ajouterPersonnel(personnel);
	}

	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		p.supprimerPersonnel(id);
	}

	@Override
	public void update(Teacher personnel) {
		// TODO Auto-generated method stub
		p.modifierPersonnel(personnel);
	}

}

package Gestion_Personnel;

import java.util.ArrayList;
import java.util.List;

import school.management.system.Teacher;

public class Personnel implements GestionnairePersonnel{
	public static List<Teacher> ListeTeacher = new ArrayList<>();
	
	  public void ajouterPersonnel(Teacher personnel) {
	        // Code pour ajouter du personnel
		    ListeTeacher.add(personnel);
	    }
	    public void supprimerPersonnel(int id) {
	     	for(Teacher t : ListeTeacher) {
	    		 if(t.getId()==id) {
	    			 ListeTeacher.remove(t);
	    			
	    		 }
	    	}
	       
	    }
	    public void modifierPersonnel(Teacher personnel) {
	        // Code pour modifier du personnel
	    	for(Teacher t : ListeTeacher) {
	    		 if(t.getId()==personnel.getId()) {
	    			 ListeTeacher.remove(t);
	    			 ListeTeacher.add(personnel);
	    		 }
	    	}
	    }
}

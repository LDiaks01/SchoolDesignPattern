package Gestion_Personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import school.management.system.Membre;
import school.management.system.Teacher;

public class Personnel implements GestionnairePersonnel{
	public static List<Membre> ListeTeacher = new ArrayList<>();
	public static List<Membre> ListeStudent = new ArrayList<>();
	
	  public void ajouterPersonnel(Membre personnel) {
	        // Code pour ajouter du personnel
		  if(personnel instanceof Teacher) {
			  ListeTeacher.add(personnel);
		  }else {
			  ListeStudent.add(personnel);  
		  }
		    
	    }
	  
	    public void supprimerPersonnel(Membre membre) {
	    	  if(membre instanceof Teacher) {
				  ListeTeacher.remove(membre);
			  }else {
				  ListeStudent.remove(membre);  
			  }
	       
	    }
	    public void modifierPersonnel(Membre personnel) {
	        // Code pour modifier du personnel
	    	 if(personnel instanceof Teacher) {
	    		 Iterator<Membre> TeacherIterator = ListeTeacher.iterator();
				    while (TeacherIterator.hasNext()) {
				        Membre t = TeacherIterator.next();
				        if (t.getId() == personnel.getId()) {
				           
				        	TeacherIterator.remove();
				            
				        } 
				 }
			  }else {
				  Iterator<Membre> StudentIterator = ListeStudent.iterator();
				    while (StudentIterator.hasNext()) {
				        Membre t = StudentIterator.next();
				        if (t.getId() == personnel.getId()) {
				           
				        	StudentIterator.remove();
				            
				        } 
				 }
			  
	    	
	   
	    			  
			  }	
	    		 
	    	}
	    
}

package school.management.system;

import java.util.ArrayList;
import java.util.List;

import Strategy.Paiement;
import school.management.system.fabrique.Entity;
import school.management.system.observateur.Observateur;
import school.management.system.observateur.Subjects;
import school.management.system.observateur.Sujet;

/**
 * Created by Rakshith on 4/3/2017.
 * This class is responsible for keeping the
 * track of students fees, name ,grade & fees
 * paid.
 *
 */

public class Student extends Membre implements Entity, Sujet{

    private int grade;
    private int feesPaid;
    private int feesTotal;
    private List<Subjects> subjects = new ArrayList<>();
    private List<Observateur> observateurs = new ArrayList();


	/**
     * To create a new student by initializing.
     * Fees for every student is $30,000.
     * Fees paid initially is 0.
     * @param id id for the student: unique.
     * @param name name of the student.
     * @param grade grade of the student.
     */
    public Student(int id, String name,int grade){
    	super(id,name);
        this.feesPaid=0;
        this.feesTotal=30000;
        this.grade=grade;

    }

    
	@Override
	public void enregisterObservateur(Observateur o) {
		observateurs.add(o);
	}

	@Override
	public void supprimerObservateur(Observateur o) {
		observateurs.remove(o);
		
	}

	@Override
	public void notifierObservateur() {
		for(Observateur o : observateurs) {
			o.actualiser(this);
		}
		
	}
    
	public void registerSubject(Subjects s) {
		 this.subjects.add(s);
		 this.notifierObservateur();
	}
  
    
    //Not going to alter student's name, student's id.


    /**
     * Keep adding the fees to feesPaid Field.
     * Add the fees to the fees paid.
     * The school is going receive the funds.
     *
     * @param fees the fees that the student pays.
     */
    public void payFees(Paiement p, double montant){
        feesPaid+=p.payer(montant);
        School.updateTotalMoneyEarned(feesPaid);
    }
    
    /**
     *
     * @return the grade of the student.
     */
    public int getGrade() {
        return grade;
    }


    /**
     * Used to update the student's grade.
     * @param grade new grade of the student.
     */
    public void setGrade(int grade){
        this.grade=grade;
    }
    
    /**
     *
     * @return fees paid by the student.
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}

    
    /**
     *
     * @return the total fees of the student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    public void setFeesTotal(int feesTotal) {
		this.feesTotal = feesTotal;
	}
    
    public List<Subjects> getSubjects() {
		return subjects;
	}

	
	/**
     *
     * @return the remaining fees.
     */
    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {

        return "Student's name :"+super.getName()+
                "\nTotal fees paid so far $"+ feesPaid+ 
                "\nList of subjects : " + subjects +" ";
    }

	
}

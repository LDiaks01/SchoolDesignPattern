package school.management.system;

import java.util.ArrayList;
import java.util.List;

import school.management.system.fabrique.Entity;
import school.management.system.observateur.Observateur;
import school.management.system.observateur.Subjects;

/**
 * Created by Rakshith on 4/3/2017.
 * This class is responsible for keeping the track
 * of teacher's name, id, salary.
 */

public class Teacher extends Membre implements Entity, Observateur {

    private int salary;
    private int salaryEarned;
    private Subjects subject;
    private List<Student> students ;

    /**
     * Creates a new Teacher object.
     * @param id id for the teacher.
     * @param name name of the teacher.
     * @param salary salary of the teacher.
     */
    public Teacher(int id, String name, Subjects subject, int salary){
       super(id,name);
        this.salary=salary;
        this.salaryEarned=0;
        this.students = new ArrayList<>();
    }

    /**
     *
     * @return the salary of the teacher.
     */
    public int getSalary(){
        return  salary;
    }

    /**
     * set the salary.
     * @param salary
     */
    public void setSalary(int salary){
        this.salary=salary;
    }

    /**
     * Adds  to salaryEarned.
     * Removes from the total money earned by the school.
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }
    
    @Override
	public void actualiser(Student s) {
//		if(s.getSubjects().contains(this.subject)) {
//			if(! this.students.contains(s)) {
				this.students.add(s);
//			}
//		}
		this.toString();
	}


    @Override
    public String toString() {

        return "Name of the Teacher: " + this.getName()
                +"\nTotal salary earned so far $"+ salaryEarned+
        		"\nList of students : " + students ; 
    }

	
}

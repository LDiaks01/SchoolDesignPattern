package school.management.system;

import school.management.system.fabrique.Entity;

/**
 * Created by Rakshith on 4/3/2017.
 * This class is responsible for keeping the track
 * of teacher's name, id, salary.
 */
public class Teacher extends Membre implements Entity {

    private int salary;
    private int salaryEarned;

    /**
     * Creates a new Teacher object.
     * @param id id for the teacher.
     * @param name name of the teacher.
     * @param salary salary of the teacher.
     */
    public Teacher(int id, String name, int salary){
       super(id,name);
        this.salary=salary;
        this.salaryEarned=0;
    }

    /**
     *
     * @return the id of the teacher.
     */
  

    /**
     *
     * @return name of the teacher.
     */



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
    public String toString() {
        return "Name of the Teacher: " + this.getName()
                +" Total salary earned so far $"
                + salaryEarned;
    }
}

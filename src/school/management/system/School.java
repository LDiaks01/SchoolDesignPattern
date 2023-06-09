package school.management.system;

import school.management.system.fabrique.Entity;

import java.util.List;

/**
 * Many teachers, many students.
 * Implements teachers and student
 * using an ArrayList.
 * Created by Rakshith on 4/3/2017.
 */
public class School implements Entity {
    //declaration de la seule instance possible de School
    private static School INSTANCE;
    private List<Membre> teachers;
    private List<Membre> students;
    private static int  totalMoneyEarned;
    private static int totalMoneySpent;


    //Mise en place du design pattern Singleton
    //On commence par rendre le constructeur privé
    private School(){};

    // On met en place la méthode d'accès à l'instance de School

    public static synchronized School getINSTANCE() {
        if(INSTANCE == null)
        {
            return new School();
        }
        return INSTANCE;
    }

    /**
     * Etant donné que School n'a qu'une instance unique désormais et qu'au début elle est vide,
     * Cette méthode permet d'affecter des valeurs aux attributs de la classe car on ne peut plus passer le constructeur
     * A noter qu'on peut également passer par les getters et setteurs de chaque attribut
     * @param listeTeacher list of teachers in the school.
     * @param students list of students int the school.
     */
    public void setSchool(List<Membre> listeTeacher, List<Membre> students) {
        this.teachers = listeTeacher;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    /**
     *
     * @return the list of teachers int the school.
     */
    public List<Membre> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school.
     * @param teacher the teacher to be added.
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return the list of students in the school.
     */
    public List<Membre> getStudents() {
        return students;
    }

    /**
     * Adds a student to the school
     * @param student the student to be added.
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the total money earned by the school.
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school.
     * @param MoneyEarned money that is supposed to be  added.
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school.
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school which
     * is the salary given by the school to its teachers.
     * @param moneySpent the money spent by school.
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
     }
}

package school.management.system;

import school.management.system.fabrique.StudentFabrique;
import school.management.system.fabrique.TeacherFabrique;

import java.util.ArrayList;
import java.util.List;

import Adaptateur.PersonnelAdapter;
import Gestion_Personnel.Personnel;
import Strategy.Carte;
import Strategy.Espece;

/**
 * Created by Rakshith on 4/3/2017.
 */
public class Main {
    public static void main(String[] args) {
        //Declaration des fabriques pour les students et teachers
    	
        StudentFabrique studentFabrique = new StudentFabrique();
        TeacherFabrique teacherFabrique = new TeacherFabrique();

        // Exemple : Teacher lizzy = new Teacher(1,"Lizzy",500) => teacherFabrique.createTeacher(1,"Lizzy",500);
        
        Teacher lizzy = teacherFabrique.createTeacher(1,"Lizzy",500);
        Teacher mellisa = teacherFabrique.createTeacher(2,"Mellisa",700);
        Teacher vanderhorn =  teacherFabrique.createTeacher(3,"Vanderhorn",600);


        PersonnelAdapter p = new PersonnelAdapter();
        
         p.add(vanderhorn);
         p.add(mellisa);
         p.add(lizzy);


        //Les objets sont désormais crées par la fabrique
        Student tamasha = studentFabrique.createStudent(1,"Tamasha",4);
        Student rakshith = studentFabrique.createStudent(2,"Rakshith Vasudev",12);
        Student rabbi = studentFabrique.createStudent(3,"Rabbi",5);
        
        p.add(tamasha);
        p.add(rakshith);
        p.add(rabbi);
        
        System.out.println(Personnel.ListeStudent.toString());

            tamasha = studentFabrique.createStudent(1,"TamashaALLLLLLLLL",4);
            
        p.update(tamasha);

        System.out.println(Personnel.ListeStudent.toString());
        //On recupere l'instance
        School ghs = School.getINSTANCE();
        // et si on veut initialiser des valeurs, on appelle setSchool
        // attention à l'utilisation de cette méthode
        ghs.setSchool(Personnel.ListeTeacher,Personnel.ListeStudent);

        Teacher megan = teacherFabrique.createTeacher(6,"Megan", 900);

        ghs.addTeacher(megan);
         
        //mode de paiement
        tamasha.payFees(new Carte("12141222", 117, "45445"),4500);
        rakshith.payFees(new Espece(),6000);
        
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to " + vanderhorn.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(rakshith);

        mellisa.receiveSalary(mellisa.getSalary());

        System.out.println(mellisa);


    }
}

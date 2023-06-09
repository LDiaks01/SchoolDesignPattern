package school.management.system.fabrique;

import school.management.system.Student;
import school.management.system.Teacher;
import school.management.system.observateur.Subjects;

public class StudentFabrique extends AbstractFabrique{
    @Override
    public  Student createStudent(int id, String name, int grade) {
        return new Student(id,name,grade);
    }


    @Override
    public Teacher createTeacher(int id, String name, Subjects subject, int salary) {
        throw new UnsupportedOperationException("La fabrique de Student ne peut pas créer des enseignants, utiliser TeacherFabrique à la place");
    }
}

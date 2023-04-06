package school.management.system.fabrique;

import school.management.system.School;
import school.management.system.Student;
import school.management.system.Teacher;

public class TeacherFabrique extends AbstractFabrique{
    /**
     * Cette méthode renvoie une exception car pour créer un objet de type Student, il faut passer par {@link StudentFabrique}
     * Mais elle doit être implementée car elle appartient à la classe {@link AbstractFabrique}
     * @param id
     * @param name
     * @param grade
     * @return
     */
    @Override
    public Student createStudent(int id, String name, int grade) {
        throw new UnsupportedOperationException("La fabrique de Teacher ne peut pas " +
                "créer des Student, utiliser StudentFabrique à la place");
    }

    /**
     * Cette méthode sera appelée désormais quand un nouvel objet Teacher voudra être crée
     * @param id
     * @param name
     * @param salary
     * @return
     */
    @Override
    public Teacher createTeacher(int id, String name, int salary) {
        return new Teacher(id,name,salary);
    }
}

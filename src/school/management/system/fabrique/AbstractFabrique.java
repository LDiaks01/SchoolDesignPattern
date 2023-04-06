package school.management.system.fabrique;

import school.management.system.observateur.Subjects;

public abstract class AbstractFabrique {

    public abstract Entity createStudent(int id, String name,int grade);
    public abstract Entity createTeacher(int id, String name, Subjects subject, int salary);

}

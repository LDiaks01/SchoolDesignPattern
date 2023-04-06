package school.management.system.fabrique;

public abstract class AbstractFabrique {

    public abstract Entity createStudent(int id, String name,int grade);
    public abstract Entity createTeacher(int id, String name, int salary);

}

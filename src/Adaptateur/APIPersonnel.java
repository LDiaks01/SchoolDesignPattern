package Adaptateur;

import school.management.system.Teacher;

public interface APIPersonnel {
	    public void add(Teacher personnel);
	    public void remove(int id);
	    public void update(Teacher personnel);
}

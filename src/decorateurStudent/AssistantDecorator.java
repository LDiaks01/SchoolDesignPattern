package decorateurStudent;

import school.management.system.Student;

public class AssistantDecorator extends Student{
    private Student student;
    
    public AssistantDecorator( Student student) {
        super(student.getId(),student.getName(),student.getGrade());
        
    }
  
    
   public String toString() {
	return super.getName()+" est devenu assistant pour aider les éleves en difficulté";
	   
   }
}

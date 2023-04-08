package decorateurStudent;

public class AssistantDecorator implements Student {
    private Student student;
    
    public AssistantDecorator(Student student) {
        this.student = student;
    }
    
    public void study() {
        student.study();
        becomeAssistant();
    }
    
    private void becomeAssistant() {
        System.out.println("The student has become an assistant.");
    }
}

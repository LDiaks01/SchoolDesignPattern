package school.management.system;

public class Membre {
	  private int id;
	    private String name;
  public Membre(int id,String name) {
	   this.id = id;
	   this.name = name;
  }
  
  public int getId() {
      return id;
  }

  /**
   *
   * @return name of the student.
   */
  public String getName() {
      return name;
  }
}

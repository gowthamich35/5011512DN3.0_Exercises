package student;

public class MVC_PatternTest {
 public static void main(String[] args) {
     Student student = new Student("John Doe", "S123", "A");

     StudentView view = new StudentView();

     StudentController controller = new StudentController(student, view);

     controller.updateView();

     controller.setStudentName("Jane Doe");
     controller.setStudentId("S456");
     controller.setStudentGrade("B");

     controller.updateView();
 }
}


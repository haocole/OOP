package STUDENTMANAGEMENT.STUDENT;



import java.util.ArrayList;

public class StudentService {
    

      private ArrayList<Student> students = new ArrayList<>();

      public void addStudent(Student student){
        students.add(student);

      }
      public void showStudents() {

        if (students.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    public Student findStudentById(int id) {

        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }

        return null;
    }

    public boolean removeStudentById(int id) {

        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                return true;
            }
        }

        return false;
    }
}





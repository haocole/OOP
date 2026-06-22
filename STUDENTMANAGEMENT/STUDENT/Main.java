package STUDENTMANAGEMENT.STUDENT;

public class Main {
    public static void main(String[] args) {

        StudentService service = new StudentService();

        Student s1 = new Student(
                1,
                "Le Huu Tin",
                19,
                8.7,
                8.8
        );

        Student s2 = new Student(
                2,
                "A Lang Hao",
                19,
                8.8,
                8.9
        );

        service.addStudent(s1);
        service.addStudent(s2);

        System.out.println("===== DANH SACH SINH VIEN =====");
        service.showStudents();

        System.out.println("\n===== TIM ID = 2 =====");

        Student result = service.findStudentById(2);

        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("Khong tim thay!");
        }

        System.out.println("\n===== XOA ID = 1 =====");

        if (service.removeStudentById(1)) {
            System.out.println("Xoa thanh cong!");
        } else {
            System.out.println("Khong tim thay ID!");
        }

        System.out.println("\n===== DANH SACH SAU KHI XOA =====");
        service.showStudents();
    }
}

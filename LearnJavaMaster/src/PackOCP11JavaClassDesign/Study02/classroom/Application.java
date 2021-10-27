package PackOCP11JavaClassDesign.Study02.classroom;

public class Application {
    public static void main(String[] args) {
        Class classroom = new Class();

        classroom.addStudent(new Student(2015032926, "Weder Mariano"));
        classroom.addStudent(new Student(2015036362, "Arthur Willian"));
        classroom.addStudent(new Student(2015035848, "Edmilson"));

        classroom.printStudents();
    }
}

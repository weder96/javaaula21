package PackOCP11JavaClassDesign.Study02.classroom;

import java.util.List;
import java.util.ArrayList;

public class Class {
    protected List<Student> students;

    public Class() {
        this.students = new ArrayList<Student>();
    }

    public void addStudent(Student newStudent) {
        this.students.add(newStudent);
    }

    public List<Student> listStudents() {
        return this.students;
    }

    public void printStudents() {
        System.out.println("Students List:");
        for (Student student : this.students) {
            System.out.println(" " + student.getEnrollment() + ": " + student.getName());
        }
    }

    public void removeStudent(Student rmStudent) {
        for (int i = 0; i < this.students.size(); i++) {
            if (this.students.get(i).getEnrollment() == rmStudent.getEnrollment()) {
                this.students.remove(i);
                break;
            }
        }
    }

    public Student returnStudent(int enrollment) {
        for (Student student : this.students) {
            if (student.getEnrollment() == enrollment) {
                return student;
            }
        }
        return null;
    }

    public void showStudent(int enrollment) {
        for (Student student : this.students) {
            if (student.getEnrollment() == enrollment) {
                System.out.println(student.getEnrollment() + ": " + student.getName());
                break;
            }
        }
    }
}

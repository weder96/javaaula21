package PackOCP11JavaClassDesign.Study03.school;

public class Classroom {
    private Student st1;
    private Student st2;
    private Student st3;

    public Classroom() {
        this.st1 = new Student();
        this.st2 = new Student();
        this.st3 = new Student();
    }

    public Classroom(Student s1, Student s2, Student s3) {
        this.st1 = s1;
        this.st2 = s2;
        this.st3 = s3;
    }

    public void setStudent1(Student s) {
        this.st1 = new Student(s);
    }

    public void setStudent2(Student s) {
        this.st2 = new Student(s);
    }

    public void setStudent3(Student s) {
        this.st3 = new Student(s);
    }

    public Student getStudent1() {
        return this.st1;
    }

    public Student getStudent2() {
        return this.st2;
    }

    public Student getStudent3() {
        return this.st3;
    }

    public double calculateMedia() {
        return (st1.calculateMedia() + st2.calculateMedia() + st3.calculateMedia())/3.0;
    }
}

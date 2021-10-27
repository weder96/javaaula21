package PackOCP11JavaClassDesign.Study03.school;

public class Student {
    private Exam exam1;
    private Exam exam2;

    public Student() {
        this.exam1 = new Exam();
        this.exam2 = new Exam();
    }

    public Student(Student s) {
        this(s.exam1, s.exam2);
    }

    public Student(Exam e1, Exam e2) {
        this.exam1 = e1;
        this.exam2 = e2;
    }

    public Student(double e1n1, double e1n2, double e2n1, double e2n2) {
        this.exam1 = new Exam(e1n1, e1n2);
        this.exam2 = new Exam(e2n1, e2n2);
    }

    public void setExam1(Exam e) {
        this.exam1 = e;
    }

    public void setExam2(Exam e) {
        this.exam2 = e;
    }

    public double calculateMedia() {
        return (this.exam1.calculateFinalGrade() + this.exam2.calculateFinalGrade())/2.0;
    }
}

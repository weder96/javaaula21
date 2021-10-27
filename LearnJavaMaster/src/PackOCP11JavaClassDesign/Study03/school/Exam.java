package PackOCP11JavaClassDesign.Study03.school;

public class Exam {
    private double grade1;
    private double grade2;

    public Exam() {
        this.grade1 = 0;
        this.grade2 = 0;
    }

    public Exam(double g1, double g2) {
        this.grade1 = g1;
        this.grade2 = g2;
    }

    public void setGrade1(double n) {
        this.grade1 = n;
    }

    public void setGrade2(double n) {
        this.grade2 = n;
    }

    public double calculateFinalGrade() {
        return this.grade1 + this.grade2 > 10 ? 10 : this.grade1 + this.grade2;
    }
}

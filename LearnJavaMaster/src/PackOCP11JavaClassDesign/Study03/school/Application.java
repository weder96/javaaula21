package PackOCP11JavaClassDesign.Study03.school;

public class Application {
    public static void main(String[] args) {
        Classroom cr = new Classroom();

        cr.setStudent1(new Student(new Exam(4.0, 2.5), new Exam(1.0, 7.0)));
        cr.setStudent2(new Student(new Exam(6.5, 3.5), new Exam(0.0, 3.0)));
        cr.setStudent3(new Student(new Exam(5.0, 4.0), new Exam(6.0, 1.5)));

        System.out.println("Media Aluno 1: " + cr.getStudent1().calculateMedia());
        System.out.println("Media Aluno 2: " + cr.getStudent2().calculateMedia());
        System.out.println("Media Aluno 3: " + cr.getStudent3().calculateMedia());
        System.out.println("Media da turma: " + cr.calculateMedia());
    }
}

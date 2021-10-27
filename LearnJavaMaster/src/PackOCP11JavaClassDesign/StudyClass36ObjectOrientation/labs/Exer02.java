package PackOCP11JavaClassDesign.StudyClass36ObjectOrientation.labs;

import java.util.Scanner;

public class Exer02 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o nome do curso:");
        String nome = scan.nextLine();
        
        System.out.println("Entre com o horário do curso:");
        String horario = scan.nextLine();
        
        System.out.println("Entre com o nome do professor:");
        String nomeProf = scan.nextLine();
        
        System.out.println("Entre com o departamento do professor:");
        String depProf = scan.nextLine();
        
        System.out.println("Entre com o email do professor:");
        String emailProf = scan.nextLine();
        
        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setHorario(horario);
        
        Professor professor = new Professor();
        professor.setNome(nomeProf);
        professor.setDepartamento(depProf);
        professor.setEmail(emailProf);
        
        curso.setProfessor(professor);
        
        System.out.println("---Alunos---");
        
        Aluno[] alunos = new Aluno[5];
        for (int i=0; i<5; i++){
            
            scan.nextLine();
            
            System.out.println("Entre com o nome do aluno " + (i+1));
            String nomeAluno = scan.nextLine();
            
            System.out.println("Entre com a matrículo do ano:");
            String matAluno = scan.nextLine();
            
            double[] notas = new double[4];
            
            for (int j=0; j<4; j++){
                System.out.println("Entre com a nota " + (j+1));
                notas[j] = scan.nextDouble();
            }
            
            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matAluno);
            aluno.setNotas(notas);
            
            alunos[i] = aluno;
        }
        
        curso.setAlunos(alunos);
        
        System.out.println(curso.obterInfo());
    }
            
}

package OCA04_Creating_and_Using_Arrays;

public class Exercicio4 {

	public static void main(String[] args) {
		double nota1 =9;
		double nota2 =9;
		double nota3 =9;
		double media =0.0;
		
		media = (nota1+nota2+nota3)/3;
		
		if(media>=9){System.out.println("A : "+media);}
		else
		if(media>=7.5 && media<9){System.out.println("B :" +media);}
		else
		if(media>=6 && media<7.5){System.out.println("C :"+media);}
		else
		if(media>=4 && media<6){System.out.println("D :"+media);}
		else{
		System.out.println("E :"+media);
		}
		
	}

}

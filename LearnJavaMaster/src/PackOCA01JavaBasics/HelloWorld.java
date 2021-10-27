package  PackOCA01JavaBasics;

public class HelloWorld {
	//escopo de variavel
	 int x=10;

	public static final void main(String[] args) {
		System.out.println("hello World");
		HelloWorld ola = new HelloWorld(); //objeto
		
		ola.viewer();
	}
	
	
	public void viewer(){
		//achar maior numero
		int x=20; 
		int y=20;
		
		if(x==y){
			System.out.println("igual :"+(x) +" igual :"+ y);
		}
		else
		if(x>y){
			System.out.printf("x maior %d\n lindo",x);
		}else{
			System.out.printf("y e maior %d\n top",y);
		}	
		
	}
	
}

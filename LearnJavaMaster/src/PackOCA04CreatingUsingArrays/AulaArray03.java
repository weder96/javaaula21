package OCA04_Creating_and_Using_Arrays;

public class AulaArray03 {

	public static void main(String[] args) {
		 int[][] array = new int[3][3]; 
		 array[0][0] = 19; 
		 array[0][1] = 22;  
		 array[0][2] = 31;
		 
		 array[1][0] = 2; 
		 array[1][1] = 51;  
		 array[1][2] = 12;
		 
		 array[2][0] = 41; 
		 array[2][1] = 11; 
		 array[2][2] = 3;  
		 
		 for (int i = 0; i < array.length; i++) { 
			  for (int j = 0; j < array[i].length; j++) { 
				  System.out.println(array[i][j]); 
			  } 
		 } 
	}
}

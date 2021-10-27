package OCA04_Creating_and_Using_Arrays;

public class AulaArray02 {
	 public static void main(String[] args) { 
		 int[] array = new int[10]; 
		 array[0] = 57; 
		 array[1] = 436;  
		 array[2] = 724; 
		 array[3] = 564; 
		 array[4] = 245; 
		 array[5] = 47; 
		 array[6] = 34; 
		 array[7] = 1; 
		 array[8] = 347735; 
		 array[9] = 83; 
		 
		 for(int i = 0; i < array.length; i++) { 
			 System.out.println(array[i]);
		 }
		 
		 System.out.println("");
		 
		 for(int item : array) { 
			 System.out.println(item);
		 }
		 
	 }


}

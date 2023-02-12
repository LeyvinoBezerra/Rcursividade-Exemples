package recursividade;
public class Fatorial {

	public static void main(String[] args) {

		double fat = fatorial(5);
		
	    System.out.print(fat);
	}
	
	
	public static int fatorial(int num) {
	   if(num == 0) {
		   return 1;
	   }
	   return num * fatorial(num-1);
   }

}

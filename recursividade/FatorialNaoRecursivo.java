package recursividade;

public class FatorialNaoRecursivo {

	public static void main(String[] args) {
		 long fat = fatnotrec(15);                 // chamada da função
		System.out.println("Fatorial = "+ fat);    // imprimir função
		
	}
public static int fatnotrec(int num) {
	   if(num ==0) {                              // ponto de parada
		   return 1;
	   }
	   int total = 1;
	   for(int i=num; i>1; i--) {                  // contador recebe num
		   total *= i;                             // lógica Fatorial
	   }
	   return total;
   }
}

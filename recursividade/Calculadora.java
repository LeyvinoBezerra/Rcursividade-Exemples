package recursividade;

public class Calculadora {
	
	
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.print(Calculadora.fibonacci(i)+ " ");
			
			
		}
		
		
	}
	
  public static int fibonacci(int num) { // método estático 
		
		if(num < 2) {   // ponto de parada 
			return 1;
		}
		
		return fibonacci(num-1) + fibonacci(num-2);
	}

}

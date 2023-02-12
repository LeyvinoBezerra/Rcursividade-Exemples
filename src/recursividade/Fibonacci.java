package recursividade;

public class Fibonacci {
	
	
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.print(Fibonacci.fibonacciM(i)+ " ");
			}
		}
	
  public static int fibonacciM(int num) { // método estático 
		
		if(num < 2) {   // ponto de parada 
			return 1;
		}
		
		return fibonacciM(num-1) + fibonacciM(num-2);
	}

}

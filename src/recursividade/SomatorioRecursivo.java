package recursividade;

import java.util.Scanner;

public class SomatorioRecursivo {
	
	public static int somatorio(int n)
	{
	    int r;   

		System.out.printf("n = %d \n",   n);

	    if(n < 1) 
	    {
	    	System.out.print("fim \n");
			r = 0;
	    }
	    else 
	    {
	        r = n + somatorio(n-1);
	    }
	    
	    return r;
	}

	
      public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
    System.out.println("-------SOMATÓRIO RECURSIVO-----------");
    System.out.println("------- Digite um numero !----------");
    int exa = in.nextInt();
    
    System.out.printf("Somatorio = %d", somatorio(exa));
    
	}
}
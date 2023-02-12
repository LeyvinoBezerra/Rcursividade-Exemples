package recursividade;

public class Somatorio {

	public static void main(String[] args) {

    System.out.println(somatorio(5));

	}
public static int somatorio(int num) { 
	
	if(num == 1) {
		return 1;
	}
	return num + somatorio(num-1);
}
}

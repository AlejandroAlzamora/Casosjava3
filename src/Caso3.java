import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i =1;
		
		int factorial=1;
		
	System.out.print("Ingrese Número: ");
	
	int n=sc.nextInt();
	
	 while(i <= n) {
		 
		 factorial*=i;
		 i++;
	 }
	 
	 System.out.println("El factorial de " + n + " es: " + factorial);

	}

}
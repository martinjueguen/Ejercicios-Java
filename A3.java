package A2;
import java.util.Scanner;
public class A3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
	int A; int E; 
	System.out.println("ingrese el a�o actual"); 
	A = sc.nextInt();
	System.out.println("ingrese el a�o de nacimiento"); 
	E = sc.nextInt();
	E=A-E; System.out.println("su edad es: "+ E);
	
	}

}

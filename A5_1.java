//Dise�ar un programa que solicite al usuario que introduzca por teclado 5  
//n�meros decimales a continuaci�n, debe mostrar los n�meros en el mismo orden 
//que se han introducido.
package Default;
import java.util.Scanner;
public class A5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num [] = new int[5];
		for (int i=0; i<=4; i++){
			System.out.println("ingrese el numero "+i);
			num[i] = sc.nextInt();
		}
		for (int i=0; i<=4; i++){
			System.out.println(num[i]);
			
		}
		
		
		
		
		
		
		
		
	}

}

//Escribir una aplicaci�n que solicite al usuario cu�ntos n�meros desea introducir.
//A continuaci�n, se introducir� por teclado esa cantidad de n�meros enteros, y por �ltimo,
//los mostrar� en el orden inverso al introducido

package Default;
import java.util.Scanner;
public class A5_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cant;
		System.out.println("cuantos numeros queres introducir");
		cant = sc.nextInt();
		int num [] = new int[cant];
		int i =0;
		for (i=0;i<cant;i++) {
			System.out.println("ingrese el numero "+i);
			num[i] = sc.nextInt();
		}
		i=cant;
		i=i-1;
		
		while (i>=0) {
			System.out.println(num[i]);
			i=i-1;
		}
	
		
		
		
		
		
		
		
		
	}

}

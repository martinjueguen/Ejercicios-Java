//Implementar un programa que inicialice una tabla con nuestros n�meros favoritos. 
//A continuaci�n, pedir al usuario el �ndice de un elemento que ser� eliminado de la tabla.
//Continuaremos eliminando elementos hasta que el �ndice introducido sea negativo o hasta que no existan m�s elementos que borrar. 
//Es imprescindible controlar que el �ndice le�do corresponde a un dato v�lido.

package Default;
import java.util.Scanner;
public class A5_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num [] = new int[6];
		num [0]=5;
		num [1]=2;
		num [2]=14;
		num [3]=12;
		num [4]=7;
		num [5]=1;
		
		int place=0;
		while (place>=0) {
			for (int i=0; i<6;i++) {
				System.out.println(i+") "+ num[i]);
			}
			System.out.println("ingrese el numero a eliminar");
			place = sc.nextInt();
			if (place>-1 && place<6) {
				num[place]=0;
			}
			
			
			
		}
	}

}

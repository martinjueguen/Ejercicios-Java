//Definir una funci�n que tome como par�metros dos tablas, la primera con los 6 n�meros de una apuesta de la primitiva, y la segunda con los 6 n�meros de la combinaci�n ganadora. La funci�n devolver� el n�mero de aciertos

package Default;
import java.util.*;
public class A5_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matriz [][];
		matriz = new int [2][3];
		int matriz2 [][];
		matriz2 = new int [2][3];
		for (int i=0; i<2;i++) {
			for (int j=0; j<3;j++) {
				matriz [i][j] =	(int) (Math.random() *10);
				
				
				System.out.print (matriz [i][j]+ " ");
				
			}
			System.out.println ();
		}
		for (int i=0; i<2;i++) {
			for (int j=0; j<3;j++) {
				matriz2 [i][j] =	(int) (Math.random() *10);
				
				
				System.out.print (matriz2 [i][j]+ " ");
				
			}
			System.out.println ();
		}
		for (int i=0; i<2;i++) {
			for (int j=0; j<3;j++) {
				if (matriz [i][j] ==	matriz2 [i][j]) {
					System.out.println("hay una coincidencia en la pocicion "+i+" "+j);
				}
			
				
			}
			
		}
		
		
	}

}

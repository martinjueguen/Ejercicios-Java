//Desarrollar el juego la c�mara secreta, que consiste abrir una c�mara mediante su combinaci�n secreta, 
//que est� formado por una combinaci�n de d�gitos del uno al cinco. 
//El jugador especificar� cu�l es la longitud de la combinaci�n, 
//a mayor longitud mayor ser� la dificultad del juego. La aplicaci�n genera, 
//de forma aleatoria, una combinaci�n secreta que el usuario tendr� que acertar. 
//En cada intento se muestra como pista, para cada d�gito de la combinaci�n introducido por el jugador,
//si es mayor, menor o igual que el correspondiente en la combinaci�n secreta.


package Default;
import java.util.Scanner;
public class A5_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese la cantidad de numeros a adivinar");
		int cantidad = sc.nextInt();
		int vector[]= new int [cantidad];
		int c=1;
		int ad;
		for (int i=0; i<cantidad;i++) {
			
			vector[i] = (int) Math.ceil(Math.random()*6);
			
		}
		for (int i=0; i<cantidad;i++) {
			
			while (c==1) {
				System.out.println("intente adivinar el codigo numero "+ i);
				 ad = sc.nextInt();
				if (ad == vector[i]) {
					System.out.println("adivino el numero pase al siguente");
					c=0;
				}else {
				if (ad > vector[i]) {
					System.out.println("el numero es mas chico");
				}else {
					if (ad == vector[i]) {
						System.out.println("el numero es mas grande");
					}
				}
				}
				
				
			}
			c=1;
			
		}

		System.out.println("Gano el juego");
		
		
		
		}
	}



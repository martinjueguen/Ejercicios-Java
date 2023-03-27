import java.util.Scanner;

public class AD {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double r, v;
		
		System.out.println("ingrese la longitud del radio");
		r = sc.nextDouble();
		
		v = 1.333333333 * 3.14159268 * (r * r * r);
		System.out.println("el volumen de la esfera es: " + v);
	}

}

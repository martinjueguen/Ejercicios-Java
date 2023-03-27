import java.util.Scanner;
public class AE {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double l1, l2, l3, p, a;
		System.out.println("ingrese los lados del triangulo");
		l1 = sc.nextDouble();
		l2  = sc.nextDouble();
		l3  = sc.nextDouble();
		p=(l1+l2+l3)/2;
		a =Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
		System.out.println("El area es: " + a);
		
		

	}

}

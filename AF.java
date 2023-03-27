import java.util.Scanner;
public class AF {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.println("ingrese un numero entero de 3 cifras");
		num1 = sc.nextInt();
		System.out.print("el numero del medio es: "+ ((num1/10)%10 +  " el primer numero es: "+((num1/100)%100)) + " el ultimo numero es: " + ((num1/100)%10)); 
		

	}

}

package suma;
import java.util.Scanner;

public class Suma {
	static int valor1 = 0;
	static int valor2 = 0;
	static int resultado = 0;
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
	System.out.print("ingrese el primer numero: ");
	valor1 = in.nextInt();
	
	System.out.print("ingrese el segundo numero: ");
	valor2 = in.nextInt();
	
	resultado = valor1 + valor2;
	System.out.print("El resultado de la suma es: " + resultado);
	
	
	

	}

}

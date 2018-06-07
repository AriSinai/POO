import java.util.Scanner;
import java.util.*;


public class Main{
	public static void main (String args[]) throws NumeroNegativoException{

		String[] strings = new String[3];
		strings[0]="Hola";

		for(int i=0; i<strings.length;i++){
			try{
			System.out.println(strings[i].toString());


			}catch(NullPointerException e){
				strings[i]="Vacio";
				System.out.println(strings[i].toString());

			}
		}
		System.out.println("La ejecucion continua");

		int[] enteros = new int[3];
		int agregados =0;

		while (agregados<enteros.length){
			try{
				enteros[agregados]=pedirNumero();
				agregados++;
			}catch(InputMismatchException e){
				System.out.println("No es un numero");

			}catch(NumeroNegativoException e1){
				System.out.println("Es un numero negativo");
			}catch(Exception e){
				System.out.println("Ocurrio excepcion generica");
			}
							
		}
		for (int i=0;i<enteros.length;i++){
			System.out.println(enteros[i]+"");
		}
	}

	public static int pedirNumero() throws NumeroNegativoException{
		Scanner sc= new Scanner (System.in);
		System.out.println("Que numero quieres agregar?");
		int respuesta=sc.nextInt();
		if (respuesta <0){
			throw new NumeroNegativoException();
		}
		return respuesta;

	}
}
import java.util.Scanner;
public class Main{
	
	public static void main (String args[]){

		Scanner dato= new Scanner(System.in);
		double tempe;
		int opcion=0;
		int opcion2=0;


		System.out.println("¡Hola, usuario! Bienvenido al convertidor de unidades de temperatura");
		System.out.println("Ingresa el valor de la temperatura que deseas convertir");
		tempe=dato.nextDouble();
		System.out.println("Ingresa el número correspondiente a las unidades a convertir: 1)Celsius   2) Fahrenheit   3) Kelvin ");
		opcion=dato.nextInt();

		if (opcion==1){
			
			System.out.println("Tus unidades las puedes cambiar a Kelvin o Fahrenheit");
			System.out.println("Presiona 1) Fahrenheit y 2) Kelvin");
			opcion2=dato.nextInt();
				
			if (opcion2==1){
				System.out.println("El valor de Celcius a Fahrenheit es: "+Convertidor.convertirCentigradosAFarenheit(tempe));
			}else if(opcion2==2){
				System.out.println("El valor de Celcius a Kelvin es: "+Convertidor.convertirCentigradosAKelvin(tempe));
			}else{
				System.out.println("Ingresaste un valor erroneo, intenta de nuevo");
			}
		}else if (opcion==2){
				
			System.out.println("Tus unidades las puedes cambiar a Kelvin o Celcius");
			System.out.println("Presiona 1) Kelvin y 2) Celcius");
			opcion2=dato.nextInt();
			if (opcion2==1){
				System.out.println("El valor de Fahrenheit a Celcius es:"+Convertidor.convertirFahrenheitACelcius(tempe));
			}else if(opcion2==2){
				System.out.println("El valor de Fahrenheit a Kelvin es: "+Convertidor.convertirFahrenheitAKelvin(tempe));
			}else{
				System.out.println("Ingresaste un valor erroneo, intenta de nuevo");
			}
		}else if(opcion==3){
			System.out.println("Tus unidades las puedes cambiar a Fahrenheit o Celcius");
			System.out.println("Presiona 1) Fahrenheit y 2) Celcius");
			opcion2=dato.nextInt();
			if (opcion2==1){
				System.out.println("El valor de Kelvin a Celcius es: "+Convertidor.convertirKelvinACelcius(tempe));
			}else if(opcion2==2){
				System.out.println("El valor de Kelvin a Fahrenheit es: "+Convertidor.convertirKelvinAFahrenheit(tempe));
			}else{
				System.out.println("Ingresaste un valor erroneo, intenta de nuevo");
			}
		}else{
			System.out.println("Ingresaste un valor erroneo, intenta de nuevo");
		}
			
	}
	

}
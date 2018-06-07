public class Main{
	public static void main (String args[]){

			Automovicil a = new Deportivo(2,200, "Ferrari");
			Camion c =new Camion(1,"Mercedes");

			System.out.println("La clase del onjeto es:" + a.getClass());

			if(automovil.class.isInstance(c)){
				System.out.println("Es un automovil";)

			}else{
				Syetm.out.println("No es un Automovil");
			}
	}
}
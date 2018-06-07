public class ProfesorMalo extends Profesor{
	
	public ProfesorMalo(String nombre){
		super(nombre);
	}

	public void enseniar(){
		System.out.println("El profesor" +getNombre()+" está enseñando mal");
	}
	public void enseniar (Alumno alumno){
		System.out.println("El profesor "+getNombre()+" No le esta esnseniando a "+ alumno.getNombre());
		
	}

}
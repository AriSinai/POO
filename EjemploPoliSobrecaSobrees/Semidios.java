public class Semidios extends Profesor{
	
	public Semidios(String nombre){
		super(nombre);
	}
	public void enseniar(){
		System.out.println("El profesor" +getNombre()+" está enseñando como Dios");
	}
	public void enseniar (Alumno alumno){
		System.out.println("El profe "+ getNombre()+ " Si le esta enseniando a "+alumno.getNombre());
		alumno.setPuntosDeConocimiento(alumno.getPuntosDeConocimiento());
		
	}
}
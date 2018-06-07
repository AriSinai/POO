public class Profesor{
	private String nombre;

	public Profesor(String nombre){
		this.nombre=nombre;

	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public String getNombre(){
		return nombre;
	}
	public void enseniar(){
		System.out.println("El profesor "+nombre+"Esta enseñanado");
	}
}
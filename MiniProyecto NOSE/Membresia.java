import java.io.Serializable;
public class Membresia implements Serializable{
	
	private String nombre;


	public Membresia(String nombre){
		this.nombre=nombre;
		
	}


	public void setNombre(String nombre){
		this.nombre=nombre;

	}

	public String getNombre(){
		return nombre;
	}



}
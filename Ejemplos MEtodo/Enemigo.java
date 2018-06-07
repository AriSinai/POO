public String nombre;
private int ataque;
public static int aparecidos;

public Enemigo (String nombre, int ataque){
	this.nombre=nombre;
	this.ataque=ataque;

}

public int getAtaque(){
	return ataque;
}
public void setAtaque(int ataque){
	this.ataque=ataque;
}
public String getNombre(){
	return nombre;
}
public void setNombre(String nombre){
	this.nombre=nombre;
}

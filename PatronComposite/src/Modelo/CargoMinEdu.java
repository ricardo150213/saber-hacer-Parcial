package Modelo;

public abstract class CargoMinEdu {
	protected String nombre;
	
	public CargoMinEdu (String nombre){
		this.nombre = nombre;
	}
	
	abstract public void agregar(CargoMinEdu c);
	abstract public void mostrar(int altura);
}

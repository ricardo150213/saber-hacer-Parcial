package Modelo;

public class TipoCargoMinEdu extends CargoMinEdu{
	
	public TipoCargoMinEdu (String nombre){
		super(nombre);
	}
	
	public void agregar(CargoMinEdu esp){
		System.out.println("no se puede agregar la hoja");
	}
	
	public void mostrar(int n){
		System.out.println('-' + "" + nombre);
	}
}

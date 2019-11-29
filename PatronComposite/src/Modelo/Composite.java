package Modelo;

import java.util.ArrayList;

public class Composite extends CargoMinEdu{
	private ArrayList<CargoMinEdu> lstMinEdu = new ArrayList<CargoMinEdu>();
	
	public Composite (String nombre){
		super(nombre);
	}
	
	@Override
	public void agregar(CargoMinEdu componente){
		lstMinEdu.add(componente);
	}
	
	@Override
	public void mostrar(int altura){
		System.out.println(" ");
		System.out.println(nombre);
		for (int i = 0; i<lstMinEdu.size(); i++) {
			lstMinEdu.get(i).mostrar(altura + 1);
		}
	}
	
	public String palabraMasLarga() {
		String aux = " ";
		for(int i=0; i<lstMinEdu.size(); i++) {
			String n = lstMinEdu.get(i).nombre;
			if(n.length()>aux.length()) {
				aux=n;
			}
		}
		return aux;
	}
}

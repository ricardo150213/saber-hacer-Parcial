package Modelo;

public class Main {

	public static void main(String[] args) {
		Composite raiz = new Composite("Despacho Ministerio");
		raiz.agregar(new TipoCargoMinEdu("Oficina Asesora De Comunicaciones"));
		raiz.agregar(new TipoCargoMinEdu("Oficina Asesora Juridica"));
		raiz.agregar(new TipoCargoMinEdu("Oficina Asesora De Planeacion Y Finanzas"));
		raiz.agregar(new TipoCargoMinEdu("Oficina De Innovacion Educativa Con Uso De Nuevas Tecnologias"));
		raiz.agregar(new TipoCargoMinEdu("Oficina De Cooperacion Y Asuntos Internacionales"));
		raiz.agregar(new TipoCargoMinEdu("Oficina De Control Interno"));
		raiz.agregar(new TipoCargoMinEdu("Oficina De Tecnologia Y Sistemas De Informacion"));
		raiz.agregar(new TipoCargoMinEdu("Viceministro De Educacion Preescolar Basica Y Media"));
		raiz.agregar(new TipoCargoMinEdu("Viceministro De Educacion Superior"));
		raiz.agregar(new TipoCargoMinEdu("Secretaria General"));
		
		Composite comp = new Composite("Viceministro De Educacion Preescolar Basica Y Media");
		comp.agregar(new TipoCargoMinEdu("Direccion De Calidad Para La Educacion Preescolar Basica Y Media"));
		comp.agregar(new TipoCargoMinEdu("Direccion De Fortalecimineto A La Gestion Territorial"));
		comp.agregar(new TipoCargoMinEdu("Direccion De Cobertura Y Equidad"));
		comp.agregar(new TipoCargoMinEdu("Direccion De Primera Infancia"));
		raiz.agregar(comp);
		
		Composite comp1 = new Composite("Viceministro De Educacion Superior");
		comp1.agregar(new TipoCargoMinEdu("Direccion De La Calidad Para La Educacion Superior"));
		comp1.agregar(new TipoCargoMinEdu("Direccion De Fomento De La Educacion Superior"));
		raiz.agregar(comp1);
		
		Composite comp2 = new Composite("Secretaria General");
		comp2.agregar(new TipoCargoMinEdu("Unidad De Atencion Al Ciudadado"));
		comp2.agregar(new TipoCargoMinEdu("Subdireccion De Gestion Financiera"));
		comp2.agregar(new TipoCargoMinEdu("Subdireccion De Desarrollo Organizacional"));
		comp2.agregar(new TipoCargoMinEdu("Subdireccion De Talento Humano"));
		comp2.agregar(new TipoCargoMinEdu("Subdireccion De Contratacion"));
		comp2.agregar(new TipoCargoMinEdu("Subdireccion De Gestion Administrativa"));
		raiz.agregar(comp2);
		
		Composite comp3 = new Composite("Direccion De Calidad Para La Educacion Preescolar Basica Y Media");
		comp3.agregar(new TipoCargoMinEdu("Subdireccion De Referentes Y Evaluacion De La Calidad Educativa"));
		comp3.agregar(new TipoCargoMinEdu("Subdireccion De Fomento De Competencias"));
		comp3.agregar(new TipoCargoMinEdu("Programa Todos A Aprender"));
		comp.agregar(comp3);
		
		Composite comp4 = new Composite("Direccion De Fortalecimineto A La Gestion Territorial");
		comp4.agregar(new TipoCargoMinEdu("Subdireccion De Monitoreo Y Control"));
		comp4.agregar(new TipoCargoMinEdu("Subdireccion De Fortalecimiento Institucional"));
		comp4.agregar(new TipoCargoMinEdu("Subdireccion De Recursos Humanos Del Sector Educativo"));
		comp.agregar(comp4);
		
		Composite comp5 = new Composite("Direccion De Cobertura Y Equidad");
		comp5.agregar(new TipoCargoMinEdu("Subdireccion De Acceso"));
		comp5.agregar(new TipoCargoMinEdu("Subdireccion De Permanencia"));
		comp.agregar(comp5);
		
		Composite comp6 = new Composite("Direccion De Primera Infancia");
		comp6.agregar(new TipoCargoMinEdu("Subdireccion De Cobertura De Primera Infancia"));
		comp6.agregar(new TipoCargoMinEdu("Subdireccion De Calidad De Primera Infancia"));
		comp.agregar(comp6);
		
		Composite comp7 = new Composite("Direccion De La Calidad Para La Educacion Superior");
		comp7.agregar(new TipoCargoMinEdu("Subdireccion De Aseguramiento De La Calidad De La ES"));
		comp7.agregar(new TipoCargoMinEdu("Subdireccion De Inspeccion Y Vigilancia"));
		comp1.agregar(comp7);
		
		Composite comp8 = new Composite("Direccion De Fomento De La Educacion Superior");
		comp8.agregar(new TipoCargoMinEdu("Subdireccion De Apoyo A La Gestion De Las IES"));
		comp8.agregar(new TipoCargoMinEdu("Subdireccion De Desarrollo Sectorial"));
		comp1.agregar(comp8);
		
		System.out.println("Descripcion Del Organigrama");
		System.out.println(" ");
		raiz.mostrar(1);
		
		String aux = " ";
		
		String n = raiz.palabraMasLarga();
		String n1 = comp.palabraMasLarga();
		String n2 = comp1.palabraMasLarga();
		String n3 = comp2.palabraMasLarga();
		String n4 = comp3.palabraMasLarga();
		String n5 = comp4.palabraMasLarga();
		String n6 = comp5.palabraMasLarga();
		String n7 = comp6.palabraMasLarga();
		String n8 = comp7.palabraMasLarga();
		String n9 = comp8.palabraMasLarga();
		
		if(n.length()>aux.length()) {
			aux=n;
		}
		if(n1.length()>aux.length()) {
			aux=n1;
		}
		if(n2.length()>aux.length()) {
			aux=n2;
		}
		if(n3.length()>aux.length()) {
			aux=n3;
		}
		if(n4.length()>aux.length()) {
			aux=n4;
		}
		if(n5.length()>aux.length()) {
			aux=n5;
		}
		if(n6.length()>aux.length()) {
			aux=n6;
		}
		if(n7.length()>aux.length()) {
			aux=n7;
		}
		if(n8.length()>aux.length()) {
			aux=n8;
		}
		if(n9.length()>aux.length()) {
			aux=n9;
		}
		System.out.println(" ");
		System.out.println("El Puesto Con Mas Carateres Del Organigrama Es: "+aux);
	}

}

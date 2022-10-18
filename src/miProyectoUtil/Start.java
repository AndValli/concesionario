package miProyectoUtil;

import java.util.Date;

import miProyectoCoches.Coche;
import miProyectoPersonas.Persona;

public class Start {

	public static void main(String[] args) {
		
		Persona persona = new Persona("andrea", new java.sql.Date(0, 0, 0), "oviedo");
		Coche coche= new Coche(persona);
		coche.setConsumo(2);
		coche.setPuertas(5);
		
		System.out.println(coche);

	}

}

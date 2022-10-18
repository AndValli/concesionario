package miProyectoCoches;

import miProyectoPersonas.Persona;

/**
 * clase que busca establecer el coche q vamos a tener todos
 * @author Andrea
 *
 */
public class Coche {

	private float consumo;
	private int cv;
	private float puertas;
	private Persona propietario;

	/**
	 * este es el constructor de la clase Coche, el unico q hay por ahora
	 * @param propietario la Persona propietaria 
	 */
	public Coche(Persona propietario) {
		super();
		this.propietario = propietario;
	}
	
	/**
	 * devuelve el consumo 
	 * @return el consumo del coche
	 */
	public float getConsumo() {
		return consumo;
	}

	/**
	 * establece el consumo
	 * @param consumo el consumo q queremos grabar del coche
	 */
	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public float getPuertas() {
		return puertas;
	}

	public void setPuertas(float puertas) {
		this.puertas = puertas;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	@Override
	public String toString() {
		return "Coche [consumo=" + consumo + ", cv=" + cv + ", puertas=" + puertas + ", propietario=" + propietario
				+ "]";
	}

	
}

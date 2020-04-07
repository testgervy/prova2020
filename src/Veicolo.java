
/**
 * Classe Veicolo ver 2
 */


public class Veicolo {

	
	private String marca;
	private String tipoGuasto;
	private boolean garanzia;

	
	public Veicolo(String marca, String tipoGuasto, boolean garanzia) {
		this.marca = marca;
		this.tipoGuasto = tipoGuasto;
		this.garanzia = garanzia;
	}

	

	/**
	 * Set the value of marca
	 * 
	 * @param newVar the new value of marca
	 */

	public void setMarca(String newVar) {
		marca = newVar;
	}

	/**
	 * Get the value of marca
	 * 
	 * @return the value of marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Set the value of tipoGuasto
	 * 
	 * @param newVar the new value of tipoGuasto
	 */
	public void setTipoGuasto(String newVar) {
		tipoGuasto = newVar;
	}

	/**
	 * Get the value of tipoGuasto
	 * 
	 * @return the value of tipoGuasto
	 */
	public String getTipoGuasto() {
		return tipoGuasto;
	}

	/**
	 * Set the value of garanzia
	 * 
	 * @param newVar the new value of garanzia
	 */
	public void setGaranzia(boolean newVar) {
		garanzia = newVar;
	}

	/**
	 * Get the value of garanzia
	 * 
	 * @return the value of garanzia
	 */
	public boolean getGaranzia() {
		return garanzia;
	}
	
	
	public String toString() {
		String s= "Veicolo [marca=" + marca + ", tipoGuasto=" + tipoGuasto + ", garanzia=" ;
		if(this.garanzia==true)
			s+="si";
		else
			s+="no";
		s+="]";
		return s;
	}

	
	public static void main(String[] args) {
		Veicolo v=new Veicolo("Audi","motore",true);
		System.out.println(v);
	}

}

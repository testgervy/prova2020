import java.util.*;

/**
 * <h1>Classe Officina</h1>
 * 
 * @author  Pippo Franco
 * 
 * @
 */
 
public class Officina {

	private String citta;
	private int capienzaVeicoli;
	private ArrayList<Veicolo> veicoli;

	public Officina(String citta, int capienzaVeicoli) {
		this.citta = citta;
		this.capienzaVeicoli = capienzaVeicoli;
		veicoli = new ArrayList<Veicolo>();
	}

	
	/**
	 * Set the value of citta
	 * 
	 * @param newVar the new value of citta
	 */

	public void setCitta(String newVar) {
		citta = newVar;
	}

	/**
	 * Get the value of citta
	 * 
	 * @return the value of citta
	 */
	
	
	
	
	public String getCitta() {
		return citta;
	}

	/**
	 * Set the value of capienzaVeicoli
	 * 
	 * @param newVar the new value of capienzaVeicoli
	 */
	public void setCapienzaVeicoli(int newVar) {
		capienzaVeicoli = newVar;
	}

	/**
	 * Get the value of capienzaVeicoli
	 * 
	 * @return the value of capienzaVeicoli
	 */
	public int getCapienzaVeicoli() {
		return capienzaVeicoli;
	}

	//aggiunge un veicolo
	
	/**
	 * aggiunge un veicolo
	 * 
	 * @param 	oggetto veicolo
	 * @return 	esito operazione
	 */
	

	public boolean addVeicolo(Veicolo veicolo) {
		return veicoli.add(veicolo);
	}

	//modifica il guasto del veicolo di posizione pos (se la posizione è corretta)
	
	public boolean modificaGuasto(String tipoGuasto, int pos) {
		if (pos < veicoli.size() && pos >= 0) {
			veicoli.get(pos).setTipoGuasto(tipoGuasto);
			return true;
		}
		return false;
	}

	//elimina il veicolo di posizione pos
	
	public boolean eliminaVeicolo(int pos) {
		return veicoli.remove(veicoli.get(pos));
	}

	//visualizza tutti i veicoli
	
	public String visualizzaVeicoli() {
		String s = "";
		for (int i = 0; i < veicoli.size(); i++)
			s += veicoli.get(i).toString() + "\n";
		return s;
	}

	//visualizza i veicoli in garanzia
	
	public String visualizzaVeicoliGaranzia() {
		String s = "";
		for (int i = 0; i < veicoli.size(); i++)
			if (veicoli.get(i).getGaranzia() == true)
				s += veicoli.get(i).toString() + "\n";
		return s;
	}

	//test di classe
	
	
	public static void main(String[] args) {
		Veicolo v1 = new Veicolo("Audi", "motore", false);
		Veicolo v2 = new Veicolo("BMW", "marmitta", false);
		Veicolo v3 = new Veicolo("Mercedes", "carrozzeria", true);
		Officina o = new Officina("Matino", 20);
		o.addVeicolo(v1);
		o.addVeicolo(v2);
		o.addVeicolo(v3);
		System.out.println("Elenco veicoli: \n" + o.visualizzaVeicoli());
		if (o.modificaGuasto("motore", 2))
			System.out.println("Modifica effettuata\n");
		else
			System.out.println("Posizione incorretta\n");
		System.out.println("Elenco veicoli: \n" + o.visualizzaVeicoli());
		System.out.println("Elenco veicoli in garanzia: \n"+o.visualizzaVeicoliGaranzia());
		if (o.eliminaVeicolo(1) == true)
			System.out.println("Eliminazione effettuata\n");
		else
			System.out.println("Posizione incorretta\n");
		System.out.println("Elenco veicoli: \n" + o.visualizzaVeicoli());
		
	}

}

package Raumschiffe;

/**
 * Diese Klasse modelliert eine Ladung 
 * Fortgeschrittene
 * @author Becker, Krebs
 * @version 01.05.2020
 */

public class Ladung {

	private String bezeichnung;
	private int menge;
		
	//Konstruktor
	
	/** Parameterloser Konstruktor der Klasse Ladung */
	public Ladung() {
		
	}
	
	/**
     * Konstruktor fuer die Klasse Ladung
     * @param bezeichnung der Name der Ladung 
     * @param menge die Menge der Ladung 
     */
    public Ladung(String bezeichnung, int menge){
	   
	    this.bezeichnung = bezeichnung;
	    this.menge = menge;
	}
	
    /**
     * Liefert den Namen einer Ladung zurueck.
     * @return    Name der Ladung
     */
	public String getBezeichnung() {
		return bezeichnung;
	}
	
	/**
     * Setzen des Namens einer neuen Ladung
     * @param bezeichnung  der Name der neue Ladung
     */
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	
	/**
     * Liefert die Menge einer Ladung zurueck.
     * @return    menge der Ladung
     */
	public int getMenge() {
		return menge;
	}
	
	/**
     * Setzen der Menge einer Ladung
     * @param menge  die Menge der Ladung
     */
	public void setMenge(int menge) {
		this.menge = menge;
	}
	
}
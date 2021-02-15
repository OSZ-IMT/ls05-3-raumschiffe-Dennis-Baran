package Raumschiffe;

import java.util.ArrayList;


/**
 * Diese Klasse modelliert einen Raumschiff 
 * Experten
 * @author Becker, Krebs
 * @version 01.05.2020
 */
public class Raumschiff {
	
	// Anfang Attribute
	private int photonentorpedoAnzahl;
	private int energieversorgungInProzent;
	private int schildeInProzent;
	private int huelleInProzent;
	private int lebenserhaltungssystemeInProzent;
	private int androidenAnzahl;
	private String schiffsname;
	public static ArrayList<String> broadcastKommunikator = new ArrayList<String>();
	public ArrayList<Ladung> ladungsverzeichnis = new ArrayList<Ladung>();
	// Ende Attribute

	/** Parameterloser Konstruktor der Klasse Raumschiff */
	public Raumschiff() {

	}

	/** Konstruktor der Klasse Raumschiff, intialisiert alle Attribute
	 * @param photonentorpedoAnzahl die Anzahl von abschussbereite Torpedos im Raumschiff
	 * @param energieversorgungInProzent die Energieversorgung des Raumschiffs in Prozent
	 * @param schildeInProzent Zustand der Schilde des Raumschiffs in Prozent
	 * @param huelleInProzent Zustand der H�lle des Raumschiffs in Prozent
	 * @param lebenserhaltungssystemeInProzent Zustand der Lebenserhaltungssysteme des Raumschiffs in Prozent
	 * @param androidenAnzahl Anzahl der Reparatur Androiden am Board des Raumschiffs
	 * @param schiffsname Name des Raumschiffs
	 * */
	public Raumschiff(int photonentorpedoAnzahl, int energieversorgungInProzent, int schildeInProzent, int huelleInProzent, int lebenserhaltungssystemeInProzent, int androidenAnzahl, String schiffsname){
		this.photonentorpedoAnzahl = photonentorpedoAnzahl;
		this.energieversorgungInProzent = energieversorgungInProzent;
		this.schildeInProzent = schildeInProzent;
		this.huelleInProzent = huelleInProzent;
		this.lebenserhaltungssystemeInProzent = lebenserhaltungssystemeInProzent;
		this.androidenAnzahl = androidenAnzahl;
		this.schiffsname = schiffsname;
	}
	
	
	/** Anfang Verwaltungsmethoden */ 
	
	/**
     * Liefert die Anzahl von abschussbereite Torpedos im Raumschiff
     * @return    photonentorpedoAnzahl  die Anzahl von abschussbereite Torpedos im Raumschiff
     */
	public int getPhotonentorpedoAnzahl() {
		return photonentorpedoAnzahl;
	}

	/**
     * Setzt der Anzahl von abschussbereite Torpedos im Raumschiff
     * @param photonentorpedoAnzahlNeu  die Anzahl von abschussbereite Torpedos im Raumschiff
     */
	public void setPhotonentorpedoAnzahl(int photonentorpedoAnzahlNeu) {
		photonentorpedoAnzahl = photonentorpedoAnzahlNeu;
	}

	/**
     * Liefert den Zustand der Energieversorgung des Raumschiffs in Prozent
     * @return energieversorgungInProzent  der Zustand der Energieversorgung des Raumschiffs in Prozent
     */
	public int getEnergieversorgungInProzent() {
		return energieversorgungInProzent;
	}

	/**
     * Setzt den Zustand der Energieversorgung des Raumschiffs in Prozent
     * @param zustandEnergieversorgungInProzentNeu der Zustand der Energieversorgung des Raumschiffs in Prozent
     */
	public void setEnergieversorgungInProzent(int zustandEnergieversorgungInProzentNeu) {
		energieversorgungInProzent = zustandEnergieversorgungInProzentNeu;
	}

	/**
     * Liefert den Zustand der Schilde des Raumschiffs in Prozent
     * @return schildeInProzent  der Zustand der Schilde des Raumschiffs in Prozent
     */
	public int getSchildeInProzent() {
		return schildeInProzent;
	}

	/**
     * Setzt den Zustand der Schilde des Raumschiffs in Prozent
     * @param zustandSchildeInProzentNeu  der Zustand der Schilde des Raumschiffs in Prozent
     */
	public void setSchildeInProzent(int zustandSchildeInProzentNeu) {
		schildeInProzent = zustandSchildeInProzentNeu;
	}

	/**
     * Liefert den Zustand der H�lle des Raumschiffs in Prozent
     * @return huelleInProzent der Zustand der H�lle des Raumschiffs in Prozent
     */
	public int getHuelleInProzent() {
		return huelleInProzent;
	}

	/**
     * Setzt den Zustand der H�lle des Raumschiffs in Prozent
     * @param zustandHuelleInProzentNeu  der Zustand der H�lle des Raumschiffs in Prozent
     */
	public void setHuelleInProzent(int zustandHuelleInProzentNeu) {
		huelleInProzent = zustandHuelleInProzentNeu;
	}

	/**
     * Liefert den Zustand der Lebenserhaltungssysteme des Raumschiffs in Prozent
     * @return lebenserhaltungssystemeInProzent  der Zustand der Lebenserhaltungssysteme des Raumschiffs in Prozent
     */
	public int getLebenserhaltungssystemeInProzent() {
		return lebenserhaltungssystemeInProzent;
	}

	/**
     * Setzt den Zustand der Lebenserhaltungssysteme des Raumschiffs in Prozent
     * @param zustandLebenserhaltungssystemeInProzentNeu  der Zustand der Lebenserhaltungssysteme des Raumschiffs in Prozent
     */
	public void setLebenserhaltungssystemeInProzent(int zustandLebenserhaltungssystemeInProzentNeu) {
		lebenserhaltungssystemeInProzent = zustandLebenserhaltungssystemeInProzentNeu;
	}

	/**
     * Liefert den Name des Raumschiffs
     * @return schiffsname  der Name des Raumschiffs
     */
	public String getSchiffsname() {
		return schiffsname;
	}

	/**
     * Setzt den Name des Raumschiffs
     * @param schiffsnameNeu  der Name des Raumschiffs
     */
	public void setSchiffsname(String schiffsnameNeu) {
		schiffsname = schiffsnameNeu;
	}

	/**
     * Liefert die Anzahl der Reparatur Androiden am Board des Raumschiffs
     * @return androidenAnzahl  Anzahl der Reparatur Androiden am Board des Raumschiffs
     */
	public int getAndroidenAnzahl() {
		return androidenAnzahl;
	}

	/**
     * Setzt die Anzahl der Reparatur Androiden am Board des Raumschiffs
     * @param androidenAnzahl  die Anzahl der Reparatur Androiden am Board des Raumschiffs
     */
	public void setAndroidenAnzahl(int androidenAnzahl) {
		this.androidenAnzahl = androidenAnzahl;

	}
	/** Ende Verwaltungsmethoden */

	/** Anfang Methoden */
	
	/**	
	 * Es gibt die M�glichkeit das Raumschiff mit einer Ladung zu beladen. 
	 * Die Methode bekommt die aufzuladende Ladung �bergeben.  
	 * Effekt.: Die Ladung wird der ArrayListe ladungsverzeichnis hinzugef�gt. 
	 * @param neueLadung  im Raumschiff zu beladende Ladung
	 */
	public void addLadung(Ladung neueLadung) {
		ladungsverzeichnis.add(neueLadung);
	}

	/** 
	 * Das Raumschiff kann Photonentorpedos abschie�en.
	 * Die Methode bekommt ein Raumschiff �bergeben, dass das Ziel des Torpedos ist.
	 * Falls die Anzahl von abschussbereite Torpedos im Raumschiff gleich 0 ist,
	 * dann wird die Methode nachrichtAnAlle() mit der Nachricht "-=*Click*=-" aufgerufen.
	 * Andernfalls wird die Anzahl der Photonentorpedos um eins dekrementiert,
	 * die eigene Methode nachrichtAnAlle() mit der Nachricht "Photonentorpedo abgeschossen" als Argument aufgerufen und
	 * die eigene Methode treffer() mit dem �bergebenen Raumschiff als Argument aufgerufen.
	 * @param r  Raumschiff das mit Photonentorpedos abgeschossen wird.
	 */
	public void photonentorpedoSchiessen(Raumschiff r){
		if (photonentorpedoAnzahl == 0)
			nachrichtAnAlle("-=*Click*=-");
		else
		{
			photonentorpedoAnzahl--;
			nachrichtAnAlle("Photonentorpedo abgeschossen");
			treffer(r);
		}
	}

	/**
	 * Das Raumschiff kann Phaserkanonen abzuschie�en. 
	 * Die Methode bekommt ein Raumschiff �bergeben, dass das Ziel der Phaserkanone ist.
	 * Falls die Energieversorgung im Raumschiff unter 50 Prozent liegt,
	 * dann wird die Methode nachrichtAnAlle() mit der Nachricht "-=*Click*=-" aufgerufen.
	 * Andernfalls wird die Energieversorgung des Raumschiffs um 50 Prozent reduziert,
	 * die eigene Methode nachrichtAnAlle() mit der Nachricht "Phaserkanone abgeschossen" als Argument aufgerufen und
	 * die eigene Methode treffer() mit dem �bergebenen Raumschiff als Argument aufgerufen.
	 * @param r  Raumschiff das mit den Phaserkanonen abgeschossen wird.
	 */
	public void phaserkanoneSchiessen(Raumschiff r){
		if (energieversorgungInProzent < 50)
			nachrichtAnAlle("-=*Click*=-");
		else
		{
			energieversorgungInProzent -= 50;
			nachrichtAnAlle("Phaserkanone abgeschossen");
			treffer(r);
		}
	}

	/**
	 * Ein Raumschiff kann von verschiedenen Waffen getroffen werden. 
	 * Dabei wird eine nicht �ffentliche Methode aufgerufen, 
	 * die vermerkt, ob das Raumschiff getroffen wird und 
	 * das Ausma� des Treffers berechnet. 
	 * Die Schilde des getroffenen Raumschiffs werden um 50% geschw�cht.
	 * Sollte anschlie�end die Schilde vollst�ndig zerst�rt worden sein, 
	 * in dem der Zustand der Schilde in Prozent unter Null liegt,
	 * so wird der Zustand der H�lle und der Energieversorgung jeweils um 50% abgebaut.
	 * Sollte danach der Zustand der H�lle auf oder unter 0% absinken, 
	 * so sind die Lebenserhaltungssysteme vollst�ndig zerst�rt und werden auf 0 gesetzt.
	 * Die eigene Methode nachrichtAnAlle() wird mit der Nachricht 
	 * "Alle Lebenserhaltssysteme abgeschaltet." als Argument aufgerufen.
	 * @param r  Raumschiff das getroffen wurde
	 */
	private void treffer(Raumschiff r) {
		r.schildeInProzent -= 50;
		if (r.schildeInProzent <= 0)
		{
			r.huelleInProzent -= 50;
			r.energieversorgungInProzent -= 50;
		}

		if (r.huelleInProzent <= 0)
		{
			r.lebenserhaltungssystemeInProzent = 0;
			r.nachrichtAnAlle("Alle Lebenserhaltssysteme abgeschaltet.");
		}
	}
	
	/**
	 * Es k�nnen von einem Raumschiff Nachrichten an Alle gesendet werden. 
	 * Daf�r muss die Nachricht selbst an die Methode �bergeben werden. 
	 * Diese Methode ist von �berall aufrufbar.
	 * Effekt.: Die �bergebene Nachricht wird der ArrayListe broadcastKommunikator hinzugef�gt
	 * @param message  Nachricht, die an Alle gesendet wird.
	 */
	public void nachrichtAnAlle(String message){
		broadcastKommunikator.add(this.schiffsname + ": " + message);
	}

	/**
	 * Die Klasse Raumschiff hat eine �ffentliche, 
	 * statische Methode, die alle Eintr�ge des Logbuchs 
	 * aller Raumschiffe in Form einer Liste zur�ckgibt. 	
	 * @return broadcastKommunikator  der broadcastKommunikator 
	 * (ArrayList mit alle Nachrichten aller Raumschiffe) wird zur�ckgegeben.
	 */
	public static ArrayList<String> eintraegeLogbuchZurueckgeben(){
		return broadcastKommunikator; 
	}
	
	/**
	 * Sollte als Ladung �Photonentorpedos� vorhanden sein, 
	 * so k�nnen diese in die Torpedorohre des Raumschiffs geladen werden. 
	 * Die �ffentliche Methode bekommt die Anzahl der Torpedos als Parameter �bergeben.
	 * Gibt es keine Ladung �Photonentorpedo� auf dem Schiff, 
	 * wird als Nachricht "Keine Photonentorpedos gefunden!" in der Konsole ausgegeben 
	 * und die Nachricht an alle �-=*Click*=-� ausgegeben.
	 * Ist die Anzahl der einzusetzenden Photonentorpedos gr��er als 
	 * die Menge der tats�chlich Vorhandenen, so werden alle vorhandenen Photonentorpedos eingesetzt. 
	 * Ansonsten wird die Ladungsmenge �Photonentorpedos� �ber die Setter Methode vermindert 
	 * und die Anzahl der Photonentorpedo im Raumschiff erh�ht.
	 * Konnten Photonentorpedos eingesetzt werden, 
	 * so wird die Meldung �[X] Photonentorpedos eingesetzt� auf der Konsole ausgegeben.
	 * @param anzahlTorpedos  Anzahl der Torpedos, die in die Torpedorohre des Raumschiffs geladen werden sollen.
	 */
	public void photonentorpedosEinsetzen(int anzahlTorpedos) {
		String ladungsbezeichnung = " "; 
		int menge = 0;
		boolean PhotonentorpedosGefunden = false;
		for(Ladung temp : ladungsverzeichnis) {
			ladungsbezeichnung = temp.getBezeichnung();
			menge = temp.getMenge();
			if(ladungsbezeichnung.equals("Photonentorpedos")){
		        PhotonentorpedosGefunden = true;
		        if(anzahlTorpedos >= menge) {
		          System.out.println(menge + "Photonentorpedo(s) eingesetzt.");
		          this.setPhotonentorpedoAnzahl(this.getPhotonentorpedoAnzahl() + menge);
		          temp.setMenge(0); 
		        }
		        else {  
		          System.out.println(anzahlTorpedos + "Photonentorpedo(s) eingesetzt.");
		          this.setPhotonentorpedoAnzahl(this.getPhotonentorpedoAnzahl() + anzahlTorpedos);
		          temp.setMenge(menge - anzahlTorpedos); 
		        }
		      } 
		    }
		    if(!PhotonentorpedosGefunden){
		        System.out.println("Keine Photonentorpedos gefunden!");
		        nachrichtAnAlle("-=*Click*=-");         
		    }
	}
	
	/**
	 * Ein Reparaturauftrag f�r Schilde, H�lle oder Energieversorgung 
	 * an ein oder mehreren Reparatur-Androiden senden. 
	 * Die Methode bekommt drei boolesche Werte f�r Schutzschilde, Energieversorgung
	 * und Schiffsh�lle �bergeben sowie die Anzahl der einzusetztzenden Androiden. 
	 * Die Methode entscheidet anhand der �bergebenen Parameter, 
	 * welche Schiffsstrukturen repariert werden sollen.
	 * Es wird eine Zufallszahl zwischen 0 - 100 erzeugt, 
	 * welche f�r die Berechnung der Reparatur ben�tigt wird.
	 * Ist die �bergebene Anzahl von Androiden gr��er als die vorhandene Anzahl
	 * von Androiden im Raumschiff, dann wird die vorhandene Anzahl von Androiden eingesetzt.
	 * Die Prozentuale Berechnung der reparierten Schiffsstrukturen
	 * wird berechnet, in dem die erzeugte Zufallszahl mit der Anzahl der Androiden multipliziert
	 * wird und das Ergebnis durch die Anzahl der auf true gesetzten Strukturen dividiert wird.
	 * Das Ergebnis dieser Division wird den auf true gesetzten Schiffsstrukturen hinzugef�gt.
	 * @param schutzschilde  falls true wird der Schutzschild repariert, sonst nicht
	 * @param energieversorgung   falls true wird die Energieversorgung repariert, sonst nicht  
	 * @param schiffshuelle   falls true wird die Schiffsh�lle repariert, sonst nicht
	 * @param anzahlAndroiden   Anzahl der Androiden f�r die Reparatur der Strukturen des Raumschiffs
	 */
	public void reparaturDurchfuehren(boolean schutzschilde, boolean energieversorgung, boolean schiffshuelle, int anzahlAndroiden) {
		double zufallszahl, prozentualeBerechnungReparatur;
		int anzahlStrukturen = 0;
		int aktuelleAnzahlAndroiden = this.getAndroidenAnzahl();
		zufallszahl = Math.random() * 100;
		//System.out.println((int) zufallszahl);
		if(schutzschilde) 
			anzahlStrukturen++;
		if(energieversorgung)
			anzahlStrukturen++;
		if(schiffshuelle)
			anzahlStrukturen++;
		
		//System.out.println("Anzahl Reparaturandroiden: " + anzahlAndroiden);
		
		if(anzahlAndroiden > aktuelleAnzahlAndroiden) {
			anzahlAndroiden = aktuelleAnzahlAndroiden;
		}
		
		//System.out.println("Tats�chlich Anzahl Reparaturandroiden: " + anzahlAndroiden);
		
		//System.out.println("Anzahl der auf true gesetzte Strukturen: " + anzahlStrukturen);
		
		prozentualeBerechnungReparatur = (zufallszahl * anzahlAndroiden)/anzahlStrukturen;
		
		//System.out.println("Prozentuale Berechnung der reparierten Schiffsstrukturen: " + prozentualeBerechnungReparatur);
		if(schutzschilde) 
			this.setSchildeInProzent(this.getSchildeInProzent() + (int) prozentualeBerechnungReparatur);
		if(energieversorgung)
			this.setEnergieversorgungInProzent(this.getEnergieversorgungInProzent() + (int) prozentualeBerechnungReparatur);
		if(schiffshuelle)
			this.setHuelleInProzent(this.getHuelleInProzent() + (int) prozentualeBerechnungReparatur);
	}
	
	/**
	 * Alle Zust�nde (Attributwerte) des Raumschiffes werden
	 * auf der Konsole mit entsprechenden Namen ausgeben.
	 */	
	public void zustandRaumschiff() {
		System.out.println("Zustand des Raumschiffes " + this.getSchiffsname() + ":");
		System.out.println("Anzahl der Photonentorpedos: " + this.getPhotonentorpedoAnzahl() + 
				"\nZustand der Energieversorgung: " + this.getEnergieversorgungInProzent() +
				"\nZustand der Schilde: " + this.getSchildeInProzent() +
				"\nZustand der H�lle: " + this.getHuelleInProzent() +
				"\nZustand der Leebenserhaltungssysteme: " + this.getLebenserhaltungssystemeInProzent() +
				"\nAnzahl der Androiden: " + this.getAndroidenAnzahl());
	}

	/**
	 * Alle Ladungen eines Raumschiffes werden auf der Konsole 
	 * mit Ladungsbezeichnung und Menge ausgeben.
	 */
	public void ladungsverzeichnisAusgeben() {
		System.out.println("Der Raumschiff " + this.schiffsname + " hat folgende Ladung: ");
		for(Ladung temp : ladungsverzeichnis) {
			System.out.println(temp.getBezeichnung() + " " + temp.getMenge());
		}		
	}

	/**
	 * Das Ladungsverzeichnis wird durchsucht. 
	 * Wenn die Menge einer Ladung 0 ist, dann wird 
	 * dieses Objekt Ladung aus der Liste entfernt.
	 * Die Nachricht "Die Ladung von [Ladungsbezeichnung] wurde aus dem Verzeichnis entfernt."
	 * wird in der Konsole ausgegeben.
	 */
	public void ladungsverzeichnisAufraeumen() {
		String ladungsbezeichnung = " "; 
		int menge = 0;
		for(int i = 0; i < ladungsverzeichnis.size(); i++) {
			ladungsbezeichnung = ladungsverzeichnis.get(i).getBezeichnung();
			menge = ladungsverzeichnis.get(i).getMenge();
			if(menge == 0){
				ladungsverzeichnis.remove(i);
				i--;
				System.out.println("Die Ladung von " + ladungsbezeichnung + " wurde aus dem Verzeichnis entfernt.");
			}
		}
	}
	
	// Ende Methoden

}


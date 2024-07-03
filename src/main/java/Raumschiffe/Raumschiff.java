import java.util.ArrayList;


public class Raumschiff {

	// Anfang Attribute

	private int photonentorpedoAnzahl;
	private int energieversorgungInProzent;
	private int schildeInProzent;
	private int huelleInProzent;
	private int lebenserhaltungssystemeInProzent;
	private int androidenAnzahl;

	private String schiffsname;
	private ArrayList<Ladung> ladungsverzeichnis = new ArrayList<Ladung>();
	

	//Konstruktoren
	
	public Raumschiff() {

	}

	public Raumschiff(int photonentorpedoAnzahl, int energieversorgungInProzent, int schildeInProzent,
			int huelleInProzent, int lebenserhaltungssystemeInProzent, int androidenAnzahl, String schiffsname) {
		this.photonentorpedoAnzahl = photonentorpedoAnzahl;
		this.energieversorgungInProzent = energieversorgungInProzent;
		this.schildeInProzent = schildeInProzent;
		this.huelleInProzent = huelleInProzent;
		this.lebenserhaltungssystemeInProzent = lebenserhaltungssystemeInProzent;
		this.androidenAnzahl = androidenAnzahl;
		this.schiffsname = schiffsname;
	}

	
	//Verwaltungsmethoden
	public int getPhotonentorpedoAnzahl() {
		return photonentorpedoAnzahl;
	}

	
	public void setPhotonentorpedoAnzahl(int photonentorpedoAnzahlNeu) {
		photonentorpedoAnzahl = photonentorpedoAnzahlNeu;
	}

	
	public int getEnergieversorgungInProzent() {
		return energieversorgungInProzent;
	}

	
	public void setEnergieversorgungInProzent(int zustandEnergieversorgungInProzentNeu) {
		energieversorgungInProzent = zustandEnergieversorgungInProzentNeu;
	}

	
	public int getSchildeInProzent() {
		return schildeInProzent;
	}

	
	public void setSchildeInProzent(int zustandSchildeInProzentNeu) {
		schildeInProzent = zustandSchildeInProzentNeu;
	}


	public int getHuelleInProzent() {
		return huelleInProzent;
	}


	public void setHuelleInProzent(int zustandHuelleInProzentNeu) {
		huelleInProzent = zustandHuelleInProzentNeu;
	}


	public int getLebenserhaltungssystemeInProzent() {
		return lebenserhaltungssystemeInProzent;
	}


	public void setLebenserhaltungssystemeInProzent(int zustandLebenserhaltungssystemeInProzentNeu) {
		lebenserhaltungssystemeInProzent = zustandLebenserhaltungssystemeInProzentNeu;
	}


	public String getSchiffsname() {
		return schiffsname;
	}


	public void setSchiffsname(String schiffsnameNeu) {
		schiffsname = schiffsnameNeu;
	}


	public int getAndroidenAnzahl() {
		return androidenAnzahl;
	}


	public void setAndroidenAnzahl(int androidenAnzahl) {
		this.androidenAnzahl = androidenAnzahl;

	}

	

	/* Anfang Methoden */


	public void addLadung(Ladung neueLadung) {
		ladungsverzeichnis.add(neueLadung);
	}


	public void photonentorpedoSchiessen(Raumschiff r) {
		
	}

	
	public void phaserkanoneSchiessen(Raumschiff r) {
		
	}


	public void nachrichtAnAlle(String message) {
		
	}


	private void treffer(Raumschiff r) {
		
	}


	public void zustandRaumschiff() {
		
	}


	public void ladungsverzeichnisAusgeben() {

	}

	// Ende Methoden

}
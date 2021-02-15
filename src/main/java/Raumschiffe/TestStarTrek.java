package Raumschiffe;

public class TestStarTrek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	    //Arbeitsaufgabe 5
	    
	    System.out.println("Arbeitsaufgabe 5: ");
	    
	    Raumschiff k = new Raumschiff(1, 100, 100, 100, 100, 2, "IKS Hegh'ta");
	    Raumschiff r = new Raumschiff(2, 100, 100, 100, 100, 2, "IRW Khazara");
	    Raumschiff v = new Raumschiff(0, 80, 80, 50, 100, 5, "Ni'Var");
	    
	    Ladung ladungK1 = new Ladung("Ferengi Schneckensaft", 200);
	    Ladung ladungK2 = new Ladung("Bat'leth Klingonen Schwert", 200);
	    Ladung ladungR1 = new Ladung("Borg-Schrott", 5);  
	    Ladung ladungR2 = new Ladung("Rote Materie", 2); 
	    Ladung ladungR3 = new Ladung("Plasma-Waffe", 50);
	    Ladung ladungV1 = new Ladung("Forschungssonde", 35);
	    Ladung ladungV2 = new Ladung("Photonentorpedo", 3);
	    
	    k.addLadung(ladungK1);
	    k.addLadung(ladungK2);
	    
	    r.addLadung(ladungR1);
	    r.addLadung(ladungR2);
	    r.addLadung(ladungR3);
	    
	    v.addLadung(ladungV1);
	    v.addLadung(ladungV2);
	    
	    k.photonentorpedoSchiessen(r);
	    r.phaserkanoneSchiessen(k);
	    
	    v.nachrichtAnAlle("Gewalt ist nicht logisch. ");
	    
	    k.zustandRaumschiff();
	    k.ladungsverzeichnisAusgeben();
	    
	    k.photonentorpedoSchiessen(r);
	    k.photonentorpedoSchiessen(r);
	    
	    k.zustandRaumschiff();
	    k.ladungsverzeichnisAusgeben();
	    
	    r.zustandRaumschiff();
	    r.ladungsverzeichnisAusgeben();
	   	       
	    v.zustandRaumschiff();
	    v.ladungsverzeichnisAusgeben();
	    
	}

}

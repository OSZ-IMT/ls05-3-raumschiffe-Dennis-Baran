import Raumschiffe.Raumschiff;
import org.junit.jupiter.api.Test;

public class TestPhotonentorpedo extends TestBase{

    @Test
    void photonentorpedoSchiessenEmpty(){

        //prepare
        Raumschiff r = getRaumschiff();
        r.setPhotonentorpedoAnzahl(0);
        Raumschiff r2 = getRaumschiff();

        r.photonentorpedoSchiessen(r2);

        checkBroadcast(CLICK);
    }

    @Test
    void photonentorpedoSchiessenTwo(){

        //prepare
        Raumschiff r = getRaumschiff();
        Raumschiff r2 = getRaumschiff();

        r.photonentorpedoSchiessen(r2);

        checkBroadcast("Photonentorpedo abgeschossen");
    }
}

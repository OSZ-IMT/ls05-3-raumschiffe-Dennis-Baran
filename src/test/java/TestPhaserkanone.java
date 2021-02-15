import Raumschiffe.Raumschiff;
import org.junit.jupiter.api.Test;

public class TestPhaserkanone extends TestBase{

    @Test
    void phaserkanoneSchiessen(){

        //prepare
        Raumschiff r = getRaumschiff();
        r.setEnergieversorgungInProzent(20);
        Raumschiff r2 = getRaumschiff();

        r.phaserkanoneSchiessen(r2);

        checkBroadcast(CLICK);
    }

    @Test
    void phaserkanoneSchiessenTwo(){

        //prepare
        Raumschiff r = getRaumschiff();
        Raumschiff r2 = getRaumschiff();

        r.phaserkanoneSchiessen(r2);

        checkBroadcast("Phaserkanone abgeschossen");
    }
}

import Raumschiffe.Raumschiff;
import org.junit.jupiter.api.Test;

public class TestTreffer extends TestBase{

    @Test
    void trefferNot(){

        //prepare
        Raumschiff r = getRaumschiff();
        Raumschiff r2 = getRaumschiff();
        r2.setSchiffsname("TestTestTest");

        r.phaserkanoneSchiessen(r2);

        if (isBeginner())
            checkBroadcast("TestTestTest wurde getroffen!");
        else
            checkNotBroadcast("Alle Lebenserhaltssysteme abgeschaltet.");
    }

    @Test
    void treffer(){

        //prepare
        Raumschiff r = getRaumschiff();
        Raumschiff r2 = getRaumschiff();
        r2.setSchiffsname("TestTestTest");
        r2.setSchildeInProzent(20);
        r2.setHuelleInProzent(20);
        r2.setEnergieversorgungInProzent(20);

        r.phaserkanoneSchiessen(r2);

        if (isBeginner())
            checkBroadcast("TestTestTest wurde getroffen!");
        else
            checkBroadcast("Alle Lebenserhaltssysteme abgeschaltet.");
    }
}

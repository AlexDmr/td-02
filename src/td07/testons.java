package td07;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testons {
    @Test
    public void ComplexeParDéfaut() {
        Complexe c = new Complexe();
        assertEquals(0.0, c.getReel(), 0.0);
        assertEquals(0.0, c.getImaginaire(), 0.0);
        assertEquals(0.0, c.getModule(), 0.0);
        assertEquals(0.0, c.getAngle(), 0.0);
    }

    @Test
    public void testDuSujet() {
        Complexe c = new Complexe();
        c.setImaginaire(5.0);
        c.getAngle();
        c.setAngle( - Math.PI / 2 ); // on ajoute -pi /2
        c.multiplieReel(2.0);

        // Assertions ?
    }
}

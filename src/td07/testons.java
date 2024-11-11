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
    public void testAvecInit_valeur_i() {
        Complexe c = new Complexe(0, 1);
        assertEquals(0.0, c.getReel(), 0.0);
        assertEquals(1.0, c.getImaginaire(), 0.0);
        assertEquals(1.0, c.getModule(), 0.0);
        assertEquals(Math.PI / 2, c.getAngle(), 0.0);

        c.setReel(1);
        assertEquals(1, c.getReel(), 0.0);
        assertEquals(1, c.getImaginaire(), 0.0);
        assertEquals(Math.sqrt(2), c.getModule(), 0.0);
        assertEquals(Math.PI / 4, c.getAngle(), 0.0);

        c.setModule(1);
        assertEquals(Math.sqrt(2) / 2, c.getReel(), 0.0);
        assertEquals(Math.sqrt(2) / 2, c.getImaginaire(), 0.0000001);
        assertEquals(Math.sqrt(1), c.getModule(), 0.0);
        assertEquals(Math.PI / 4, c.getAngle(), 0.0);
    }

    @Test
    public void problemPolaire_1() {
        Complexe c = new Complexe();
        c.setModule(-1); // Problème, le module ne peut pas être négatif
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

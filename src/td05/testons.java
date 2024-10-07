package td05;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testons {

    @Test
    public void UnSeulEntier() {
        Analyseur A = new Analyseur();
        assertEquals(12, A.eval("12"));
    }

    @Test
    public void UnSeulOperateur() {
        Analyseur A = new Analyseur();
        assertEquals(3, A.eval("1 2 +"));
    }

    @Test
    public void DeuxOperateurs() {
        Analyseur A = new Analyseur();
        assertEquals(5, A.eval("1 2 + 2 +"));
    }

    @Test
    public void TroisOperateurs() {
        Analyseur A = new Analyseur();
        assertEquals(15, A.eval("3 4 1 2 + * +"));
    }

}

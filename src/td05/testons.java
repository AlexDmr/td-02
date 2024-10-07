package td05;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Optional;

public class testons {

    @Test
    public void UnSeulEntier() {
        Analyseur A = new Analyseur();
        assertEquals(Optional.of(12), A.eval("12"));
    }

    @Test
    public void UnSeulOperateur() {
        Analyseur A = new Analyseur();
        assertEquals(Optional.of(3), A.eval("1 2 +"));
    }

    @Test
    public void DeuxOperateurs() {
        Analyseur A = new Analyseur();
        assertEquals(Optional.of(5), A.eval("1 2 + 2 +"));
    }

    @Test
    public void TroisOperateurs() {
        Analyseur A = new Analyseur();
        assertEquals(Optional.of(15), A.eval("3 4 1 2 + * +"));
    }

    @Test
    public void DivisionPar0() {
        Analyseur A = new Analyseur();
        assertEquals(Optional.empty(), A.eval("1 0 /"));
    }

    @Test
    public void OperateurInconnu() {
        Analyseur A = new Analyseur();
        assertEquals(Optional.empty(), A.eval("1 2 ?"));
    }

    @Test
    public void entierMalFormé() {
        Analyseur A = new Analyseur();
        assertEquals(Optional.empty(), A.eval("1 22xy3 +"));
    }

    // Ce test ne passe pas, l'expression est mal formée, ça devrait renvoyer empty
    // Revoyez la méthode eval de Analyseur pour comprendre pourquoi et corriger
    @Test
    public void expressionMalFormée() {
        Analyseur A = new Analyseur();
        assertEquals(Optional.empty(), A.eval("1 2 + 3"));
    }
}

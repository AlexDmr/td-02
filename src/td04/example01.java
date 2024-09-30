package td04;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class example01 {

  @Test
  public void entrepotVide() {
    Entrepot entrepotVide = new Entrepot(new Caisse[0][0]);
    assertEquals(0, entrepotVide.poidTotal());
  }
  @Test
  public void entrepotUnePile() {
    Caisse c1 = new Caisse(1, "1", "caisse 1");
    Caisse c2 = new Caisse(2, "2", "caisse 2");
    Caisse c3 = new Caisse(3, "3", "caisse 3");

    Caisse[][] emplacements = {
      {c1, c2, c3}
    };

    Entrepot entrepot = new Entrepot(emplacements);

    assertEquals(6, entrepot.poidTotal());
  }
}
package td07;

/**
 * Classe représentant un trinôme complexe, immuable.
 */
public class TrinomeComplexe {
    final double a;
    final double b;
    final double c;
    final double delta;

    TrinomeComplexe(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = b * b - 4 * a * c;
    }

    /**
     * Nombre de racines réelles
     */
    int nbRacinesRéelles() {
        int nb;
        if (delta > 0) {
            nb = 2;
        } else if (delta == 0) {
            nb = 1;
        } else {
            nb = 0;
        }
        return nb;
    }

    Complexe getRacine1() {
        // à compléter
        return null;
    }

    Complexe getRacine2() {
        // à compléter
        return null;
    }
    
}

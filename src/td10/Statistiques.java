package td10;

import java.util.ArrayList;

public class Statistiques<T extends Evaluable> {
    private ArrayList<T> A;

    Statistiques(ArrayList<T> A) {
        this.A = A;
    }

    public T min() {
        T m = null;

        if (!A.isEmpty()) {
            m = A.get(0);
            for (int i = 1; i < A.size(); i++) {
                T e = A.get(i);
                if (e.valeur() < m.valeur()) {
                    m = e;
                }
            }
        }

        
        return m;
        // OU en style fonctionnel :
        // A.stream().min( (a, b) -> a.valeur() <  b.valeur() ? 1 : -1 );
    }

    public double moyenne() {
        double somme = 0;

        for (T e : A) {
            somme += e.valeur();
        }

        double moy;

        if (A.size() > 0) {
            moy = somme / A.size();
        } else {
            moy = 0;
        }

        return moy;
    }
}

package td03;

public class td03 {

    /**
     * Longueur de la plus longue sous séquence strictement croissante.
     * @param L
     * @return
     */
    public static int length_pgssOK(int[] L) {
        if (L.length <= 1) {
            return L.length;
        }

        // La longueur de la plus longue sous séquence
        // strictement croissante jusqu'à maintenant
        int max = 1;

        // Le compteur de 
        // la sous-séquence strictement croisasante actuelle
        int nb = 1;

        for (int i = 0; i < L.length - 1; i++) {
            if (L[i] < L[i + 1]) {
                // La sous séquence strictement croissante actuelle
                // a un élément de plus
                nb++;
                if (nb > max) {
                    max = nb;
                }
            } else {
                // Je passe à une autre sous séquence strictement croissante
                nb = 1;
            }
        }

        return max;
    }

    public static int length_pgss(int[] L) {
        if (L.length == 0)
            return 0;

        int nb = 1;
        int res = 0;

        for (int i = 0; i < L.length - 1; i++) {
            if (L[i + 1] > L[i]) {
                nb++;
            } else {
                res = nb;
                nb = 1;
            }
        }

        return nb > res ? nb : res;
    }


    public static int nb_pgssPb1(int[] L) {
        if (L.length <= 1)
            return L.length;

        int nb = 0;
        
        for (int i = 1; i < L.length; i++) {
            if (L[i - 1] >= L[i]) {
                nb += 1;
            }
        }

        return nb;
    }

    public static int nb_pgss(int[] L) {
        if (L.length <= 1)
            return L.length;

        int nb = 1;
        int i = 0;

        while (i < L.length - 1) {
            if (L[i] >= L[i + 1]) {
                nb += 1;
            }
            i += 1;
        }

        return nb;
    }

    public static int nb_pgssPb0(int[] L) {
        if (L.length == 0)
            return 0;
        if (L.length == 1)
            return 1;

        int compteur = 0;
        for (int i = 0; i <= L.length; i++) {
            if (L[i] > L[i + 1]) {
                compteur += 1;
            }
        }
        compteur += 1;

        return compteur;
    }
}

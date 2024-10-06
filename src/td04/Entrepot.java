package td04;

public class Entrepot {
    Caisse[][] emplacements;
    
    Position oùEstCaisse(String id) {
        return null;
    }

    /**
     * Renvoie la somme des poids des caisses de chaque emplacement
     */
    int[] poidsDesPiles() {
        int[] poids = new int[emplacements.length];

        for (int i = 0; i < emplacements.length; i++) {
            poids[i] = 0;
            for (int j = 0; j < emplacements[i].length; j++) {
                poids[i] += emplacements[i][j].poids;
            }
        }

        return poids;
    }

    /**
     * La somme de toutes les caisses
     * = La somme de toutes les piles
     */
    int poidTotal() {
        int poids = 0;

        for (int p : poidsDesPiles()) {
            poids += p;
        }

        return poids;
    }

    Position[] listerProblemes() {
        return null;
    }

    public Entrepot(Caisse[][] emplacements) {
        this.emplacements = emplacements;
    }
}

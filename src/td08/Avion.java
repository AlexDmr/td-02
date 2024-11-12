package td08;

public class Avion extends Vehicule {
    private int nbMoteurs;

    public Avion(double vitesse, int nbPassagers, int nbMoteurs) {
        super(vitesse, nbPassagers);
        this.setNbMoteurs(nbMoteurs);
    }

    public int getNbMoteurs() {
        return nbMoteurs;
    }

    public void setNbMoteurs(int nbMoteurs) {
        this.nbMoteurs = Math.max(1, Math.min(8, nbMoteurs));
    }

    @Override
    public void setVitesse(double v) {
        super.setVitesse(Math.max(0, Math.min(1000, v)));
    }
    
    @Override
    public void setNbPassagers(int n) {
        super.setNbPassagers(Math.max(5, Math.min(200, n)));
    }
    
    @Override
    public String toString() {
        return super.toString() + " Avion: [vitesse:" + getVitesse() + "km/h, "
             + getNbPassagers() + " passagers, "
             + getNbMoteurs() + " moteurs]";
    }
}

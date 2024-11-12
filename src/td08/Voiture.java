package td08;

public class Voiture extends Vehicule {
    private int nbPortières;

    public Voiture(double vitesse, int nbPassagers, int nbPortières) {
        super(vitesse, nbPassagers);
    }

    public int getNbPortières() {
        return nbPortières;
    }

    public void setNbPortières(int nbPortières) {
        this.nbPortières = Math.max(1, Math.min(5, nbPortières));
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
        return "Voiture: [vitesse:" 
             + getVitesse() + "km/h, " 
             + getNbPassagers() + " passagers" 
             + getNbPortières() + "portières]";
    }
}

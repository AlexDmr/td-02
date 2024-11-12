package td08;

public class Vehicule {
    private double vitesse;
    private int nbPassagers;

    public Vehicule(double vitesse, int nbPassagers) {
        this.setNbPassagers(nbPassagers);
        this.setVitesse(vitesse);
    }

    public double getVitesse() {
        return vitesse;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = Math.max(0.0, vitesse);
    }

    public int getNbPassagers() {
        return nbPassagers;
    }

    public void setNbPassagers(int nbPassagers) {
        this.nbPassagers = Math.max(1, nbPassagers);
    }

    @Override
    public String toString() {
        return "Véhicule: [vitesse:" + getVitesse() + "km/h, " + getNbPassagers() + " passagers]";
    }

}

package td09;

public abstract class PokemonMarin extends Pokemon {
    private int nbNageoires;

    PokemonMarin(String nom, double poids, int nbNageoires) {
        super(nom, poids);
        this.nbNageoires = Math.abs(nbNageoires);
    }

    public int getNbNageoires() {
        return nbNageoires;
    }

    @Override
    public String toString() {
        return super.toString() + ", ma vitesse est de " + getVitesse() + " km/h j’ai " + getNbNageoires() + " nageoires";
    }
}

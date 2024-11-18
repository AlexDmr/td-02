package td09;

public abstract class PokemonTerrestre extends Pokemon {
    private int nbPattes;
    private double taille;

    PokemonTerrestre(String nom, double poids, int nbPattes, double taille) {
        super(nom, poids);
        this.nbPattes = Math.abs(nbPattes);
        this.taille = Math.abs(taille);
    }

    public int getNbPattes() {
        return nbPattes;
    }

    public double getTaille() {
        return taille;
    }

    @Override
    public double getVitesse() {
        return getNbPattes() * getTaille() * 3;
    }
    
    @Override
    public String toString() {
        return super.toString() + " avec " + getNbPattes() + " pattes et une taille de " + getTaille() + " mètres";
    }
}

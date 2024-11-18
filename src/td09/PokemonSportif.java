package td09;

public class PokemonSportif extends PokemonTerrestre {
    private int frequenceCardiaque;

    PokemonSportif(String nom, double poids, int nbPattes, double taille, int frequenceCardiaque) {
        super(nom, poids, nbPattes, taille);
        this.frequenceCardiaque = Math.abs(frequenceCardiaque);
    }
    
    public int getFrequenceCardiaque() {
        return frequenceCardiaque;
    }

    @Override
    public String toString() {
        return super.toString() + " avec une fréquence cardiaque de " + getFrequenceCardiaque();
    }

}

package td09;

public class PokemonMer extends PokemonMarin {
    
    PokemonMer(String nom, double poids, int nbNageoires) {
        super(nom, poids, nbNageoires);
    }

    @Override
    public double getVitesse() {
        return getPoids() / 25 * getNbNageoires();
    }
}

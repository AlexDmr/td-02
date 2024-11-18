package td09;

import java.util.ArrayList;

public class CollectionPokemon {
    private ArrayList<Pokemon> pokemons;

    public CollectionPokemon() {
        pokemons = new ArrayList<>();
    }

    public void ajouterPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }











    public double getVitesseMoyenne() {
        double vitesseMoyenne = 0;
        for (Pokemon pokemon : pokemons) {
            vitesseMoyenne += pokemon.getVitesse();
        }
        return vitesseMoyenne / pokemons.size();
        // return pokemons.stream().mapToDouble(Pokemon::getVitesse).average().orElse(0);
    }

    public double getVitesseMoyenneSportifs() {
        double vitesseMoyenne = 0;
        int nbSportifs = 0;
        for (Pokemon pokemon : pokemons) {
            if (pokemon instanceof PokemonSportif) {
                vitesseMoyenne += pokemon.getVitesse();
                nbSportifs++;
            }
        }
        return vitesseMoyenne / nbSportifs;
        // return pokemons.stream().filter(p -> p instanceof PokemonSportif).mapToDouble(Pokemon::getVitesse).average().orElse(0);
    }
}

package td09;

public class testPokemon {
    public static void main(String[] args) {
        PokemonCasanier p0 = new PokemonCasanier("p0", 10, 4, 1, 2);
        PokemonSportif p1 = new PokemonSportif("p1", 10, 4, 1, 100);
        PokemonCroisiere p2 = new PokemonCroisiere("p2", 10, 2);
        PokemonMer p3 = new PokemonMer("p3", 10, 2);

        System.out.println(p0);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}

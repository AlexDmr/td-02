package td09;

class PokemonCasanier extends PokemonTerrestre {
    private int nbHeuresTele;

    PokemonCasanier(String nom, double poids, int nbPattes, double taille, int nbHeuresTele) {
        super(nom, poids, nbPattes, taille);
        this.nbHeuresTele = Math.abs(nbHeuresTele);
    }
    
    public int getNbHeuresTele() {
        return nbHeuresTele;
    }

    @Override
    public String toString() {
        return super.toString() + ", je regarde la télé " + getNbHeuresTele() + " heures par jour";
    }

}
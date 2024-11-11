package td07;

public class Complexe {
    private double re;
    private double im;
    private double r;
    private double θ;
    
    public Complexe() {
        // Soit on a un commentaire qui indique que :
        // Par le principe de troation, on va avoir les attributs initialisés à 0.

        // Soit on les initialise explicitement à 0
        // (inutile mais peut être une bonne pratique)
        this.re = 0.0;
        this.im = 0.0;
        this.r  = 0.0;
        this.θ  = 0.0;
    }

    public Complexe(double re, double im) {
        this.re = re;
        this.im = im;
        this.majCartesienVersPolaire();
    }

    public double getReel() {
        return this.re;
    }

    public double getImaginaire() {
        return this.im;
    }

    public double getModule() {
        return this.r;
    }
    
    public double getAngle() {
        return this.θ;
    }
    
    public void setReel(double re) {
        this.re = re;
        this.majCartesienVersPolaire();
    }

    public void setImaginaire(double im) {
        this.im = im;
        this.majCartesienVersPolaire();
    }

    /**
     * Problème, setModule est partiellement définit sur double
     * Il n'est définit QUE pour r >= 0.
     * Si r est < 0 :
     *   * On multiplie par -1
     *   * Soit vous bornez sur [0; Infinie[
     *   * On lève une exception
     * Quel que soit votre choix : Il faut indiquer le comportement dans la doc !!!
     */
    public void setModule(double r) {
        this.r = Math.abs(r);
        this.majPolaireVersCartesien();
    }

    /**
     * On stockera l'angle sous la forme [0: 2PI[
     */
    public void setAngle(double θ) {
        this.θ = θ % (Math.PI * 2);
        this.majPolaireVersCartesien();
    }

    public void ajouteComplexe(Complexe c) {
        this.re += c.getReel();
        this.im += c.getImaginaire();
        this.majCartesienVersPolaire();
    }

    public void multiplieReel(double nb) {
        this.setModule(nb * this.getModule());
    }

    /**
     * Méthode qui met à jour les coordonnées polaires (r et θ)
     * en fonction des coordonnées cartésiennes (re et im)
     */
    private void majCartesienVersPolaire() {
        this.r = Math.sqrt(re * re + im * im);
        this.θ = Math.atan2(im, re);
    }

    /**
     * Méthode qui met à jour les coordonnées polaires (r et θ)
     * en fonction des coordonnées cartésiennes (re et im)
     */
    private void majPolaireVersCartesien() {
        this.re = r * Math.cos(this.θ);
        this.im = r * Math.sin(this.θ);
    }

}

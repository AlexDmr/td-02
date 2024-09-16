package td02;

class Ampoule {
    boolean allumée;

    Ampoule() {
        allumée = false;
    }

    boolean estAllumee() {
        return allumée;
    }

    void allumerAmpoule() {
        allumée = true;
    }

    void eteindreAmpoule() {
        allumée = false;
    }
}

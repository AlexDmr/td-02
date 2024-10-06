package td04;

public class Position {
    int emplacement;
    int positionDansPile;

    static Position inexistante = new Position(-1, -1);

    public Position(int emplacement, int positionDansPile) {
        this.emplacement = emplacement;
        this.positionDansPile = positionDansPile;
    }
}

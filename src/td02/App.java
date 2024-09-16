package td02;
class TD2 {
    /**
     * Says hello to the world.
     *
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Ampoule a1;
        a1 = new Ampoule();
        Ampoule a2;
        a2 = new Ampoule();
        Ampoule a3;
        a3 = new Ampoule();
        System.out.println("a1: " + a1.estAllumee() + ", a2: " + a2.estAllumee() + ", a3: " + a3.estAllumee());

        a3.allumerAmpoule();
        a1 = a3;
        System.out.println("a1: " + a1.estAllumee() + ", a2: " + a2.estAllumee() + ", a3: " + a3.estAllumee());

        a3 = a2;
        System.out.println("a1: " + a1.estAllumee() + ", a2: " + a2.estAllumee() + ", a3: " + a3.estAllumee());

        a3 = a2 = a1;
        System.out.println("a1: " + a1.estAllumee() + ", a2: " + a2.estAllumee() + ", a3: " + a3.estAllumee());

        a2 = new Ampoule();
        System.out.println("a1: " + a1.estAllumee() + ", a2: " + a2.estAllumee() + ", a3: " + a3.estAllumee());
        a2 = a1;
        System.out.println("a1: " + a1.estAllumee() + ", a2: " + a2.estAllumee() + ", a3: " + a3.estAllumee());

        a2.eteindreAmpoule();
        System.out.println("a1: " + a1.estAllumee() + ", a2: " + a2.estAllumee() + ", a3: " + a3.estAllumee());
        Ampoule a4 = a2;
        System.out.println("a4: " + a4.estAllumee());
    }
}

package td05;

public class essai {
    public static void main(String[] args) {
        // Un essai avec une expression simple "1 2 +"
        Analyseur A = new Analyseur();
        System.out.println( A.eval("0 0 /") );
    }
}

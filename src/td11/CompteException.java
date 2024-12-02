package td11;

import java.util.Scanner;

public class CompteException {
    static int appelsMethodesClasse;
    int appelsMethodesInstance;
    private int[] tab;

    public void setTable(String[] stringTab) {
        appelsMethodesClasse++;
        appelsMethodesInstance++;

        tab = new int[stringTab.length];
        for (int i = 0; i < stringTab.length; i++) {
            try {
                tab[i] = Integer.parseInt(stringTab[i]);
            } catch (NumberFormatException e) {
                tab[i] = this.readInt();
            }
        }
    }

    public int readInt() {
        appelsMethodesClasse++;
        appelsMethodesInstance++;
        System.out.print(" Veuillez entrer un entier : ");
        
        boolean itsAllRight = false;
        int i = 0;
        while (!itsAllRight) {
            try {
                Scanner scan = new Scanner(System.in);
                i = scan.nextInt();
                itsAllRight = true;
            } catch(Exception e) {
                // ça a planté, on a intercepté, on passe à la suite
            }
        }
        return i;
    }

    public void setTable(int n) {
        appelsMethodesClasse++;
        appelsMethodesInstance++;

        tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = readInt();
        }
    }

    public String toString() {
        String str = "[";
        for (int i = 0; i < tab.length; i++) {
            str += tab[i];
            if (i < tab.length - 1) {
                str += ", ";
            }
        }
        str += "]";
        return str;
    }

}
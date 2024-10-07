package td05;

public class Analyseur {
    /**
     * à faire
     * @param s string to evaluate, containing an arithmetic expression formatted in inverse Polish notation.
     * @return the integer value of the string s, evaluated as an arithmetic expression
     */
    int eval(String s) {
        Fragment[] L = parse(s);
        Pile P = new Pile();

        /**
         * ça donne une idée de solution MAIS il faudrait placer ça dans 
         * une boucle englobante pour pouvoir tout parcourir
         */
        int i = 0;
        while (i != L.length && L[i].type != Type.op) {
            P.empiler( L[i] );
            i++;
        }

        return 0;
    }

    /**
     * Return the array of fragments that represent the string s
     * Fragments are numbers or operators
     **/
    Fragment[] parse(String s) {
        String[] tokens = s.split(" ");
        Fragment[] fragments = new Fragment[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("x") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                fragments[i] = new Fragment(Type.op, tokens[i]);
            } else {
                fragments[i] = new Fragment(Type.num, tokens[i]);
            }
        }
        return fragments;
    }

    // Return the integer value of the string s
    int entier(String s) {
        return Integer.parseInt(s);
    }

}

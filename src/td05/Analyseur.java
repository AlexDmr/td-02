package td05;

public class Analyseur {
    /**
     * à faire
     * 
     * @param s string to evaluate, containing an arithmetic expression formatted in
     *          inverse Polish notation.
     * @return the integer value of the string s, evaluated as an arithmetic
     *         expression
     */
    int eval(String s) { // Optional est une classe générique, elle ne s'applique que sur des classes,
                         // d'où l'utilisation de Integer plutot que int
        Fragment[] L = parse(s);
        Pile P = new Pile();

        for (Fragment f : L) {
            if (f.type == Type.num) {
                P.empiler(f);
            } else {
                int b = entier(P.dépiler().value);
                int a = entier(P.dépiler().value);
                int res;
                switch (f.value) {
                    case "+":
                        res = a + b;
                        break;
                    case "-":
                        res = a - b;
                        break;
                    case "*":
                    case "x":
                        res = a * b;
                        break;
                    case "/":
                        // Que se passe-t-il si b vaut 0 ?
                        res = a / b;
                        break;
                    default:
                        // Opérateur inconnu --> L'expression n'est pas définie
                        // Que devrait-on faire ?
                        res = 0;
                }

                P.empiler(
                        new Fragment(Type.num, Integer.toString(res))
                );
            }
        }

        // Normalement la pile devrait ne contenir qu'un seul élément,
        // que faire si ça n'est pas le cas ?
        return entier(
                P.dépiler().value
        );
    }

    /**
     * Return the array of fragments that represent the string s
     * Fragments are numbers or operators
     **/
    Fragment[] parse(String s) {
        String[] tokens = s.split(" ");
        Fragment[] fragments = new Fragment[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("x") || tokens[i].equals("-") || tokens[i].equals("*")
                    || tokens[i].equals("/")) {
                fragments[i] = new Fragment(Type.op, tokens[i]);
            } else {
                fragments[i] = new Fragment(Type.num, tokens[i]);
            }
        }
        return fragments;
    }

    // Return the integer value of the string s
    int entier(String s) { // Optional est une classe générique, elle ne s'applique que sur des classes,
                           // d'où l'utilisation de Integer plutot que int
        return Integer.parseInt(s);
    }

}

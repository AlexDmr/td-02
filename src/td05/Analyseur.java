package td05;

import java.util.Optional;

public class Analyseur {
    /**
     * à faire
     * @param s string to evaluate, containing an arithmetic expression formatted in inverse Polish notation.
     * @return the integer value of the string s, evaluated as an arithmetic expression
     */
    Optional<Integer> eval(String s) { // Optional est une classe générique, elle ne s'applique que sur des classes, d'où l'utilisation de Integer plutot que int
        Fragment[] L = parse(s);
        Pile P = new Pile();

        for (Fragment f : L) {
            if (f.type == Type.num) {
                P.empiler(f);
            } else {
                Optional<Integer> B = entier(P.dépiler().value);
                Optional<Integer> A = entier(P.dépiler().value);
                Optional<Integer> res;

                if (A.isEmpty() || B.isEmpty()) {
                    return Optional.empty(); // Attention ça n'est pas conseillé dans ce cours de placer des returns dans les for
                } else {
                    int a = A.get();
                    int b = B.get();

                    switch (f.value) {
                        case "+":
                            res = Optional.of(a + b);
                            break;
                        case "-":
                            res = Optional.of(a - b);
                            break;
                        case "*":
                        case "x":
                            res = Optional.of(a * b);
                            break;
                        case "/":
                            // On évite ici la cas indéfinit de la division par 0.
                            res = b == 0 ? Optional.empty() : Optional.of(a / b);
                            break;
                        default:
                            // Opérateur inconnu --> L'expression n'est pas définie
                            res = Optional.empty();
                    }

                    if (res.isEmpty())
                        return Optional.empty(); // Même remarque sur le return dans le for...
                    
                    // Si on est ici, c'est que res est porteur d'une valeur.
                    P.empiler(
                        new Fragment(Type.num, Integer.toString(res.get()))
                    );
                }
            }
        }
        
        Optional<Integer> result = entier( P.dépiler().value );
        return P.estVide() ? result : Optional.empty();
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
    Optional<Integer> entier(String s) { // Optional est une classe générique, elle ne s'applique que sur des classes, d'où l'utilisation de Integer plutot que int
        // On traite l'exception
        // Le mieux dans notre approche aurait été que Integer.parseInt renvoie un Optional<Integer>
        try {
            return Optional.of( Integer.parseInt(s) );
        } catch(NumberFormatException e) {
            return Optional.empty();
        }
    }

}

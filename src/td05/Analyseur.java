package td05;

public class Analyseur {
    /**
     * à faire
     * @param s string to evaluate, containing an arithmetic expression formatted in inverse Polish notation.
     * @return the integer value of the string s, evaluated as an arithmetic expression
     */
    int eval(String s) {
        Fragment[] fragments = parse(s);
        Pile pile = new Pile();
        for (Fragment fragment : fragments) {
            if (fragment.type == Type.num) {
                pile.empiler(fragment);
            } else {
                Fragment f2 = pile.dépiler();
                Fragment f1 = pile.dépiler();
                int n1 = entier(f1.value);
                int n2 = entier(f2.value);
                int result = 0;
                switch (fragment.value) {
                    case "+":
                        result = n1 + n2;
                        break;
                    case "-":
                        result = n1 - n2;
                        break;
                    case "*":
                    case "x":
                        result = n1 * n2;
                        break;
                    case "/":
                        result = n1 / n2;
                        break;
                }
                pile.empiler(new Fragment(Type.num, Integer.toString(result)));
            }
        }
        return entier(pile.dépiler().value);
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

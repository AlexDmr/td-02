package td05;

// Classe Pile, implements the stack collection using the proper standard library class
class Pile {
    // The stack collection
    private java.util.Stack<Fragment> stack;

    // Constructor
    public Pile() {
        stack = new java.util.Stack<Fragment>();
    }

    boolean estVide() {
        return stack.isEmpty();
    }

    Fragment dépiler() {
        return stack.pop();
    }

    void empiler(Fragment f) {
        stack.push(f);
    }

}
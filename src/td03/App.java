package td03;

public class App {

    public static void main(String[] args) {
        // Batterie de tests
        TD03_test[] tests = {
                new TD03_test(0),
                new TD03_test(1, 3),
                new TD03_test(3, 1, 2, 3),
                new TD03_test(1, 3, 2, 1),                        
        };

        for (TD03_test t: tests) {
            t.process();
        }
    }
}

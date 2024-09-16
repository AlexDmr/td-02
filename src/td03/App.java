package td03;

public class App {

    public static void main(String[] args) {
        // Batterie de tests
        TD03_test[] tests = {
                new TD03_test(0),
                new TD03_test(1, 3),
                new TD03_test(3, 1, 2, 3),
                new TD03_test(1, 3, 2, 1),                        
                new TD03_test(1, 5, 5, 5),                        
                new TD03_test(4, 0, 1, 2, 3, -1, 5, 6),                        
                new TD03_test(5, 0, 1, 2, 3, -1, 5, 6, 7, 8),                        
        };

        for (TD03_test t: tests) {
            t.process();
        }
    }
}

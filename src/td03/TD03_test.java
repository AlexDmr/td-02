package td03;

public class TD03_test {
    private int[] L;
    private int expected_lenght;

    public TD03_test(int expected_lenght, int ...L) {
        this.L = L;
        this.expected_lenght = expected_lenght;
    }

    public boolean process() {
        int length = td03.length_pgss(this.L);
        boolean result = length == this.expected_lenght;

        if (result) {
            System.out.println(
                    "OK : length_pgss( " + stringifyIntArray() + " ) is equal to " + this.expected_lenght);
        } else {
            System.out.println("KO : length_pgss( " + stringifyIntArray() + " ) should be equal to " + this.expected_lenght
                    + " but returned " + length);
        }

        return result;
    }
    
    private String stringifyIntArray() {
        String res = "{";
        for (int i = 0; i < L.length; i++) {
            res += L[i];
            if (i < L.length - 1) {
                res += ", ";
            }
        }
        res += "}";
        return res;
    }
}

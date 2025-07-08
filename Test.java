// File: Test.java
public class Test {
    public static void main(String[] argv) {
        hitung(4);
    }

    static void hitung(int N) {
        int total = 0;

        for (int i = N; i >= 0; i -= 4) {

            for (int j = N; j > 0; j /= 2) {

                for (int k = 0; k < N; k += 2) {
                    total++;
                }
            }
        }
        System.out.println(total);
    }
}

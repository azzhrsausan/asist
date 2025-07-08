import java.util.Scanner;

public class CobaCoba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();

        String[] splitted_x = x.split(" ");

        int[] x_int = new int[splitted_x.length];
        for(int i=0;i<splitted_x.length;i++) {
            x_int[i] = Integer.parseInt(splitted_x[i]);
        }
        
        System.out.println(x_int[1]);
    }
}

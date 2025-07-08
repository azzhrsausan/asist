
public class Array2Dimensi {
    public static void main(String[] args) {
        int x = 1;
        
        
        
        int[] arr2 = new int[5]; // sama aja kaya int[] arr2 = {0, 0, 0, 0, 0};
        
        // System.out.print("{");
        // for(int i=0; i<arr2.length;i++) {
        //     if(i==arr2.length-1) {
        //         System.out.print(arr2[i]+"");
        //     } else {
        //         System.out.print(arr2[i]+", ");
        //     }
        // }
        // System.out.print("}");
        
        
        int[][] arr = 
        { 
            {1, 2, 3}, 
            {5, 6}, 
            {7, 8, 100, 999} 
        };

        // i refer ke baris, j refer ke kolomnya
        // System.out.println("{");
        // for(int i=0; i<arr.length; i++) {
        //     System.out.print("{");
        //     for(int j=0; j<arr[i].length; j++) {
        //         if(j==arr[i].length-1) {
        //             System.out.print(arr[i][j]+"");
        //         } else {
        //             System.out.print(arr[i][j]+", ");
        //         }
        //     }

        //     if(i==arr.length-1) {
        //         System.out.print("}");
        //         System.out.println();
        //     } else {
        //         System.out.print("},");
        //         System.out.println();
        //     }
        // }
        // System.out.println("}");



        int[][] arrnew = new int[3][]; // sama aja kaya int[][] arrnew = {null, null, null};
        arrnew[0] = new int[]{1,2,3};
        arrnew[1] = new int[]{5,6};
        arrnew[2] = new int[]{7,8,100,999};

        int[][] arrx = new int[10][15];

        String[] k = new String[5];
        Boolean[] l = new Boolean[5];
        Menfess[] m = new Menfess[5];

        String c = "1";
        String b = "2";
        // System.out.println(c+b);

        // parse string ke int
        int c_int = Integer.parseInt(c);
        int b_int = Integer.parseInt(b);
        // System.out.println(c_int + b_int);

        // parse int ke string
        int mm = 1;
        String mm_str = String.valueOf(mm);


        int x1=1;
        int x2=2;

        // System.out.println((double) x1 / (double) x2);


        method1(999888);

        String hasil = hitung(1,2);
        System.out.println(hasil);


    }

    public static void method1(int x) {
        System.out.println(x);
    }

    public static String hitung(int x, int y) {
        int hasil = x+y;

        return String.valueOf(hasil);
    }
}

class Menfess{

}

package Essay2.No2;

public class nomorDua {

    public static void main(String[] args) {

        // System.out.println(isArrayDominantA(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4})); // false
        // System.out.println(isArrayDominantA(new int[]{1, 2, 4}, new int[]{1, 4, 5}));    // true
        // System.out.println(isArrayDominantA(new int[]{10, 11}, new int[]{4, 5, 6}));     // true
        // System.out.println(isArrayDominantA(new int[]{1, 2, 4, 9}, new int[]{4, 5, 6})); // false
        
        System.out.println("======================");
        System.out.println(isArrayDominantB(new int[]{1, 2, 4, 6}, new int[]{2, 3, 4})); // false
        System.out.println(isArrayDominantB(new int[]{1, 2, 4}, new int[]{4, 5, 6}));    // true
        System.out.println(isArrayDominantB(new int[]{10, 11}, new int[]{4, 5, 6}));     // true
        System.out.println(isArrayDominantB(new int[]{1, 2, 4, 9}, new int[]{4, 5, 6})); // false
    }

    // public static boolean isArrayDominantA(int[] arr, int[] arr2){

    //     boolean aDominant = true;
    //     boolean bDominant = true;

    //     for (int angka:arr){
    //         for (int angka2:arr2){
    //             if (angka < angka2){
    //                 aDominant = false;
    //                 break;
    //             }
    //         }
    //         if (aDominant == false){
    //                 break;
    //         }
    //     }

    //     for (int angka2:arr2){
    //         for (int angka:arr){
    //             if (angka2 < angka){
    //                 bDominant = false;
    //                 break;
    //             }
    //         }
    //         if (bDominant == false){
    //                 break;
    //         }
    //     }
    //     return aDominant || bDominant;
    // }

    public static boolean isArrayDominantB(int[] arr1, int[] arr2){
        int minA = arr1[0], maxA = arr1[0];
        int minB = arr2[0], maxB = arr2[0];

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < minA){
                minA = arr1[i];
            }
            if (arr1[i] > maxA){
                maxA = arr1[i];
            } 
        }

        for (int i = 0; i<arr2.length;i++) {
            if (arr2[i] < minB){
                minB = arr2[i];
            } 
            if (arr2[i] > maxB) {
                maxB = arr2[i];
            }
        }


        return minA >= maxB || minB >= maxA;
    }
    
}

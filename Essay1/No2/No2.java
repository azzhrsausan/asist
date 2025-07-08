package Essay1.No2;

public class No2 {

    public static void main(String[] args){
        System.out.println(innerArrayChecker(new int[]{1,2,4,6}, new int[]{2,4}));
        System.out.println(innerArrayChecker(new int[]{1,2,4,6}, new int[]{2,3,4}));
        System.out.println(innerArrayChecker(new int[]{1,2,4,4,6}, new int[]{2,4,6}));
        System.out.println(innerArrayChecker(new int[]{1,5,3,2,1}, new int[]{3,2}));


    }

    public static boolean innerArrayChecker(int[] outer, int[] inner) {
        int pointer1=0;
        int pointer2=0;

        Boolean flag;

        while (true) { 
            if(outer[pointer1] == inner[pointer2]) {
                pointer1++;
                pointer2++;
            } else {
                pointer1++;
            }

            if(pointer2 == inner.length) { // pointer2 sudah diluar inner
                flag = true;
                break;
            } else if(pointer1 == outer.length) {
                flag = false;
                break;
            }
         
        }

        if(flag==true) {
            return true;
        }
        else {
            return false;
        }

    }
    
}

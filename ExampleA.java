public class ExampleA {
    static int i = 10;
    static int k = 7;
    public static void main(String[] args){
        ExampleA myA = new ExampleA();
        myMethod();           // Baris 6
        int j = myA.i;
    }

    public static void myMethod(){
        i = i + k;
    }
}

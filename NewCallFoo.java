// File: NewCallFoo.java
public class NewCallFoo {
    public static void main(String[] args) {
        Foo2 calculator = new Foo2();
        System.out.println(calculator.calcA(10, 13, 3, 7));
    }
}

class Foo2 {
    private int a1 = 10;    
    private int a3 = -4;   
    
    
    
    public double calcA(int a1, int a2, int a3, int a4) {
        
        return Math.sqrt(Math.pow(a2 - this.a1, 2) + Math.pow(a4 - a3, 2)); // 5.0
    }
}

// class = blueprint rumah
// objek = rumah

public class MyClass {

    // default nilai integer adalah 0
    static int a; // static field (atribut MILIK CLASS), sehingga semua objek pasti mempunyai nilai a yang sama
    int b;        // instance field (atribut MILIK INDIVIDU OBJEK), sehingga setiap objek bisa mempunyai nilai b yang berbeda

    // Constructor tanpa parameter
    public MyClass() {
        a++;               
        incrementBAndA(); 
    }

    // Constructor dengan parameter
    public MyClass(int x) {
        b = x;             
        a++;               
        incrementBAndA();  
    }

    public static void main(String[] args) {
        int a = 4; // ini adalah variable lokal, bukan static class variable
        System.out.println(a); // a (local) = 4


        incrementStaticA(); // a = 1

        MyClass obj1 = new MyClass(); // a = 5 && obj1.b = 1
        obj1.incrementBAndA();        // a = 8 && obj1.b = 2

        MyClass obj2 = new MyClass(5); // a = 12 && obj2.b = 6
        obj2.incrementBAndA();         // a = 15 && obj2.b = 7

        MyClass.a++; // a = 16

        MyClass.incrementStaticA(); // a = 17

        System.out.println(obj1.a); // baris ke 26
        System.out.println(obj2.a);
    }

    // Method static untuk menaikkan static variable a
    public static void incrementStaticA() {
        a++;
    }

    // Method instance untuk menaikkan b dan a
    public void incrementBAndA() {
        b++;
        a += 3;
    }
}

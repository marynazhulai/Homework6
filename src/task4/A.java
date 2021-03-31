package task4;

public class A {

    int a;
    int b;


    public A(int a) {
        this.a = a;
        System.out.println("Constructor A");
    }

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int method1() {
        System.out.println("Class A method1");
        return 1;
    }

    public int method2(int a, int b) {
        System.out.println("Class A method2");
        return a + b;
    }
}

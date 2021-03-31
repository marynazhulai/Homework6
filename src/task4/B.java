package task4;

public class B extends A {

    public B(int a) {
        super(a);
        System.out.println("Constructor B");
    }

    @Override     //Override метода класса А в классе В
    public int method1() {
        int c = 1+10;
        System.out.println("Class B method1");
        return c;
    }

    @Override    //Override метода класса А в классе В и вызов метода класса А
    public int method2(int a, int b) {
        if (a + b < 0) {
            System.out.println("< 0");
        } else {
            System.out.println("> 0");
         }
        return super.method1();


    }

}


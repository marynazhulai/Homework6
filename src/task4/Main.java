package task4;

public class Main {
    public static void main(String[] args) {
        B object1 = new B(5); //конструктор класса B вызывает конструктор класса A для создания нового объекта
        System.out.println("****************************");


    int z = object1.method2( 1, 2); //Демонстрация Override метода класса А в классе В (и вызов самого метода)
        System.out.println(z);
        System.out.println("------------------------------");


        int y = object1.method1();  //Демонстрация Override метода класса А в классе В (и вызов самого метода)
        System.out.println(y);

        System.out.println("++++++++++++++++++++++++++++++");

        A object2 = new A(2,3); //создание объекта класса А
        object2.method1();    //вызов метода класса А
        System.out.println("==============================");


        object2.method2(4,5);    //вызов метода класса А
        int x = object2.method2(4,5);
        System.out.println(x);

    }
}

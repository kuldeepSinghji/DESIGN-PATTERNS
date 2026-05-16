package singleton;

public class SingletonMain {
    public static void main(String[] args) {
        SingletonPattern obj1 = SingletonPattern.getInstance();
        SingletonPattern obj2 = SingletonPattern.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);

        SingletonInnerClass obj3 = SingletonInnerClass.getInstance();
        SingletonInnerClass obj4 = SingletonInnerClass.getInstance();
        System.out.println(obj3);
        System.out.println(obj4);
    }
}

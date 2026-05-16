package singleton;

public class SingletonInnerClass {

    private SingletonInnerClass(){
        if (Helper.INSTANCE != null) {
            throw new RuntimeException("Use getInstance()");
        }
    }

    private static class Helper {
        private static final SingletonInnerClass INSTANCE = new SingletonInnerClass();
    }

    public static SingletonInnerClass getInstance(){
        return Helper.INSTANCE;
    }
}

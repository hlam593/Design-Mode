package singleton;

/**
 * @description: 懒汉式
 * @author: lam h
 * @date: 2023/09/15
 */
public class LazySingleton {

    private static volatile LazySingleton instance = null;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}

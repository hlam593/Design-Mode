package singleton;

/**
 * @description: 饿汉式
 * @author: lam h
 * @date: 2023/09/15
 */
public class HungrySingleton {

    private static volatile HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return instance;
    }
}

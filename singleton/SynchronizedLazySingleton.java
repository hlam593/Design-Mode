package singleton;

/**
 * @description: 懒汉式
 * @author: lam h
 * @date: 2023/09/15
 */
public class SynchronizedLazySingleton {

    private static volatile SynchronizedLazySingleton instance = null;

    private SynchronizedLazySingleton() {}

    /**
     * 也可以用 synchronized 关键字修饰 getInstance 方法来实现
     * public static synchronized SynchronizedLazySingleton getInstance() {
     *     if (instance == null) {
     *         instance = new SynchronizedLazySingleton();
     *     }
     *     return instance;
     * }
     */
    public static SynchronizedLazySingleton getInstance() {
        if (instance != null) {
            return instance;
        }
        synchronized (SynchronizedLazySingleton.class) {
            if (instance == null) {
                instance = new SynchronizedLazySingleton();
            }
        }
        return instance;
    }
}

package singleton;

/**
 * @description: 单例模式
 * @author lam h
 * @date: 2023/09/15
 */
public class Singleton {

    private static final Singleton singleton = new Singleton();

    // 构造方法私有防止产生多个对象
    private Singleton () {}

    // 获取实例对象
    public static Singleton getSingleton() {
        return singleton;
    }

    // 类中其他方法尽量是 static
    public static void doSingleton() {

    }

}

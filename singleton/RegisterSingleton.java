package singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: 登记式
 * @author: lam h
 * @date: 2023/09/17
 */
public class RegisterSingleton {

    private static Map<String, RegisterSingleton> map = new ConcurrentHashMap<>();

    private RegisterSingleton() {

    }

    public static RegisterSingleton getInstance(String name) {
        if (null == name || "".equals(name)) {
            name = RegisterSingleton.class.getName();
        }
        if (null != map.get(name)) {
            return map.get(name);
        }
        try {
            RegisterSingleton registerSingleton = (RegisterSingleton)Class.forName(name).newInstance();
            map.put(name, registerSingleton);
            return registerSingleton;
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Map<String, RegisterSingleton> getMap() {
        return map;
    }

}

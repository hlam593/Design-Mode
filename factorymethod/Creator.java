package factorymethod;

/**
 * @description: 定义产品对象的产生
 * @author: lam h
 * @date: 2023/09/23
 */
public abstract class Creator {

    public abstract <T extends Product> T createProduct(Class<T> tClass);

}

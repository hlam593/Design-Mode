package factorymethod;

/**
 * @description:
 * @author: lam h
 * @date: 2023/09/23
 */
public class Client {

    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product1 = creator.createProduct(ConcreteProduct1.class);
        Product product2 = creator.createProduct(ConcreteProduct2.class);
        product1.method2();
        product2.method2();
    }

}

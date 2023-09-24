package factorymethod.simplefactorymodel;

/**
 * @description:
 * @author: lam h
 * @date: 2023/09/24
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑皮肤");
    }

    @Override
    public void talk() {
        System.out.println("Hey!Man.");
    }
}

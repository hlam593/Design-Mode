package factorymethod.simplefactorymodel;

/**
 * @description:
 * @author: lam h
 * @date: 2023/09/24
 */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白皮肤");
    }

    @Override
    public void talk() {
        System.out.println("Calm down!Guy!.");
    }
}

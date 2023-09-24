package factorymethod.simplefactorymodel;

/**
 * @description:
 * @author: lam h
 * @date: 2023/09/24
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄皮肤");
    }

    @Override
    public void talk() {
        System.out.println("你好！");
    }
}

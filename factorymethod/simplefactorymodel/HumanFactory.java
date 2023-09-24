package factorymethod.simplefactorymodel;

/**
 * @description:
 * @author: lam h
 * @date: 2023/09/24
 */
public class HumanFactory {

    public static <T extends Human> T createHuman(Class<T> tClass) {
        Human human = null;
        try {
            human = (Human) Class.forName(tClass.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误！");
        }
        return (T) human;
    }

}

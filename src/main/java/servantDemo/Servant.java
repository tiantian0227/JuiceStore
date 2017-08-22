package servantDemo;

/**
 * Created by Administrator on 2017/8/1.
 */
//菲佣类型/描述了菲佣对象/包括菲佣的状态和行为
public class Servant {
    public String name;
    public int age;
    void shopping(){
        System.out.println("买菜....");
    }
    void cook(){
        System.out.println("做饭....");
    }
}

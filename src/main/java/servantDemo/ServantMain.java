package servantDemo;

/**
 * Created by Administrator on 2017/8/1.
 */
public class ServantMain {
    public static void main(String arg[]){
        //创建一个菲佣对象s1
        Servant s1=new Servant();
        //给菲佣s1起名字
        s1.name="小丽";
        s1.name="小芳";
        s1.age=18;
        System.out.println(s1.name+","+s1.age);
        //调用小丽的买菜做饭功能
        s1.shopping();
        s1.cook();
        //创建一个工程师的对象,来写代码
        Engineer c1=new Engineer();
        c1.coding();
        //创建另一个菲佣对象s2
        Servant s2=new Servant();
        s2.name="lucy";
        s2.age=22;
        System.out.println(s1);
        new Servant().name="A";
        System.out.println(s1.equals(s2));
    }
}

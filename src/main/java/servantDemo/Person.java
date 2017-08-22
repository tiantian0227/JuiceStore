package servantDemo;

/**
 * Created by Administrator on 2017/8/7.
 */
public class Person
{
    String name;
    int age;
    //不属于某个对象，属于人类
    public static int totalNum=5;//人的总人数，类的属性
    Person(String n,int a)
    {
        name=n;
        age=a;
        totalNum++;
    }
    Person(){

    }
    void die()
    {
        System.out.println("去世...");
    }
    static void destoy()
    {
        totalNum=0;
        System.out.println("人类毁灭");
    }
}

package servantDemo;

/**
 * Created by Administrator on 2017/8/7.
 */
public class PersonDemo {
    public static void main(String[] args)
    {
        System.out.println(Person.totalNum);
        Person p1=new Person("will",17);
        Person p2=new Person();
        System.out.println(p1.totalNum);
        p2.destoy();
        System.out.println(Person.totalNum);

    }
}

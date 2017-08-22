package servantDemo.servantDemo1;

import servantDemo.Servant;

/**
 * Created by Administrator on 2017/8/17.
 */
public class CircleMain {
    public  static void main(String args[]){
        //创建点的对象
        Points p=new Points(3,5);
        //创建圆的对象
        Circle r=new Circle(5);
        String ret =r.judge(p);
        System.out.println(ret);
    }
}

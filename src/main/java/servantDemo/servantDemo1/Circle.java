package servantDemo.servantDemo1;

/**
 * Created by Administrator on 2017/8/17.
 */
public class Circle
{
    private int r;//圆的半径为r
    //创建有参数的构造器
    public Circle(int r){
      this.r=r;
    }
    /*
    判断点和圆的关系
    参数：需要判断的点的对象
    返回： 1：表示点在圆外；
          0：表示点在圆周上；
          -1：表示点在圆内；
    */
    public String judge(Points p1){
        int xxyy=p1.getX()*p1.getX()+p1.getY()*p1.getY();
        int rr=this.r*this.r;
       if(xxyy>rr){
           return "点在圆外";
       }
       else if(xxyy<rr){
           return "点在圆内";
       }
       else {
           return "点在圆上";
       }
    }
}

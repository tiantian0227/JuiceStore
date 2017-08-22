package servantDemo.servantDemo1;

/**
 * Created by Administrator on 2017/8/17.
 */
public class Points {
    private int x;//点的横向坐标
    private int y;//点的纵向坐标
    //创建有参数构造器
    public Points(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}

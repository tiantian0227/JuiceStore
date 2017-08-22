package servantDemo;

/**
 * Created by Administrator on 2017/8/4.
 */
public class Student {
    String name;//学生姓名
    boolean isFree = false;//学生缴费状态，默认是未缴费
    void fees(){
        isFree=true;//设置为已缴费
    }
}

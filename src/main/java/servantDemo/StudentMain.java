package servantDemo;

/**
 * Created by Administrator on 2017/8/4.
 */
public class StudentMain {
    public static void main(String[] args) {
      //创建4个学生对象
        Student s1=new Student();
        s1.name="赵一";
        s1.isFree=true;

        Student s2=new Student();
        s2.name="钱二";

        Student s3=new Student();
        s3.name="张三";
        s3.isFree=false;

        Student s4=new Student();
        s4.name="赵四";
        s4.isFree=false;

        //创建一个数组，用于存储所有的学生对象
        Student[] arr=new Student[]{s1,s2,s3,s4};
        //使用循环迭代数组中的每一个元素
        for(Student ele: arr)
        {

            //判断当前学生对象是否缴费，如果没有，则调用缴费方法
            if(ele.isFree ==false){
                ele.fees();
            }
        }
        //执行完缴费方法后所有学生对象的缴费状态
        for (Student ele: arr){
            System.out.println(ele.name+","+ele.isFree);
        }
    }
}

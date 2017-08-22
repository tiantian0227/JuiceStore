package domian;

/**
 * Created by jl062 on 2017/4/4.
 */
public class Label {
    private String LabelName;//成员变量（实例变量）
    public static String name="田甜";//类变量（静态变量）
    private int length;
    public Label(){

    }//构造方法
    public void setLabelName(String name){
        this.LabelName=name;
        int i=0;//局部变量
    }
    public String getLabelName(){
        return LabelName;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }


}

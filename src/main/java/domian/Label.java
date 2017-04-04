package domian;

/**
 * Created by jl062 on 2017/4/4.
 */
public class Label {
    private String LabelName;
    private int length;
    public void setLabelName(String name){
        this.LabelName=name;
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

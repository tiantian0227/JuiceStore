package domian;

/**
 * Created by jl062 on 2017/4/4.
 */
public class Pear {
    private int weight;
    private String juice;
    private Label pearlabelA;
    public void setWeight(int weight){
        this.weight=weight;
    }
    public int getWeight(){
        return weight;
    }
    public void setPearlabel(Label pearlabel){
        this.pearlabelA=pearlabel;
    }
    public void generatejuice(){
       this.juice=weight/2+"ml的"+pearlabelA.getLabelName() +"梨汁";
    }
    public String getJuice(){
        return juice;
    }
}

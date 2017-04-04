package domian;

/**
 * Created by jl062 on 2017/4/4.
 */
public class Apple {
    private int weight;
    private String juice;
    private Label fruitLabel1;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight1) {
        this.weight = weight1;
    }
    public void setJuice(String juice){
        this.juice=juice;
    }
    public String getJuice() {
        return juice;
    }
    public void setFruitLabel(Label fruitLabel) {
        this.fruitLabel1= fruitLabel;
    }
    public void generateJuice() {
        this.juice = weight / 3 + "ml的" + fruitLabel1.getLabelName() + "苹果汁";
    }
}




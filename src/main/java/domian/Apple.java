package domian;

/**
 * Created by jl062 on 2017/4/4.
 */
public class Apple {
    private int weigt;
    private String juice;

    public int getWeigt() {
        return weigt;
    }

    public void setWeigt(int weigt1) {
        this.weigt = weigt1;
    }

    public String getJuice() {
        return juice;
    }

    public void generateJuice() {
        this.juice = weigt / 3 + "ml的苹果汁";
    }
}




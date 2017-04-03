package domian;

/**
 * Created by jl062 on 2017/4/3.
 */
public class Juicer {

    private int size;
    private String color;
    private String material;
    private boolean electric;

    public int getSize() {
        return size;
    }

    public void setAll(int size, String color, String material, boolean electric) {
        this.size = size;
        this.color = color;
        this.material = material;
        this.electric = electric;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean getElectric() {
        return electric;
    }

    public void setElectric(Boolean electric) {
        this.electric = electric;
    }

    public String juicing(String fruit) {
        if (!this.electric) {
            return "您未通电";
        }
        return this.size + "ml的" + fruit + "汁";
    }


}

import domian.Apple;
import domian.Juicer;
import domian.Label;
import domian.Pear;

/**
 * Created by jl062 on 2017/4/3.
 */
public class Main {
    public static void main(String[] args) {
        Juicer juicerA = new Juicer();
        juicerA.setAll(800, "blue", "boli", false);
        //juicerA.setSize(800);
        //juicerA.setColor("红色");
        // juicerA.setMaterial("玻璃");
        juicerA.setElectric(true);
        System.out.println(juicerA.getColor() + "的" + juicerA.getSize() + "ml" + juicerA.getMaterial() + "榨汁机");

        Label juiceLabel = new Label();
        juiceLabel.setLabelName("一点点");
        Apple appleA = new Apple();
        appleA.setWeight(900);
        Label fruitLabel = new Label();
        fruitLabel.setLabelName("红富士");
        appleA.setFruitLabel(juiceLabel);
        System.out.println(juicerA.juicing(appleA, fruitLabel));
        Pear pear=new Pear();
        pear.setWeight(800);
        pear.setPearlabel(juiceLabel);
        System.out.println(juicerA.juicing(pear,fruitLabel));


    }
}

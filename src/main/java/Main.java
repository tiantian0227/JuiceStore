import domian.Apple;
import domian.Juicer;
import domian.Pear;

/**
 * Created by jl062 on 2017/4/3.
 */
public class Main {
    public static void main(String[] args) {
        Juicer juicerA = new Juicer();
       juicerA.setAll(800,"blue","boli",false);
        //juicerA.setSize(800);
        //juicerA.setColor("红色");
       // juicerA.setMaterial("玻璃");
        System.out.println(juicerA.getColor() + "的" + juicerA.getSize() + "ml" + juicerA.getMaterial() + "榨汁机");

       Apple appleA =new Apple();
       appleA.setWeigt(900);
        System.out.println(juicerA.juicing(appleA));
        Pear pearA=new Pear();
        pearA.setWegit(1200);
        System.out.println(juicerA.juicing(pearA));
        //通电
        juicerA.setElectric(true);
        System.out.println(juicerA.juicing(appleA));
        System.out.println(juicerA.juicing(pearA));



    }
}

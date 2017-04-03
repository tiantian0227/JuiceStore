import domian.Juicer;

/**
 * Created by jl062 on 2017/4/3.
 */
public class Main {
    public static void main(String[] args) {
        Juicer juicer = new Juicer();
//        juicer.setAll(800,"blue","boli",false);
        //juicer.setSize(800);
        //juicer.setColor("红色");
       // juicer.setMaterial("玻璃");
        System.out.println(juicer.getColor() + "的" + juicer.getSize() + "ml" + juicer.getMaterial() + "榨汁机");
        System.out.println(juicer.juicing("苹果"));

        juicer.setElectric(true);
        System.out.println(juicer.juicing("苹果"));
    }
}

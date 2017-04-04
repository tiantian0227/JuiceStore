package domian;

/**
 * Created by jl062 on 2017/4/4.
 */
public class Pear {
    private int wegit;
    private String juice;
    public void setWegit(int wegit){
        this.wegit=wegit;
    }
    public int getWegit(){
        return wegit;
    }

    public void generatejuice(){
       this.juice=wegit/2+"ml的梨汁" ;
    }
    public String getJuice(){
        return juice;
    }
}

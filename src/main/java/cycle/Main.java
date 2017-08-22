package cycle;

/**
 * Created by Administrator on 2017/7/21.
 */
/*public class Main {
    public static void main(String args[]){
        int x=10;
        while (x<20){
            System.out.print("value of x :"+x);
            x++;
            System.out.print("\n");
        }
    }
}*/

/* 直角三角形
public class Main {
    public static void main(String args[]){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                int sum = i * j;
                System.out.print(i +"*"+ j + "=" + sum +"\t");
            }
            System.out.println();
        }
    }
}
*/

/*倒直角三角形
public class Main {
    public static void main(String args[]){
    for (int i=9;i>=1;i--){
        for(int j=1;j<=i;j++){
            int sum=i*j;
            System.out.print(i+"*"+j+"="+sum+"\t");
            }
            System.out.println();
        }
    }
}*/
public class Main{
    public static void main(String args[]){
        for (int i=1;i<=9;i++){
            for (int j=9;j>=1;j--){
                if(j<=i){
                    int sum=i*j;
                    System.out.print(i+"*"+j+"="+sum+"\t");
                }
                else{
                    System.out.print("\t\t");
                }
            }
            System.out.println();
        }
    }

}
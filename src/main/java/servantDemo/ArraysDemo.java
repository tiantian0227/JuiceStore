package servantDemo;
import java.util.*;
/**
 * Created by Administrator on 2017/8/9.
 */
public class ArraysDemo {
    public static void main(String[] args)
    {
        int[] arr=new int[]{-1,-2,3,4,1,2,8};
        Arrays.sort(arr);
        String ret=Arrays.toString(arr);
        System.out.println(ret);
    }

}

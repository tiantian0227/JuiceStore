package cycle;

/**
 * Created by Administrator on 2017/7/25.
 */
public class BubbleSort {
    public static void main(String args[]){
        int arr[]={3,2,1,5,9,8,6,7};
        System.out.println("排序前数组为：");
        for(int num:arr){
            System.out.print(num+"\t");
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    }
                }

            }
        System.out.println();
        System.out.println("排序后的数组为：");
        for (int num : arr) {
            System.out.print(num + "\t");
        }
    }
}

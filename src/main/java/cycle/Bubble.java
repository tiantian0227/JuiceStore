package cycle;

/**
 * Created by Administrator on 2017/7/26.
 */
public class Bubble {
    public static void main(String args[]) {
        int arr[] = {3, 2, 1, 5, 9, 8, 6, 7};
        System.out.println("排序前数组为：");
        for (int num : arr) {
            System.out.print(num + "\t");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
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

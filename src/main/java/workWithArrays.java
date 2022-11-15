import java.util.Arrays;

public class workWithArrays {
    public static void main(String[] args) {
        int[] arr = {9, 6, 7, 3, 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        int[][] arr2 = {{1, 2, 3}, {44, 67, 8}, {23234, 67, 6789, 879, 78}};
        System.out.println(Arrays.deepToString(arr2));
        Arrays.sort(arr);
        System.out.println("Sort array " + Arrays.toString(arr));

        System.out.println("--------");

        int[] arr5 = new int[13];
        System.out.println(arr5[0]);
    }
}

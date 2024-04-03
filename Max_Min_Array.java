public class Max_Min_Array {
    public static void main(String[] args) {
        int[] arr1 = {31, -2, 73, 215, 243, 14, 5, 23, 2, 156};
        int max = arr1[0];
        int min = arr1[0];
        for (int j : arr1) {
            if (max < j) {
                max = j;
            }
            if (min > j) {
                min = j;
            }
        }
        System.out.println(" Maximum number :" + max);
        System.out.println(" Minimum number :" + min);
        }
    }


package estu.edu;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, -3, 5, 56, -34, 46,98,-12,103};
        System.out.println(findMax(array));
    }

    public static int findMax(int[] array) {
        int maxValue = 0;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i + 1]) {
                maxValue = array[i];
            }else{
                maxValue = array[i+1];
            }
        }
        return maxValue;
    }
}

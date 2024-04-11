package Programs;

public class Third_Largest {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3};
        System.out.print(thirdLargest(array));
    }

    private static int thirdLargest(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] != max) {
                thirdMax = secondMax;
                secondMax = array[i];
            } else if (array[i] > thirdMax && array[i] != max && array[i] != secondMax) {
                thirdMax = array[i];
            }
        }
        return thirdMax;
    }
}

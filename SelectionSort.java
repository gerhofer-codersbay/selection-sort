import java.util.Arrays;

class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {33, 12, 5, -4, 8, -12, 187};
        System.out.println(Arrays.toString(numbers));
        int startOfUnsorted = 0;

        while(startOfUnsorted < numbers.length) {
            // find local minimum
            int myMinimumIndex = startOfUnsorted;
            int myMinimum = numbers[myMinimumIndex];
            for (int i = startOfUnsorted; i < numbers.length; i++) {
                if (numbers[i] < myMinimum) {
                    myMinimum = numbers[i];
                    myMinimumIndex = i;
                }
            }

            // switch myMinumIndex with startOfUnsorted
            int oldFirst = numbers[startOfUnsorted];
            int newFirst = numbers[myMinimumIndex];
            numbers[myMinimumIndex] = oldFirst;
            numbers[startOfUnsorted] = newFirst;
            System.out.println(Arrays.toString(numbers));

            startOfUnsorted++;
        }
    }
}

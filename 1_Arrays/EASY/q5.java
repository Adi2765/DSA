public class q5 {
    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};

        int[] temp = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        // Merge both arrays
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                temp[k++] = arr1[i++];
            } else {
                temp[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1
        while (i < arr1.length) {
            temp[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2
        while (j < arr2.length) {
            temp[k++] = arr2[j++];
        }

        // Print result
        for (int x : temp) {
            System.out.print(x + " ");
        }
    }
}

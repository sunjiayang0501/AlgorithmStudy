public class SelectionSort {
    private SelectionSort(){}

    public static <E extends Comparable<E>> void sort(E[] arr){
        // arr[0, i) is sorted, arr[i, n) is unsorted
        for (int i = 0; i < arr.length; i++){
            int minIndex = i;
            for (int j = i; j < arr.length; j++){
                if (arr[j].compareTo(arr[minIndex]) < 0){
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    private static <E> void swap(E[] arr, int i, int minIndex){
        E t = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = t;
    }
}

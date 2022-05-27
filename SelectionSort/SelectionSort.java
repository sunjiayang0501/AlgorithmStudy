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

    public static <E extends Comparable<E>> void sort2(E[] arr){
        // arr[0, i) is unsorted, arr[i, n) is sorted
        for (int i = arr.length - 1; i > 0; i--){
            int maxIndex = i;
            for (int j = i; j > 0; j--){
                if (arr[j].compareTo(arr[maxIndex]) > 1){
                    maxIndex = j;
                }
            }
            swap(arr, i, maxIndex);
        }
    }

    private static <E> void swap(E[] arr, int i, int Index){
        E t = arr[i];
        arr[i] = arr[Index];
        arr[Index] = t;
    }
}
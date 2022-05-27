public class SortingHelper {
    private SortingHelper(){}

    public static <E extends Comparable<E>> boolean isSorted(E[] arr){
        for (int i = 1; i < arr.length; i++){
            if (arr[i - 1].compareTo(arr[i]) > 0){
                return false;
            }
        }
        return true;
    }

    public static <E extends Comparable<E>> void sortTest(String algoName, E[] arr){
        long startTime = System.nanoTime();
        if (algoName.equals("SelectionSort")){
            SelectionSort.sort(arr);
        }
        long endTime = System.nanoTime();
        double time = (endTime - startTime) / 1000000000.0;

        if (!SortingHelper.isSorted(arr)){
            throw new RuntimeException(algoName + " failed");
        }

        System.out.printf("%s , n = %d: %f s%n", algoName, arr.length, time);
    }
}

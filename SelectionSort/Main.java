public class Main {
    public static void main(String[] args){
        int[] arr = {8, 2, 7, 1, 9, 3, 6, 5, 4};
        SelectionSort.sort(arr);
        for (int m: arr){
            System.out.println(m + " ");
        }
        System.out.println();
    }
}
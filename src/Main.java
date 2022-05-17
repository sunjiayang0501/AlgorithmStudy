public class Main {
    public static void main(String[] args) {
        int[] data = {24, 18, 12, 9, 16, 66, 32, 4};
        // Target does exist
        int res = LinearSearch.search(data, 16);
        System.out.println(res);
        // Target does not exist
        int res2 = LinearSearch.search(data, 100);
        System.out.println(res2);
    }
}

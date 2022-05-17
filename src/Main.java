public class Main {
    public static void main(String[] args) {
        int n = 100000;
        Integer[] data = ArrayGenerator.generateOrderedArray(n);
        // Target does exist
        int res = LinearSearch.search(data, 16);
        System.out.println(res);
        // Target does not exist
        long startTime = System.nanoTime();
        for(int k = 0; k < 100; k++) {
            int res2 = LinearSearch.search(data, n);
        }
        long endTime = System.nanoTime();
        double time = (endTime - startTime)/1000000000.0;
        System.out.println("n = "+ n + ", 100 runs: "+ time + "s");
        // Customized class
        Student[] students = {new Student("Doris"), new Student("Krystal"), new Student("Maria")};
        Student maria = new Student("maria");
        int res3 = LinearSearch.search(students, maria);
        System.out.println(res3);

    }
}

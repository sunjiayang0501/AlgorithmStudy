public class Main {
    public static void main(String[] args){
        Integer[] arr = {8, 2, 7, 1, 9, 3, 6, 5, 4};
        SelectionSort.sort(arr);
        for (int e: arr){
            System.out.print(e + " ");
        }
        System.out.println();

        Student[] students = {new Student("Maria", (float) 3.6),
                new Student("Krystal", (float) 3.5), new Student("Kimberly", (float) 3.85),
                new Student("Doris", (float) 3.1)};
        SelectionSort.sort(students);
        for (Student student: students){
            System.out.print(student + " ");
        }
        System.out.println();
    }
}
import java.util.Arrays;

public class Zad2 {
    public static void main(String[] args) {

        int tablica = 0;
        if (args.length > 0) {
            tablica = Integer.parseInt(args[0]);
        }else {
            System.out.println("nie podano argumentów programu");
            System.exit(-1);
        }
        int arr []= new int[tablica];

        fill(arr);
        show(arr);
        reverse(arr);
        show(arr);


    }
    static void show(int[]arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i != (arr.length) -1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    static void fill(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i +1;
        }
    }
    static void reverse(int[]arr){
        int[]tmp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = tmp[arr.length - 1  - i];
        }
    }
}

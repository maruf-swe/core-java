package arrays;

import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array1 = new int[size];
        for (int i = 0; i < size; i++) {
            array1[i] = sc.nextInt();
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }


    }
}

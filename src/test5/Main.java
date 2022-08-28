package test5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        // put your code here
////            int n = scanner.nextInt();
////            int k = scanner.nextInt();
////            System.out.println(k % n);
//        String str = "Hel" + "l" + 'o';
//        System.out.println("str="+str);
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//
//        int sum = 0;
//        for (int i = a; i <= b; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum);

        System.out.println("Introduceti numarul de elemente pentru array");
        int p = scanner.nextInt();
        int[] array = null;
        for (int i = 0; i<p; i++){
            System.out.println("Introduceti elementul de pe pozitia "+i);
            int k = scanner.nextInt();
            array[i] = k;
        }

        for (int l: array){
            System.out.println("l="+l);
        }

    }




}


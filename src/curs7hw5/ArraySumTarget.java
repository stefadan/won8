package curs7hw5;

import java.util.Arrays;

public class ArraySumTarget {
    public static void main(String[] args) {

        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;
        getTwoPairs(arr, target);
        getThreePairs(arr, target);
    }

    public static void getTwoPairs(int arr[], int target) {
        int n = arr.length;
        if (n < 2) {
            return;
        }
        //sortare vector
        Arrays.sort(arr);
        // variabile in care se retin indecsii de la stanga si dreapta (l pentru inceput si r pentru sfarsitul vectorului)
        int l = 0, r = n - 1;
        /*cat timp l <  r
        verificam daca arr[l] + arr[r] = target
        daca da printare pereche si incrementam pozitiile de inceput si sfarsit l++, r–-
        daca arr[l] + arr[r] < target, suma < target, facem r–-
        daca arr[l] + arr[r] > target,suma > target , facem l++
        */
        while (l < r) {
            //System.out.println("l="+l);
            //System.out.println("r="+r);
            int currentSum = arr[l] + arr[r];
            if (currentSum == target) {
                System.out.println(
                        String.format("Perechi: %d %s %d %s %d" ,
                                        target, " = ", arr[l], "+", arr[r] ));

                l++;
                r--;
            } else if (arr[l] + arr[r] < target)
                l++;
            else
                r--;
        }
    }

    public static void getThreePairs(int arr[], int target) {
        int n = arr.length;
        if (n < 3) {
            return;
        }
        //sortare vector
        Arrays.sort(arr);
        // variabile in care se retin indecsii de la stanga si dreapta (l pentru inceput si r pentru sfarsitul vectorului)
        int l, r;
        for (int i = 0; i < n - 2; i++) {
            l = i + 1;
            r = n - 1;
            while (l < r) {
                if (arr[i] + arr[l] + arr[r] == target) {
                    System.out.println(
                            String.format("Tripleta: %d %s %d %s %d %s %d" ,
                                    target, " = ", arr[i], "+", arr[l], "+", arr[r] ));

                    l++; r--;
                } else if (arr[i] + arr[l] + arr[r] < target)
                    l++;
                else // arr[i] + arr[l] + arr[r] > target
                    r--;
            }
        }
    }

}


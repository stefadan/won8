package curs8hw3;
import java.util.Scanner;
import java.util.Arrays;
public class Minmax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Numar randuri: ");
        int row = input.nextInt();
        System.out.print("Numar coloane: ");
        int columns = input.nextInt();
        int[][] nums = new int[row][columns];//utilizam un tablou bidimensional pentru lista de liste

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Insert element pozitia: " + (j + 1) + ": ");
                nums[i][j] = input.nextInt();
                System.out.println(String.format("Element %d", nums[i][j]));
            }
            System.out.println("\n");
        }

        //int[][] nums = {{4, 2, 7}, {3, 4, 6}};
        //int[][] nums = {{3, 9, 3, 5}, {4, 19, 4, 9}, {2, 10, 5, 6}};

        int[] result = new int[nums.length]; //Array cu vectorul de valori maxime de pe fiecare linie
        for(int i=0; i<nums.length; i++) { //parcurgere linii
            int max = 0;
            for(int j=0; j<nums[0].length; j++) { //coloane
                //System.out.println(nums[i][j]);
                if(nums[i][j] > max) {
                    max = nums[i][j];
                }
            }
            result[i] = max;
        }
        System.out.println("Maximul pentru fiecare linie "+Arrays.toString(result));
        System.out.println("Minimul "+getMin(result, result.length) );
    }

    static int getMin(int arr[], int n)
    {
        int res = arr[0];
        for (int i = 1; i < n; i++) {
            res = Math.min(res, arr[i]);
        }
        return res;
    }


}

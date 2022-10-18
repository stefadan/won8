package acurs12;

import java.util.Scanner;

public class IntTools {
    int p;

    public IntTools(int p) {
        this.p = p;
    }

    public int digitSum() throws RuntimeException{
        int sum = 0;
        if (p==0) {
            throw new RuntimeException();
        }
        int num = p;
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

    public int lastDigit(){
        return p%10;
    }

    public int digitAt(int position) throws IndexOutOfBoundsException{
        String str = String.valueOf(p);
        if (position < 0 || position > str.length()) {
            throw new StringIndexOutOfBoundsException (position);
        }
        return Integer.parseInt(str.substring(position, position+1));

    }

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Va rugam intrduceti numarul:");
            int numar = scanner.nextInt();
            IntTools it = new IntTools(numar);

            int res = it.digitSum();
            System.out.println(String.format("Suma cifrelor %d", res));

            int ld = it.lastDigit();
            System.out.println("Last digit="+ld);

            System.out.println("Va rugam scrieti pozitia:");
            int pos = scanner.nextInt();

            int charPos = it.digitAt(pos);
            System.out.println("Caracterul este "+ charPos);

        }
        catch (IndexOutOfBoundsException exp){
            System.out.println("Err."+exp.getMessage());
        }
        catch (RuntimeException exp){
            System.out.println("Eroare "+exp.getMessage());
        }
        finally {

        }


    }

}

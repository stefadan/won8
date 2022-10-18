package acurs12;

import java.time.LocalDate;
import java.util.Scanner;

public class BirthYearCalculator{

    int varsta(int v) throws VarstaException{
        if(v<0){
            throw new VarstaException("Varsta "+v+" nu poate fi negativa");
        }

        LocalDate ld = LocalDate.now();
        int an = ld.getYear();
        System.out.println("an nastere "+ (an-v) );
        return an-v;
    }

    public static void main(String[] args){
        BirthYearCalculator byc = new BirthYearCalculator();
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Va rugam scrieti varsta:");
            int varsta = scanner.nextInt();
            byc.varsta(varsta);

        } catch (VarstaException exp) {
            System.out.println(exp.getMessage());
        } finally {

        }



    }


}


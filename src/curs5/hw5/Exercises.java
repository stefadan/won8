package curs5.hw5;

//1) scrieti o functie care primeste un sir de numere intregi si returneaza suma lor
//2) scrieti o functie care primeste un sir de numere intregi si returneaza numarul de elemente impare
//3) scrieti o functie care primeste un sir de numere intregi si un alt numar intreg.
// Returnati toate numerele mai mari decat numarul primit
//4) scrieti o functie care primeste un numar intreg reprezentand targetul de donatii.
// Donatiile se vor face cu ajutorul obiectului Random. Primim donatii pana cand ajungem la suma dorita. Cand ajungem la suma dorita afisam un mesaj de succes.
//5) rescrieti functia de la 4 cu urmatoarea modificare: functia va primi si un numar maxim de donatii. Cand acesta se termina, campania se va incheia
//6) scrieti o functie care primeste un string cu o fraza (mai multe propozitii despartite prin punct). Printati fiecare propozitie pe o linie noua

import java.util.Random;

public class Exercises {

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 8, -6, 4, -3};
        System.out.println("Suma=" + sum(arr));
        System.out.println("Numarul de numere impare=" + numImpare(arr));
        int q = 4;
        numMaiMariDecatNumarDat(arr, q);
        int target = 10000;
        targetDonatii(target);
        int nrMax = 10;
        targetDonatiiNumarMaxim(target, nrMax);
        //Test
        String fraza = "Afara este soare.Devreme a plouat.Se anunta o noapte frigurosa.Vine toamna.";
        afisarePropozitii(fraza);


        }

    //1) scrieti o functie care primeste un sir de numere intregi si returneaza suma lor
    public static int sum(int[] arr) {
        int suma = 0;
        for (int p : arr) {
            suma = suma + p;
        }
        return suma;

    }

    //2) scrieti o functie care primeste un sir de numere intregi si returneaza numarul de elemente impare
    public static int numImpare(int[] arr) {
        int num = 0;
        for (int p : arr) {
            if (p % 2 == 0) {
                num = num + 1;
            }
        }
        return num;

    }

    //3) scrieti o functie care primeste un sir de numere intregi si un alt numar intreg.
    // Returnati toate numerele mai mari decat numarul primit
    public static void numMaiMariDecatNumarDat(int[] arr, int q) {
        for (int p : arr) {
            if (p > q) {
                System.out.println("Gasit > " + q + " elementul = " + p);
            }
        }
    }

    //4) scrieti o functie care primeste un numar intreg reprezentand targetul de donatii.
    // Donatiile se vor face cu ajutorul obiectului Random. Primim donatii pana cand ajungem la suma dorita.
    // Cand ajungem la suma dorita afisam un mesaj de succes.

    public static void targetDonatii(int target) {
        int sum = 0;
        //int donat = 0;
        int _a = 0;
        Random random = new Random();
        while (sum <= target) {
            int donat = random.nextInt(target);
            System.out.println("Suma donata=" + donat);
            sum = sum + donat;
        }
        System.out.println("Suma donatiilor " + sum + " a atins  sau depasit targetul " + target);
    }

    //5) rescrieti functia de la 4 cu urmatoarea modificare: functia va primi si un numar maxim de donatii.
    // Cand acesta se termina, campania se va incheia
    public static void targetDonatiiNumarMaxim(int target, int max) {
        int sum = 0;
        int donatie = 0;
        int nrDonatii = 0;
        Random random = new Random();
        while (nrDonatii <= max) {
            nrDonatii++;
            donatie = random.nextInt(target);
            System.out.println("Suma donata=" + donatie + " Numar donatie " + nrDonatii);
            sum = sum + donatie;
        }
        System.out.println("Numar total donatii efectuate " + nrDonatii + " suma donata " + sum);
    }

    //6) scrieti o functie care primeste un string cu o fraza (mai multe propozitii despartite prin punct).
    // Printati fiecare propozitie pe o linie noua

    public static void afisarePropozitii(String fraza) {
        String[] propozitii = fraza.split("\\.");
        for (String s: propozitii){
            System.out.println(s+".");
        }
    }
}

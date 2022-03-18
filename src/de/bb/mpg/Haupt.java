package de.bb.mpg;

import java.util.ArrayList;
import java.util.List;

public class Haupt {

    private void manipuliereArray() {
        // TODO: Aufgabe 1
        int[] meinArray = {3, 7, -6, 12, 124, 42};
        System.out.println(meinArray[0]);
        System.out.println(meinArray[2]);
        System.out.println(meinArray[5]);

        int summe = 0;

        for (int i = 0; i < 3; i++) {
            summe += meinArray[i];
        }

        System.out.println("Summe: " + summe);

        vertauscheZweiImArray(meinArray, 3, 5);
        for (int i : meinArray) {
            System.out.println(i);
        }
    }

    private void manipuliereListe() {
        // TODO: Aufgabe 2
        List<Integer> meineListe = new ArrayList<Integer>();
        meineListe.add(8);
        meineListe.add(21);
        meineListe.add(-12);
        meineListe.add(154);
        meineListe.add(2);
        meineListe.add(42);

        System.out.println(meineListe.get(0));
        System.out.println(meineListe.get(2));
        System.out.println(meineListe.get(5));

        int summe = 0;

        for (int i = 3; i < 6; i++) {
            summe += meineListe.get(i);
        }

        System.out.println("Summe: " + summe);
    }

    /**
     * Vertauscht die Einträge bei indexA und indexB in der Liste.
     */
    private void vertauscheZweiInListe(List<Integer> liste, int indexA, int indexB) {

    }

    /**
     * Vertauscht die Einträge bei indexA und indexB im Array.
     */
    private void vertauscheZweiImArray(int[] array, int indexA, int indexB) {
        int elementA = array[indexA];

        array[indexA] = array[indexB];
        array[indexB] = elementA;
    }

    public static void main(String[] args) {
        Haupt haupt = new Haupt();
        haupt.manipuliereArray();
        //haupt.manipuliereListe();
    }
}

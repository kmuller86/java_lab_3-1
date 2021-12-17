import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */

        Student[] students = new Student [3];

        Student b1 = new Student();

        Student b2 = new Student();

        Student b3 = new Student();

        b1.Imie = "Szymon";

        b1.Nazwisko = "Dressler";

        b1.age = 29;
        b1.young = true;

        b1.displayInfo();

        b2.Imie = "Janusz";

        b2.Nazwisko = "Palikot";

        b2.age = 21;

        b2.young = true;

        b2.displayInfo();

        b3.Imie = "Mateusz";

        b3.Nazwisko = "Byku";

        b3.age = 34;

        b3.young = true;

        b3.displayInfo();



        for (int i = 0;i >= students.length;++i){

            System.out.println(students.length);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */
        Polskie_Kluby team = new Polskie_Kluby("Arka Gdynia", "1929", 123.1);
        System.out.println(team.toString());
        Polskie team2 = new Team("Lech Poznan", "1920", 116.6);
        System.out.println(team2.toString());
        List<Polskie_Kluby> footballteam = new ArrayList<>();
        footballteam.add(team);
        footballteam.add(team2);
        System.out.println(footballteam);
        Object team3 = new Polskie_Kluby("Cracovia", "1906", 111,4);
        System.out.println("\n" + team3.toString());
        Object team4 = new Polskie_Kluby("Radomiak Radom", "1910", 101.6);
        System.out.println(team4.toString());
    }
}

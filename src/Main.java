import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //losuj 10 liczb do tablicy
        int[] TablicaWylosowanychLiczb = LosujLiczbyDoTablicy(5);

        //wypisz elementy tablicy
        wypisz(TablicaWylosowanychLiczb);
        System.out.println();

        //losuj 30 liczb z zakresu 1,40 bez powtorzen

        ArrayList<Integer> wylosowaneLiczby = wylosujLiczbyBezPowtorzenDoListy(30);
        wypisz(wylosowaneLiczby);

    }
    private static ArrayList<Integer> wylosujLiczbyBezPowtorzenDoListy(int ileLiczb){
        ArrayList<Integer> liczbyWylosowane = new ArrayList<>();
        //nie musi być znany rozmiar listy
        // może być zmieniony w trakcie działania programua
        //w każdej kolekcji tylko typy złożone
        //typ zlozony pisany wielką literą

        Random random = new Random();
        for (int i = 0; i < ileLiczb; i++) {
            int liczba = random.nextInt(40)+1;
            while(liczbyWylosowane.contains(liczba)){
                liczba = random.nextInt(40)+1;
            }
            liczbyWylosowane.add(random.nextInt(40)+1);
        }
        return liczbyWylosowane;
    };
    private static void wypisz(int[] tablica){
        System.out.println("Wylosowana tablica:");
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i] + " ");

        }
    }

    private static void wypisz(ArrayList<Integer> lista){
        System.out.println("Wypisana lista:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i)+", ");
        }
    }

    private static int[] LosujLiczbyDoTablicy(int ileLiczb){
        int[] liczbyWylosowane = new int[ileLiczb];
        Random random = new Random();
        for (int i = 0; i < liczbyWylosowane.length; i++) {
            liczbyWylosowane[i] = random.nextInt(100)+1;
        }

        return liczbyWylosowane;
    }
}
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String film1 = "film1 w sali nr 1";
        String film2 = "film2 w sali nr 2";
        String godz1 = "16.00";
        String godz2 = "16.30";
        String godz3 = "18.00";
        String godz4 = "18.30";
        String filmKino = null;
        String filmGodzina = null;
        Scanner in = new Scanner(System.in);
        //repertuar
        System.out.println("\n"
                + "* REPERTUAR na PONIEDZIAŁEK            \n"
                + "* " + godz1 + " " + film1 + "                     \n"
                + "* " + godz2 + " " + film2 + "                    \n"
                + "* " + godz3 + " " + film1 + "                     \n"
                + "* " + godz4 + " " + film2 + "                     \n"
                + "****************************************");
        System.out.println();
        System.out.println("-----------Wybierz film-----------\n"
                + "->Kliknij 1, żeby wybrać film1\n"
                + "->Kliknij 2, żeby wybrać film2\n");
        int film = in.nextInt();

        if (film == 1) {
            filmKino = "film1 w sali nr 1";
        }
        if (film == 2) {
            filmKino = "film2 w sali nr 2";
        }

        System.out.println();
        System.out.println("-----------Wybierz godzinę-----------");
        int godzina = in.nextInt();
        if (godzina == 16 || godzina == 16.00) {
            filmGodzina = "16.00";
        }
        if (godzina == 16.30) {
            filmGodzina = "16.30";
        }
        if (godzina == 18 || godzina == 18.00) {
            filmGodzina = "18.00";
        }
        if (godzina == 18.30) {
            filmGodzina = "18.30";
        }


        //wybór miejsca w sali kinowej
        SalaKinowa salaKinowa1 = new SalaKinowa();
        salaKinowa1.getSala();
        salaKinowa1.piszTab();

        System.out.println("Podaj nr miejsca");
        int miejsce = in.nextInt();
        int[][] salaKinowa1BlokMiej = BlokowanieMiejsc.blokowanieMiejsc(salaKinowa1.getSala(), miejsce);
        //salaKinowa1.piszTab();

        System.out.println("Czy widz opłacił bilet? TAK wpisz 0, NIE wpisz 1");
        int kasa = in.nextInt();
        if (kasa == 0) {
            System.out.println("Bilet na " + filmKino + " o godzinie " + filmGodzina + ". Wybrane miejsca to: nr " + miejsce);
        }
        if (kasa == 1) {
            System.out.println("Brak płatności - nie można wygenerować biletu");
        }
    }
}












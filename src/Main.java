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

        Scanner in = new Scanner(System.in);
        //repertuar
        System.out.println("\n"
                + "* REPERTUAR na PONIEDZIAŁEK            \n"
                + "* " + godz1 +" "+ film1 + "                     \n"
                + "* " + godz2 +" "+ film2 + "                    \n"
                + "* " + godz3 +" "+ film1 + "                     \n"
                + "* " + godz4 +" "+ film2 + "                     \n"
                + "****************************************");
        System.out.println();
        System.out.println("-----------Wybierz film-----------\n"
                + "->Kliknij 1, żeby wybrać film1\n"
                + "->Kliknij 2, żeby wybrać film2\n");
        int film = in.nextInt();
        if (film == 1) {
            System.out.println(film1);
        }
        if (film == 2) {
            System.out.println(film2);
        }

        System.out.println();
        System.out.println("-----------Wybierz godzinę-----------");
        int godzina = in.nextInt();
        if (godzina == 16 || godzina == 16.00) {
            System.out.println(godz1);
        }
        if (godzina == 16.30) {
            System.out.println(godz2);
        }
        if (godzina == 18 || godzina == 18.00) {
            System.out.println(godz3);
        }
        if (godzina == 18.30) {
            System.out.println(godz4);
        }


        //wybór miejsca w sali kinowej
        SalaKinowa salaKinowa1 = new SalaKinowa();
        salaKinowa1.getSala();
        salaKinowa1.piszTab();
        System.out.println("Widz może kupić maksymalnie 3 miejsca na jeden bilet");
        System.out.println("Podaj nr miejsca");
        int miejsce = in.nextInt();
        int[][] salaKinowa1BlokMiej = BlokowanieMiejsc.blokowanieMiejsc(salaKinowa1.getSala(), miejsce);
        salaKinowa1.piszTab();

        System.out.println("Podaj nr drugiego miejsca lub wciśnij 0");
        int miejsce2 = in.nextInt();

        if (miejsce == 0) {
            String bilet = "Bilet na" + film + " o godzinie" + godzina + ". Wybrane miejsca to: nr " + miejsce;
            System.out.println(bilet);
        }
        if (miejsce > 0) {
            salaKinowa1BlokMiej = BlokowanieMiejsc.blokowanieMiejsc(salaKinowa1BlokMiej, miejsce2);
            salaKinowa1.piszTab();
            System.out.println("Podaj nr trzeciego miejsca lub wciśnij 0");
            int miejsce3 = in.nextInt();
            if (miejsce == 0) {
                String bilet = "Bilet na" + film + " o godzinie" + godzina + ". Wybrane miejsca to: nr " + miejsce + " oraz " + miejsce2;
                System.out.println(bilet);
            }
            if (miejsce > 0) {
                salaKinowa1BlokMiej = BlokowanieMiejsc.blokowanieMiejsc(salaKinowa1BlokMiej, miejsce3);
                String bilet = "Bilet na" + film + " o godzinie" + godzina + ". Wybrane miejsca to: nr " + miejsce + ", " + miejsce2 + " oraz "+miejsce3;
                System.out.println(bilet);
            }
        }



    }




    }


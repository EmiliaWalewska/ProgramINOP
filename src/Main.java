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
            //repeertuar
        System.out.println("\n"
                + "* PONIEDZIAŁEK                         *\n"
                + "* "+godz1+ film1+"                     *\n"
                + "* "+godz2 + film2+"                    *\n"
                + "* "+godz3+ film1+"                     *\n"
                + "* "+godz4+ film2+"                     *\n"
                + "*                             *\n"
                + "*                             *\n"
                + "*******************************");





            //wybór miejsca w sali kinowej
            SalaKinowa salaKinowa1 = new SalaKinowa();
            salaKinowa1.getSala();
        salaKinowa1.piszTab();
        System.out.println("Podaj nr miejsca");
        int miejsce = in.nextInt();
        int [][] salaKinowa1BlokMiej = BlokowanieMiejsc.blokowanieMiejsc(salaKinowa1.getSala(), miejsce);
        salaKinowa1.piszTab();



        System.out.println("Podaj nr kolejnego miejsca lub wciśnij 0");
        int miejsce2 = in.nextInt();
        salaKinowa1BlokMiej = BlokowanieMiejsc.blokowanieMiejsc(salaKinowa1BlokMiej, miejsce2);
        salaKinowa1.piszTab();
    }








    }


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            SalaKinowa salaKinowa1 = new SalaKinowa();
            salaKinowa1.getSala1();
        salaKinowa1.piszTab();
        System.out.println("Podaj nr miejsca");
        int miejsce = in.nextInt();
        int [][] salaKinowa1BlokMiej = BlokowanieMiejsc.blokowanieMiejsc(salaKinowa1.getSala1(), miejsce);
        salaKinowa1.piszTab();



    }
    }

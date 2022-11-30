import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            SalaKinowa salaKinowa1 = new SalaKinowa();
            System.out.println(salaKinowa1.getSala1());

        System.out.println("Podaj nr miejsca");
        int miejsce = in.nextInt();

       BlokowanieMiejsc.blokowanieMiejsc(salaKinowa1, miejsce);



    }
    }

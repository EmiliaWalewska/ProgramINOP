public class SalaKinowa {
    static int[][] sala1;


    public int[][] getSala1() {
        sala1 = new int [10][10];
        generujTAB();
        piszTab(sala1);
        return sala1;
    }


    public static void piszTab(int [][] sala1) {

        for (int i = 0; i < sala1.length; i++) {
            for (int j = 0; j < sala1[i].length; j++) {
                System.out.format("%4d",sala1[i][j]);
            }
            System.out.println();
        }

    }
    public static void generujTAB(){
        int numeracja = 1;
        for (int i = 0; i < sala1.length; i++) {
            for (int j = 0; j < sala1[i].length; j++) {
                sala1[i][j] = numeracja;
                numeracja++;
            }

        }
    }
}

public class BlokowanieMiejsc {
    int miejsce;

    public static int[][] blokowanieMiejsc(int[][] salaKinowa, int nrMiejsca) {

        for (int i = 0; i < salaKinowa.length; i++) {
            for (int j = 0; j < salaKinowa[i].length; j++) {
                if (salaKinowa[i][j] == nrMiejsca) {
                    salaKinowa[i][j] = 0;
                }
            }
        }
        return salaKinowa;

    }
}



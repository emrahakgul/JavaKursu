package Day21;

public class JavaMat_soru6 {
    public static void main(String[] args) {
        // Düzensiz 2 boyutlu diziler (matrisler)
    int[][] duzensiz2d={{0,1,2},{3,4}, {5,6,7,8,9,10},{11,12,13,14,15}};

        System.out.println("0. SAtırdaki sütun sayısı: " + duzensiz2d[0].length);
        System.out.println("1. SAtırdaki sütun sayısı: " + duzensiz2d[1].length);
        System.out.println("2. SAtırdaki sütun sayısı: " + duzensiz2d[2].length);
        System.out.println("3. SAtırdaki sütun sayısı: " + duzensiz2d[3].length);

        for (int i=0; i<duzensiz2d[i].length; i++)
        {
            for (int j=0; j<duzensiz2d[i].length; j++){
                System.out.print(duzensiz2d[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

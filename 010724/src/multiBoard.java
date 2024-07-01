public class multiBoard {
    public static void main(String[] args) {
        int[][] multiply = new int[10][10];
        for (int i = 0; i < multiply.length; i ++){
            for (int j = 0; j < multiply[i].length; j++){
                multiply[i][j] = (i + 1) * (j +1);
                System.out.printf("%3d ", multiply[i][j]);
            }
            System.out.println("");
        }
    }
}

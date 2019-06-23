public class Second_dimensions {
    public static void main(String[] args) {
        int[][] arrays = new int[2][4];
        arrays[0][0] = 1;
        arrays[0][1] = 2;
        arrays[0][2] = 3;
        arrays[0][3] = 4;
        arrays[1][0] = 5;
        arrays[1][1] = 6;
        arrays[1][2] = 7;
        int i = 0;
        while (i < 2) {
            int j = 0;
            while (j < 3) {
                System.out.println(arrays[i][j]);
                j++;
            }
            i++;
        }
    }
}

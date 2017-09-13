/**
 * Created by Paolo T. Inocencion on 09/12/17.
 */


public class Solution {
    static int[][] matrix = new int[100][];

    public static void createCircle(double m) {
        double midPoint = m;
        //double midPoint = (matrix.length - 1) / 2.0;

        for (int col = 0; col < matrix.length; col++) {
            int[] row = new int[matrix.length];
            double yy = col - midPoint;
            for (int x = 0; x < row.length; x++) {
                double xx = x - midPoint;
                if ((Math.sqrt(xx * xx + yy * yy) <= midPoint) &&
                (Math.sqrt(xx * xx + yy * yy) >= midPoint - 5)) {
                    row[x] = 4;
                    System.out.print("" + row[x]);
                } else {
                    System.out.print(" ");
                }
            }
            matrix[col] = row;
            System.out.println();
        }

    }
    public static void main(String[] args) {
        createCircle(21);



    }


}




package matrixmultiplication2;

public class MatrixMultipliction2 {
    static int i,j,k;

    public static void main(String[] args) {
        int m1[][]= {{2,2},{2,2}};
        int m2[][]= {{2,2},{2,2}};
        int r[][]= new int[2][2];
        int sum=0;
        for( i=0;i<2;i++)
        {
            for(j=0; j<2; j++) {
                for (k = 0; k < 2; k++) {
                    sum = sum + m1[i][k] * m2[k][j];
                }
                r[i][j] = sum;
                sum = 0;
                System.out.print( r[i][j]+ " ");

            }
            System.out.println( );
        }
       
}}

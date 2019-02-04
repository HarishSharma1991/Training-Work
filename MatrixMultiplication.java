package matrixmultiplication;

public class MatrixMultiplication {

    public static void main(String[] args) {
        int m1[][]={{1,2,3},{4,5,6}};
       int m2[][] = {{7,8},{9,10},{11,12}};
       int r[][]= new int[2][2];
       int sum =0;
       int i,j,k;
       for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                for(k=0;k<3;k++)
                {
                    sum=sum+m1[i][k]*m2[k][j];
                }
                r[i][j]=sum;
                sum = 0;
                System.out.print(r[i][j] + " ");
            }

            System.out.println();
        }

    }
}

import java.util.*;
public class MatrixMul {
    public static void main(String args[]){
        int r1,c1,r2,c2, i,j,k;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Matrix 1 (m X n) :");
        r1 = in.nextInt();
        c1 = in.nextInt();
        int arr1[][] = new int[r1][c1];
        System.out.println("Enter Matrix 1 : ");
        for (i=0; i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                arr1[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter Matrix 2 (p X q) :");
        r2 = in.nextInt();
        c2 = in.nextInt();
        int arr2[][] = new int[r2][c2];
        System.out.println("Enter Matrix 2 : ");
        for (i=0; i<r2;i++)
        {
            for(j=0;j<c2;j++)
            {
                arr2[i][j]=in.nextInt();
            }
        }
        System.out.println("Matrix 1 X Matrix 2");
        int mul[][]= new int[r1][c2];
        if(c1==r2)
        {
            for (i=0;i<r1;i++)
            {
                for(j=0;j<c2;j++)
                {
                    mul[i][j]=0;
                    for (k=0;k<c1;k++)
                    {
                        mul[i][j]=mul[i][j]+arr1[i][k]*arr2[k][j];
                    }
                    System.out.print(" "+mul[i][j]);
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Matrix multiplication invalid");
        }
    }
}

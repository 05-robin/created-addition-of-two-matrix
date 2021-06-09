
package matrixproblem;

public class Matrixproblem {

    public static void main(String[] args) {
        int a[][]={{1,3,4},{2,4,3},{3,4,5}};
        int b[][]={{1,3,4},{2,4,3},{1,2,4}};
        int i,j;
        int arr[][] = new int[3][3];
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                arr[i][j]=a[i][j]+b[i][j];
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}

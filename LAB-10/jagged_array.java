import java.util.*;
public class jagged_array
{
    public static void main(String[] args) {
        int sum=0;
        Scanner scan= new Scanner (System.in);
        int a[][]=new int[3][];
        a[0]= new int[4];
        a[1]= new int[3];
        a[2]= new int [1];
        System.out.println("enter the elements");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=scan.nextInt();
            }
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                 sum+=a[i][j];
            }
        }

        System.out.println("the sum is:"+sum);

    }
}
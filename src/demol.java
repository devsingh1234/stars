import java.util.Scanner;

public class demol {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        int s = 0;
        int rows = (2 * g) - 1;
        for (int i=1; i <= rows ;i++)
        {
            if (i<=g) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            }
             else{
                 for (int j =1 ; j<=rows-i+1; j++)
                 {
                     System.out.print("*");
                 }
             }
            System.out.println();

            }


        }



    }








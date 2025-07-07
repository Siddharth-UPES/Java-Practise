import java.util.Scanner;

public class Loop_Patern {
    public static void main(String[] args) {


        int row=0;
        while(row<5) {
            System.out.print("*");
            int i=0;
            while (i<row){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row++;
        }
    }
}

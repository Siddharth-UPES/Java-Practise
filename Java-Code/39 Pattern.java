import java.util.Scanner;

class Pattern
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("pattern show\n");
        System.out.println("Enter the number of rows: ");
        int rows=s.nextInt();
        RightHalfPyramid(rows);
        System.out.println("\n");
        Reverse_Righthalf_Pyramid(rows);
        Left_Half_Pyramid(rows);
    }
    public static void RightHalfPyramid(int MaxRows1)
    {
        System.out.println("Right half Pyramid");
        int num=0;
        while (num<MaxRows1) {
            System.out.print("*");
            int i = 0;
            while (i < num) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            num++;
        }
    }
    //by own
//    public static void Reverse_RightHalf_Pyramid(int MaxRows2){
//        int num=0;
//        while (num<MaxRows2){
//            System.out.print("*");
//            int i=MaxRows2-1;
//            while(i>num){
//                System.out.print(" *");
//                i--;
//            }
//            System.out.println();
//            num++;
//        }
//        System.out.println("Reverse right half pyramid");
//    }
    public static void Reverse_Righthalf_Pyramid(int maxRows2){
        System.out.println("Reverse Right half Pyramid");
        int num=maxRows2;
        while(num>0){
            int i=0;
            while (i<num){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            num--;
        }
    }
    public static void Left_Half_Pyramid(int MaxRows3){
        System.out.println("Left Half Pyramid");
        int num=MaxRows3;
        while(num>0){
            int j=0;
            // print spaces
            while(j<num-1){
                System.out.print("  ");
                j++;
            }
            //print stars
            int i=0;
            while(i<=(MaxRows3-num)){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            num--;
        }
    }
}

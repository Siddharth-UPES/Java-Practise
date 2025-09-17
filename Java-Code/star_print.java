//public class star_print {
//    public static void main(String[] args) {
//        int rows=0;
//        while(rows<5){
//            System.out.print("*");
//            int i=0;
//            while (i<rows){
//                System.out.print(" *");
//                i++;
//            }
//            System.out.println(" ");
//            rows++;
//        }
//    }
//}


public class star_print
{
    public static void main(String[] args)
    {
        int rows=5;
        int i=1;
        while(i<=rows)
        {
            int j=0;
            while(j<rows-i)
            {
                System.out.print("  ");
                j++;
            }
            int k=0;
            while(k<i)
            {
                System.out.print("* >>");
                k++;

            }
            System.out.println();
            i++;
        }
    }
}
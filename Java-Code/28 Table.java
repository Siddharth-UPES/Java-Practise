import java.util.Scanner;

class Table {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("lets Go for the table Printing\n");
        System.out.println("Enter the number which able u have to show: ");
        int table=s.nextInt();
        int i=1;
        while (i<=10){
            System.out.println(table+"*"+i+"="+(table*i));
            i++;
        }
    }
}

//import java.util.Scanner;
//
//class Table{
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        System.out.println("lets go to show table\n");
//        System.out.println("Enter the number: ");
//        int num=s.nextInt();
//        multiplicationTable(num);
//    }
//
//    public static void multiplicationTable(int num){
//        int i=1;
//        while(i<=10){
//            System.out.println(num+"x"+i+"="+(num*i));
//            i++;
//        }
//    }
//}
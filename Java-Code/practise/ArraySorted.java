//public class ArraySorted {
//    public static void main(String[] args) {
//        int[] arr={10,20,84,50};
//
//        boolean flag=arraySort(arr);
//        System.out.println(flag);
//    }
//    public static boolean arraySort(int[] arr){
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]>arr[i+1]) return false;
//        }
//        return true;
//    }
//}


import java.util.Scanner;

public class ArraySorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.print("Enter the elements fo array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array Elemnts  : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
//        arraySort(arr);
        System.out.println("Sorted Cheked : "+arraySort(arr));

    }
    static boolean arraySort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
}
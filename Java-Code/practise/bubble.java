//public class bubble {
//    public static void main(String[] args) {
//        int[] arr={1,4 ,2 ,5 ,3,8,9,56,90,87};
//        booleanSort(arr);
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//    public static void booleanSort(int[] arr){
//        for (int j=0;j<arr.length-1;j++) {
//            for (int i = 0; i < arr.length - 1; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }
//    }
//}


import java.util.Scanner;

public class bubble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of an array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.print("Enter the element of an array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements of an array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        bubble(arr);
        System.out.print("Sorted Array : ");

        for (int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void bubble(int[] arr){
        for(int j=0;j<arr.length-1;j++){
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
}

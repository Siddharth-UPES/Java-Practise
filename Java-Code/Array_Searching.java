import java.util.Scanner;

public class Array_Searching {
    public static void main(String[] args) {
        int[] arr={3,6,9,667,45,23,56,78,90,70};
        Scanner s=new Scanner(System.in);
        System.out.println("Array Searching\n");
        System.out.println("Enter the number you want to search: ");
        int num=s.nextInt();
        boolean isFound=isFound(num,arr);
        if(isFound){
            System.out.println("Your array element is found");
        }
        else {
            System.out.println("Your element is not found");
        }
    }
    public static boolean isFound(int num,int[] arr){
        int index=0;
        while(index<arr.length){
            if(arr[index]==num){
                return true;
            }
            index++;
        }
        return false;
    }
}

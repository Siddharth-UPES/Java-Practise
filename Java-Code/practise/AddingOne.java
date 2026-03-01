import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AddingOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of the element : ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.print("Enter element for an Array: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements of an Array : ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        ArrayList<Integer> Final=Adding(arr);
//        for (int i=0;i<n;i++){
//        }
//        System.out.println(Final+" ");
        for (int ele:Final){
        }
        System.out.println(Final+" ");
    }
    public static ArrayList<Integer> Adding(int[] arr) {
        ArrayList<Integer> ans =new ArrayList<>();
        int carry=1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]+carry<=9){
                ans.add(arr[i]+carry);
                carry=0;
            }
            else {
                ans.add(0);
                carry=1;
            }
        }
        if(carry==1) ans.add(1);
        Collections.reverse(ans);
        return ans;
    }
}

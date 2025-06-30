import java.util.Scanner;

class Array_Utility {

    public static int[] inputArray() {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter the number of elements : ");
        int size=s.nextInt();
        int[] num=new int[size];
        int i=0;
        while(i<size){
            System.out.print("Entered element number for the Array: "+(i+1)+": ");
            num[i]=s.nextInt();
            i++;
        }
        return num;
    }
    public static void displayArray(int[] numArr){
        int i=0;
        while(i<numArr.length){
            System.out.print(numArr[i]+" ");
            i++;
        }
        System.out.println();
    }
    public static int[][] input2D_Array(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows =s.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns=s.nextInt();
        int[][] numArray =new int[rows][columns];

        int i=0;
        while(i<rows){
            int j=0;
            while(j<columns){
                System.out.print("Please enter the  element row"+(i+1)+", column: "+(j+1)+" :");
                numArray[i][j]=s.nextInt();
                j++;
            }
            i++;
        }
        return numArray;
    }
}

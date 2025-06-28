import java.util.Scanner;

class Search_2D_Array {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("2D search\n");
        int[][] numArr=Array_Utility.input2D_Array();
        System.out.println("Enter the number you want to search: ");
        int num=s.nextInt();
        boolean isFound=search(numArr,num);
        if(isFound) {
            System.out.println("Your number is found.");
        }
            else{
                System.out.println("Your number is not found");
            }
        }

    public static boolean search(int[][] numArr,int num){

        int i=0;
        while(i<numArr.length){
            int j=0;
            while (j<numArr[i].length){
                if (numArr[i][j]==num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;

    }
}

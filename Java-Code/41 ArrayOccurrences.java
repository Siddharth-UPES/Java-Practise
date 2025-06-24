import java.util.Scanner;
class ArrayOccurrences {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Showing the number of Array Occurrences\n");
        int [] numArr=Array_Utility.inputArray();
        System.out.println("Enter the number you want to find: ");
        int num=s.nextInt();
        int Occurrences=no0fOccurrences(numArr,num);
        System.out.println("Your elemnt was found "+Occurrences+" time in array");

    }
    public static int no0fOccurrences(int[] numArr,int num){
        int occ=0;
        int i=0;
        while (i<numArr.length) {
            if (numArr[i] == num) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}

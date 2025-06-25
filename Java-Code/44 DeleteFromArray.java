import java.util.Scanner;

class DeleteFromArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Show array Deletion\n");
        int[] numArr=Array_Utility.inputArray();
        System.out.println("Enter the element you want to delete:");
        int numToDelete=s.nextInt();

        int[] nemArr=delete_number(numArr,numToDelete);
        System.out.println("here is your new array");
        Array_Utility.displayArray(numArr);


    }
    public static int[] delete_number(int[] numArr,int numTodelete){
    int occ=ArrayOccurrences.no0fOccurrences(numArr,numTodelete);
   if(occ==0){
       return numArr;
   }
     int newSize=numArr.length-occ;
     int[] newArr=new int[newSize];

     int i=0 ,j=0;
     while(i<numArr.length){
         if(numArr[i] !=numTodelete){
             newArr[j]=numArr[i];
             j++;
         }
         i++;
     }
        return newArr;
    }


}

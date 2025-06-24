class Max_Min_Array {
    public static void main(String[] args) {

        System.out.println("Showing Max and Min element in the Array: ");
        int[] numArr=Array_Utility.inputArray();

        int max=Max(numArr);
        System.out.println("the max number is: "+max);

        int min=Min(numArr);
        System.out.println("the min number is: "+min);

    }
    public static int Max(int[] numArr){
        if (numArr.length==0){
            return Integer.MIN_VALUE;
        }
        int max=numArr[0];
        int i=1;
        while (i<numArr.length){
            if (max<numArr[i]){
                max=numArr[i];
            }
            i++;
        }
        return max;
    }
    public static int Min(int[] numArr){
        int min=Integer.MAX_VALUE;
        int i=0;
        while (i<numArr.length){
            if (min>numArr[i]){
                min=numArr[i];
            }
            i++;
        }
        return min;
    }
}


/**
 * The output is giving wrong info in the below code
 */
//class Max_Min_Array{
//    public static void main(String[] args) {
//        System.out.println("Checkin the max and min value");
//        int[] numArr=Array_Utility.inputArray();
//
//        int i=1;
//        int j=1;
//        int max=0;
//        int min=0;
//
//        while(i<numArr.length){
//            if(min>numArr[i]){
//                min=numArr[i];
//                System.out.println("the min value is "+min);
//            }
//            i++;
//            while(j<numArr.length){
//                if (max<numArr[i]){
//                    max=numArr[i];
//                    System.out.println("the max value is "+max);
//                }j++;
//            }
//
//        }
//
//    }
//
//}

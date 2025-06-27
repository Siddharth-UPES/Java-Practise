class ReversingArray {
    public static void main(String[] args) {
        System.out.println("Showing swaping the array:\n");
        int[] numArr=Array_Utility.inputArray();
        reverse(numArr);
        System.out.println("Your reverse utility is");
        Array_Utility.displayArray(numArr);
    }
    public static void reverse(int[]arr){
        int i=0;
        while(i<arr.length/2){
            int swap=arr[i];
            arr[i]=arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]=swap;
            i++;
        }

    }
}

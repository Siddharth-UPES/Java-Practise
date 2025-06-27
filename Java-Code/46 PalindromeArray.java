class PalindromeArray {
    public static void main(String[] args) {
        System.out.println("Checking array is palindrome or not\n");
        int[] number=Array_Utility.inputArray();
        boolean isPalin=isPalindrome(number);
        if(isPalin){
            System.out.println("Your array is palindrome");
        }
        else {
            System.out.println("Your array is not palindrome");
        }
    }
    public static boolean isPalindrome(int[] numArr){
        int i=0;
        while(i<numArr.length/2){
            if (numArr[i] != numArr[(numArr.length-1)-i]){
                return false;
            }
            i++;
        }
        return true;
    }
}

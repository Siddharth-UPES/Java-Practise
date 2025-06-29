class Diagonal_Array {
    public static void main(String[] args) {
        System.out.println("Welcome to Diagonal Sum");
        int[][] numArr=Array_Utility.input2D_Array();
        long sum=sumOfDiagonals(numArr);
        System.out.println("Sum of the diagonals is:"+sum);

    }
    public static long sumOfDiagonals(int[][] numArr){
        long leftSum=sumOfLeftDiagonal(numArr);
        long RightSum=sumOfrigthDiagonal(numArr);
        long sum=leftSum+RightSum;
        if (numArr.length%2 !=0){
            int ind=numArr.length/2;
            sum -=numArr[ind][ind];
        }
        return sum;
    }
    public static long sumOfLeftDiagonal(int[][] numArr){
        long sum=0;
        int i=0;
        while(i<numArr.length){
            sum +=numArr[i][i];
            i++;
        }
        return sum;
    }
    public static long sumOfrigthDiagonal(int[][] numArr){
        long sum=0;
        int i=0;
        while(i<numArr.length){
            int col= numArr.length-1-i;
            sum +=numArr[i][col];
            i++;

        }
        return sum;
    }

}

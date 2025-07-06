public class Array {
    public static void main(String[] args) {
//        int[] myarr=new int[5];
//        myarr[0]=98;
//        myarr[3]=65;
//        myarr[1]=2;
//        myarr[2]=8;
//        myarr[4]=78;

        int[] myarr={98,2,8,65,78};
       // int index=2;

//        System.out.println(myarr[0]);
//        System.out.println(myarr[1]);
//        System.out.println(myarr[index]);
//        System.out.println(myarr[3]);
//        System.out.println(myarr[4]);


        // Array traversal
        int index=0;
        while(index<myarr.length){
            System.out.println(myarr[index]);
            index++;
        }
        System.out.println("\n");


        String[] arr=new String[4];
        arr[0]="My String";
        String[] newstrArr={"first","second","Third"};
        System.out.println(newstrArr.length);

    }
}

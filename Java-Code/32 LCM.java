import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Wlecome to LCM");
        System.out.println("Enter first number: ");
        int first=s.nextInt();
        System.out.println("Enter Second number:");
        int second=s.nextInt();
        int lcm=lcm(first,second);
        System.out.println("LCM of the two number is:" +lcm);

    }
    public static int lcm(int first,int second){
        int i=1;
        while(true){
            int factor=first*i;
            if(factor%second==0){
                return factor;
            }
            i++;
        }
    }
}

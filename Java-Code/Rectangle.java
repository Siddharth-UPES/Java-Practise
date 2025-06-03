import java.util.Scanner;
class Rectangle
{
	public static void main(String[] args)
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle:");
		int length=getintInput(t);
		
		System.out.println("Enter the width of the rectangel:");
		double width=getintInput(t);

		
		int area=length*width;

		System.out.println("The area of rectangle is::"+area);
	}
}
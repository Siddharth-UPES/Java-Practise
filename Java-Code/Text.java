class Text
{
	int i=100;
	public static void main(String... args)
	{
		Text a = new Text();
		System.out.println(a.i);
		a.m1();
	}
	public void m1()
	{
		System.out.println(i);
	}
}
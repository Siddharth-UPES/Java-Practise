class ExampleSwitch
{
	public static void main(String[] args)
	{
		byte b =10;
		switch(b)
		{
			case 10:
				System.out.println("10");
			case 100:
				System.out.println("100");
			case 127:     			// founding error when we put out of range case number
				System.out.println("1000");
		}
	}
}
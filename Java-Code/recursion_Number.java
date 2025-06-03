class Test
{
	public static void main(String... args)
	{
		rec(4,69);
	}
	public static void rec(int stNum,int endNum)
	{
		if(stNum<=endNum)
		{
			System.out.println(stNum);	
			stNum++;
			rec(stNum,endNum);
		}
	}
	
}
// Print "hello" without using semicolon

class Test
{
	public static void main(String[] args)
	{
		if(System.out.printf("Hello World 1"+"\n") ==null){}

		if(System.out.append("Hello World 2"+"\n")==null){}

		if(System.out.append("Hello World 3"+"\n").equals(null)){}

		for(int i=0;i<1;System.out.print("Hello World 4\n")){ i++;}
	}
}
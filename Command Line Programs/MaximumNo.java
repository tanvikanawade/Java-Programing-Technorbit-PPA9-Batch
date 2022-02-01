class MaximumNo
{
	public static void main(String args[])
	{
		int len =args.length;
		int max=0,temp;
		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		int c= Integer.parseInt(args[2]);
		
		for(int i=0;i<len;i++)
		{
			temp = Integer.parseInt(args[i]);
			if(max<temp)
			{
				max=temp;
			}
		}
		System.out.println(max);
	}
}
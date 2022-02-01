class armstrong
{
	public static void main(String args[])
	{
	int rev=0, rem=0,sum=0,temp;																					
	int n= Integer.parseInt(args[0]);
		
	temp=n;
	while(n>0)
	{
		n= n%10;
		rem=sum+(rev*rev*rev);
		sum = sum+rem;
		n=n/10;
	}
		
	if(temp==sum)
	{
		System.out.println("Amstrong Number");
	}
	else
	{
	System.out.println("Not Amstrong");
	}
	
	}
}
package LabExams;

public class OddNumbersSum 
{
	void sum()
	{
		int sum=0;
		System.out.println("Sum of Odd Numbers Between 7 to 21");
		for(int i=7;i<=21;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum ="+sum);
	}
	public static void main(String[] args) 
	{
		OddNumbersSum ons=new OddNumbersSum();
		ons.sum();
	}
}

import java.util.Scanner;
class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Year : ");
		int y = sc.nextInt();


		if(y % 4==0 && y % 10 != 0 || y % 400 == 0)
		{
			System.out.println(" It's a leap year ");
		}
		else
		{
			System.out.println(" It's not a leap year ");
		}
	}
}

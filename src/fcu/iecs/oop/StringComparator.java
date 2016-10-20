package fcu.iecs.oop;
import java.util.Scanner;
public class StringComparator 
{

	public static void main(String[] args) 
	{
		String string1,string2;
		int num;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入第1個字串:");
		string1 = sc.next();
		System.out.println("請輸入第2個字串:");
		string2 = sc.next();	
		
		num = string1.compareTo(string2);
		
		System.out.printf("Enter a string1:%s\n",string1);
		System.out.printf("Enter a string2:%s\n",string2);
		
		
		if(num == 0)
		{
			System.out.println("the same");
		}
		else if(num != 0)
		{
			while(num!=0)
			{
				System.out.println("not the same");
				System.out.println("請輸入第1個字串:");
				string1 = sc.next();
				System.out.println("請輸入第2個字串:");
				string2 = sc.next();	
				
				num = string1.compareTo(string2);
				
				System.out.printf("Enter a string1:%s\n",string1);
				System.out.printf("Enter a string2:%s\n",string2);
	
			}
			if(num==0)
			{
				System.out.println("the same");
			}
		}

	}
}



	



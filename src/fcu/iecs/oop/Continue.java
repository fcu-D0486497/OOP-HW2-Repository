package fcu.iecs.oop;
import java.util.Scanner;
public class Continue 
{

	public static void main(String[] args) 
	{
		int i;
		
		for(i = 0; i < 5; i ++) 
		{
			for(i = 0; i < 5; i ++) 
			{
				if(i == 1 || i == 3)
				{
					System.out.println(i);
				}
				else if(i == 0 || i==2)
				{
					continue;
				}
			}	
		}

	}

}

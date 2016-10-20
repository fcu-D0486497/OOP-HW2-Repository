package fcu.iecs.oop;
import java.util.Scanner;
public class Break 
{

	public static void main(String[] args) 
	{
		int i;
		for(i = 0; i < 5; i ++) 
		{
			if(i<2)
			{
				System.out.println(i);
			}

			else if(i>=2)
			{
				break;
			}
		}
	}

}

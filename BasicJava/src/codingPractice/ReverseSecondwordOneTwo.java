package codingPractice;

import java.util.Scanner;

public class ReverseSecondwordOneTwo 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name: ");
		String str = sc.nextLine();
		char[] arrChar = str.toCharArray();
		int index = str.indexOf(" ");
		int length = str.length()-1;
		System.out.println(length);
		for (int i = 0; i <= length; i++) 
		{
			System.out.print(arrChar[i]);
			if (index == i) 
			{
				for (int j = length; j >= index; j--) 
				{
					System.out.print(arrChar[j]);
				}
				break;
			}
		}

	}

}

package com.mayank.s1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FindDigits {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		 Scanner s=new Scanner(new File("D:\\Work\\Workplace\\PractiseAgain\\src\\input"));
			//Scanner s=new  Scanner(System.in);
			int T=s.nextInt();
			
			while(T>0)
			{
				int N=s.nextInt();
				int temp=N;
				int count=0;
				while(temp>0)
				{
					int a=temp%10;
					if(a!=0)
					{
						if(N%a==0)
							count++;
					}
					temp=temp/10;
				}
				System.out.println(count);
				T--;
			}

	}

}

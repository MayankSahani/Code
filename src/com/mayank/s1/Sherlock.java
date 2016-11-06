package com.mayank.s1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Sherlock {

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
			int a=s.nextInt();
			int b=s.nextInt();
			int count=0;
			for(int i=a;i<=b;i++)
			{
				if(check(i))
					count++;
			}
			System.out.println(count);
			T--;
		}

	}

	private static boolean check(int i) {
		
		double d=Math.sqrt(i);
		String str=""+d;
		if(str.length()==3)
			return true;
		else
		return false;
	
	}

	

}

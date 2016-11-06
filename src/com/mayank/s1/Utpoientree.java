package com.mayank.s1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Utpoientree {

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
				int height=1;
				for(int i=1;i<=N;i++)
				{
				if(i%2==1)
				{
					height*=2;
				}
				else
				{
					height+=1;
				}
				}
				System.out.println(height);
				
				T--;
			}

	}

}

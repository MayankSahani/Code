package com.mayank.s1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Long {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		 Scanner s=new Scanner(new File("D:\\Work\\Workplace\\PractiseAgain\\src\\input"));
			//Scanner s=new  Scanner(System.in);
			int T=s.nextInt();
			
			while(T>0)
			{	int arr[]=new int[500];
				int N=s.nextInt();
				for(int i=0;i<N;i++)
				{
					arr[s.nextInt()]=1;
				}
				int count=0;
				int max=0;
				for(int i=0;i<500;i++)
				{
					if(arr[i]==1)
						count++;
					else
					{
						if(max<count)
							max=count;
						count=0;
					}
						
				}
				System.out.println(max);
				T--;
			}
			
	}

}

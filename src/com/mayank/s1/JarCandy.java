package com.mayank.s1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class JarCandy {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(new File("D:\\Work\\Workplace\\PractiseAgain\\src\\input"));
			//Scanner s=new  Scanner(System.in);
			int T=s.nextInt();
			while(T>0)
			{
				int n=s.nextInt();
				int m=s.nextInt();
				int arr[]=new int[n];
				while(m>0)
				{
					int a=s.nextInt();
					int b=s.nextInt();
					int k=s.nextInt();
					System.out.println(a+"  "+b+"  "+k);
					for(int i=a-1;i<=b-1;i++)
					{
						arr[i]+=k;
					}
					for(int i=0;i<n;i++)
					{
						System.out.print(arr[i]+"  ");
					}
					System.out.println();
					m--;
				}
				int sum=0;
				for(int i=0;i<n;i++)
				{
					sum+=arr[i];
				}
				System.out.print(sum/n);
				T--;
			}
	}

}

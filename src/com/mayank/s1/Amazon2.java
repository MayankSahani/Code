package com.mayank.s1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Amazon2 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(new File("D:\\Work\\Workplace\\PractiseAgain\\src\\input"));
			//Scanner sc=new  Scanner(System.in);
		 int n=sc.nextInt();
		 String ft=sc.next();
		 String st=sc.next();
		 int q=sc.nextInt();
		 while(q>0)
		 {
			 int l=sc.nextInt();
			 int r=sc.nextInt();
			 int count1=0;
			 int count0=0;
			 int food1[]=new int[150];
			 int food0[]=new int[150];
			 int count=0;
			 for(int i=l;i<=r;i++)
			 {
				 if(st.charAt(i-1)=='1')
				 {
					 count1++;
					 food1[ft.charAt(i-1)]++;
				 }
				 else if(st.charAt(i-1)=='0')
				 {
					 count0++;
					 food0[ft.charAt(i-1)]++;
				 }
			 }
			 for(int i=0;i<150;i++)
			 {
				 count+=food1[i]*food0[i];
			 }
			// System.out.println(count1);
			 count+=fact(count1-1);
			
			 count+=fact(count0-1);
			 if(count>1000000000)
			 {
				 System.out.println("1000000000+"+count%1000000000);
			 }
			 else
			 System.out.println(count);
			 q--;
		 }
	}

	private static int fact(int count) {
		// TODO Auto-generated method stub
		if(count<1)
			return 0;
		int sum=1;
		for(int i=count;i>0;i--)
			sum*=i;
		return sum;
	}

}

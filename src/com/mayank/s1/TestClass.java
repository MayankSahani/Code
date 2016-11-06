package com.mayank.s1;

import java.io.File;

import java.util.Scanner;


public class TestClass {
	 public static void main(String args[] ) throws Exception {
		Scanner s=new Scanner(new File("D:\\Work\\Workplace\\PractiseAgain\\src\\input"));
			//Scanner s=new  Scanner(System.in);
		 int n=s.nextInt();
		

		 String items[]=new String[n];
		 int cost[]=new int[n];
		 for(int i=0;i<n;i++)
			 cost[i]=0;
		 int count[]=new int[n];
		 int i=0;
		 while(n>0)
		 {
			 items[i]=s.next();
			 //System.out.println(items[i]);
			 cost[i]=s.nextInt();
			 //System.out.println(cost[i]);
			 n--;
			 i++;
		 }
		 n=s.nextInt();
		 while(n>0)
		 {
			 String c=s.next();
			String c2= s.next();
			// System.out.println(c);
			 //System.out.println(c2);
			 if(c.equals("+"))
			 {
				 add(c2,count,items);
			 }
			 else if(c.equals("-"))
			 {
				 sub(c2,count,items);
			 }
			 else if(c.equals("?"))
			 {
				 count(c2,count,items,cost);
			 }
			 n--;
		 }
	 }

	private static void count(String next, int[] count, String[] items,int []cost) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<items.length;i++)
		{
			if(count[i]>0 && cost[i]>Integer.parseInt(next))
			{
				sum++;
			}
		}
		System.out.println(sum);
	}

	private static void sub(String next, int[] count, String[] items) {
		// TODO Auto-generated method stub
		for(int i=0;i<items.length;i++)
		{
			if(items[i].equals(next))
			{
				count[i]-=1;
				break;
			}
		}
	}

	private static void add(String next, int[] count, String[] items) {
		// TODO Auto-generated method stub
		for(int i=0;i<items.length;i++)
		{
			if(items[i].equals(next))
			{
				count[i]+=1;
				break;
			}
		}
	}
}

package com.mayank.s1;
import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;


public class Amazonfirst {
	 public static void main(String args[] ) throws Exception {
		 Scanner s=new Scanner(new File("D:\\Work\\Workplace\\PractiseAgain\\src\\input"));
			//Scanner s=new  Scanner(System.in);
			String str=s.next();
			//System.out.println(str);
			int t=s.nextInt();
			//System.out.println(t);
			int a,b;
			for(int i=0;i<t;i++)
			{
				a=s.nextInt();
				b=s.nextInt();
				a--;
				b--;
				//System.out.println(a+"  "+b);
				String str1=str.substring(a, b+1);
				//System.out.println(str1);
				if(str1.length()<9)
				check(str1);
				else
					check2(str1);
			}
	 }

	private static void check2(String str1) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int i=0,j=14;
		String carry="";
		while(true)
		{

		   BigInteger n=new BigInteger(carry+str1.substring(i, j));
			//int n=Integer.parseInt(carry+str1.substring(i, j));
			if(j==str1.length())
			{
				if(n.mod(new BigInteger("7")).equals(BigInteger.ZERO))
					System.out.println("YES");
				else
					System.out.println("NO");
				break;
			}
			else
			{
				i=j;
				if(i+14<=str1.length())
				j=i+14;
				else
					j=str1.length();
				carry=n.mod(new BigInteger("7"))+"";
			}
		}
		return;
	}

	private static void check(String str1) {
		// TODO Auto-generated method stub
		int i=0,j=2;
		String carry="";
		if(str1.length()==1)
		{
			if(Integer.parseInt(str1)==7||Integer.parseInt(str1)==0)
				System.out.println("YES");
			else
				System.out.println("NO");
			return;
		}
		while(true)
		{
			int n=Integer.parseInt(carry+str1.substring(i, j));
			int mod=n%7;
			if(j==str1.length())
			{
				if(mod==0)
					System.out.println("YES");
				else
					System.out.println("NO");
				break;
			}
			else
			{
				i=j;
				if(i+2<=str1.length())
				j=i+2;
				else
					j=str1.length();
				carry=mod+"";
			}
		}
		return;
	}
}

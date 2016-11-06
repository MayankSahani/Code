package com.mayank.s1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Permute {

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
			String str=s.next();
			permute(str ,0);
		}
	}

	private static void permute(String str,int k) {
		// TODO Auto-generated method stub
		if(k==str.length())
			return;
		char c[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			char temp=c[k];
			c[k]=c[i];
			c[i]=temp;
			StringBuffer sb=new StringBuffer("");
			for(int j=0;j<str.length();j++)
			{
			//sb.append(c);
			}
			System.out.println(c.toString());
			permute(c.toString(),k++);
			c=str.toCharArray();
		}
	}

}

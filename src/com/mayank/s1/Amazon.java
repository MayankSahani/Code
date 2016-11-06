package com.mayank.s1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Amazon {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(new File("D:\\Work\\Workplace\\PractiseAgain\\src\\input"));
			//Scanner sc=new  Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
		 {
		 String s=sc.next();
		 ArrayList<Object> ar=new ArrayList<Object>();
		 ar.add(s);
		 for(int i=s.length()-1;i>0;i--)
		 {
			 String s1=s.substring(0,i);
			 String s2=s.substring(i,s.length());
			 String s3=s2+s1;
			 if(!ar.contains(s3))
					 {
				 ar.add(s3);
				 System.out.println(s3);
					 }
		 }
		 System.out.println(ar.size());
		 t--;
		 }
		 
		 
	}

}
